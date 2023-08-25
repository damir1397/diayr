package kg.damir.diayr.data.repository

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import androidx.work.ExistingWorkPolicy
import androidx.work.WorkManager
import kg.damir.diayr.data.database.AppDatabase
import kg.damir.diayr.data.network.ApiFactory
import kg.damir.diayr.data.network.model.MenuCategory
import kg.damir.diayr.data.network.model.MenuClientDto
import kg.damir.diayr.data.network.model.PriceContainer
import kg.damir.diayr.data.worker.RefreshDataWorker
import kg.damir.diayr.domain.MenuRepository

class MenuRepositoryImpl(
    private val application: Application
) : MenuRepository {
    private val menuDao = AppDatabase.getInstance(application).menuDao()
    private val apiService = ApiFactory.apiService

    override fun getMenuList(): LiveData<List<MenuClientDto>> {
        return Transformations.map(menuDao.getMenuList()) { coinInfoDbModelsList ->
            coinInfoDbModelsList.map {
                val menuCategory = MenuCategory(
                    id = it.menu_category_id.menuCategoryId,
                    name_en = it.menu_category_id.name_en,
                    name_ru = it.menu_category_id.name_ru,
                    name_ky = it.menu_category_id.name_ky,
                    alias = it.menu_category_id.alias,
                    sort_number = it.menu_category_id.sort_number,
                    category_view = it.menu_category_id.category_view
                )

                val priceContainer = PriceContainer(
                    id = it.price_container_id.priceId,
                    price = it.price_container_id.price
                )
                MenuClientDto(
                    id = it.menu_id,
                    name_en = it.name_en,
                    name_ru = it.name_ru,
                    name_ky = it.name_ky,
                    dish_outlet = it.dish_outlet,
                    price = it.price,
                    menu_category_id = menuCategory,
                    description = it.description,
                    menu_photo = it.menu_photo,
                    price_container_id = priceContainer,
                    count_container = it.count_container,
                    popular = it.popular
                )
            }
        }
    }


    override fun loadData() {
        val workManager = WorkManager.getInstance(application)
        workManager.enqueueUniqueWork(
            RefreshDataWorker.NAME,
            ExistingWorkPolicy.REPLACE,
            RefreshDataWorker.makeRequest()
        )
    }
}