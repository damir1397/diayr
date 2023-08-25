package kg.damir.diayr.data.worker

import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.OneTimeWorkRequest
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkerParameters
import kg.damir.diayr.data.database.AppDatabase
import kg.damir.diayr.data.database.MenuCategoryDbModel
import kg.damir.diayr.data.database.MenuDbModel
import kg.damir.diayr.data.database.PriceContainerDbModel
import kg.damir.diayr.data.network.ApiFactory
import kg.damir.diayr.data.network.model.MenuCategory
import kg.damir.diayr.data.network.model.PriceContainer

import kotlinx.coroutines.delay

class RefreshDataWorker(context: Context, workerParameters: WorkerParameters) :
    CoroutineWorker(context, workerParameters) {
    private val coinInfoDao = AppDatabase.getInstance(context).menuDao()
    private val apiService = ApiFactory.apiService


    override suspend fun doWork(): Result {
        while (true) {
            try {
                val getMenuList = apiService.getMenuList()
               val list =  getMenuList.map {
                   val menuCategoryDbModel = MenuCategoryDbModel(
                       menuCategoryId = it.menu_category_id?.id ?: 0,
                       name_en = it.menu_category_id?.name_en ?: "",
                       name_ru = it.menu_category_id?.name_ru ?: "",
                       name_ky = it.menu_category_id?.name_ky ?: "",
                       alias = it.menu_category_id?.alias ?: "",
                       sort_number = it.menu_category_id?.sort_number,
                       category_view = it.menu_category_id?.category_view
                   )

                   val priceContainerDbModel = PriceContainerDbModel(
                       priceId = it.price_container_id?.id ?: 0,
                       price = it.price_container_id?.price ?: 0
                   )
                    MenuDbModel(
                        menu_id = it.id ?: 0,
                        name_ru = it.name_ru ?: "",
                        name_ky = it.name_ky ?: "",
                        name_en = it.name_en ?: "",
                        dish_outlet = it.dish_outlet ?: "",
                        price = it.price ?: 0,
                        menu_category_id = menuCategoryDbModel,
                        description = it.description ?: "",
                        menu_photo = it.menu_photo ?: "",
                        price_container_id = priceContainerDbModel,
                        count_container = it.count_container,
                        popular = it.popular ?: false

                    )
                }
                coinInfoDao.insertMenuList(list)
            } catch (e: Exception) {
                Log.e("worker" ,e.message.toString())
            }
            delay(100)
        }
    }

    companion object {
        const val NAME = "RefreshDataWorker"
        fun makeRequest(): OneTimeWorkRequest {
            return OneTimeWorkRequestBuilder<RefreshDataWorker>().build()
        }
    }


}