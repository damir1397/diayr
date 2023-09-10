package kg.damir.diyar.data.worker

import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.OneTimeWorkRequest
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkerParameters
import kg.damir.diyar.data.database.AppDatabase
import kg.damir.diyar.data.mapper.MenuCategoryMapper
import kg.damir.diyar.data.mapper.MenuClientMapper
import kg.damir.diyar.data.network.ApiFactory
import kotlinx.coroutines.delay

class RefreshDataWorker(context: Context, workerParameters: WorkerParameters) :
    CoroutineWorker(context, workerParameters) {
    private val appDatabase = AppDatabase.getInstance(context)
    private val apiService = ApiFactory.apiService
    private val menuClientMapper = MenuClientMapper()
    private val menuCategoryMapper = MenuCategoryMapper()


    override suspend fun doWork(): Result {
        while (true) {
            try {
                menuClientSaveToDb()
                menuCategorySaveToDb()
            } catch (e: Exception) {
                Log.e("worker", e.message.toString())
            }
            delay(1000 * 60 * 60)
        }
    }

    private suspend fun menuClientSaveToDb() {
        val getMenuList = apiService.getMenuList("", "")
        val list = getMenuList.result?.client_get_menu_list?.map {
            menuClientMapper.mapMenuClientDtoToMenuDbModel(it)
        } ?: arrayListOf()
        appDatabase.menuDao().insertMenuList(list)
    }
    private suspend fun menuCategorySaveToDb() {
        val getMenuList = apiService.getMenuCategoryList()
        val list = getMenuList.result?.menu_category_list?.map {
            menuCategoryMapper.mapMenuMenuCategoryDtoToCategoryDbModel(it)
        } ?: arrayListOf()
        appDatabase.menuCategoryDao().insertMenuCategoryList(list)
    }

    companion object {
        const val NAME = "RefreshDataWorker"
        fun makeRequest(): OneTimeWorkRequest {
            return OneTimeWorkRequestBuilder<RefreshDataWorker>().build()
        }
    }

}