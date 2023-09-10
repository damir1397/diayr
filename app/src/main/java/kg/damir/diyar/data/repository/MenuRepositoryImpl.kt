package kg.damir.diyar.data.repository

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import androidx.work.ExistingWorkPolicy
import androidx.work.WorkManager
import kg.damir.diyar.data.database.AppDatabase
import kg.damir.diyar.data.mapper.MenuCategoryMapper
import kg.damir.diyar.data.mapper.MenuClientMapper
import kg.damir.diyar.data.network.model.MenuCategoryDto
import kg.damir.diyar.data.network.model.MenuClientDto
import kg.damir.diyar.data.worker.RefreshDataWorker
import kg.damir.diyar.domain.MenuRepository


class MenuRepositoryImpl(
    private val application: Application
) : MenuRepository {
    private val dao = AppDatabase.getInstance(application)
    private val menuClientMapper = MenuClientMapper()
    private val menuCategoryMapper = MenuCategoryMapper()

    override fun getMenuList(): LiveData<List<MenuClientDto>> {
        return Transformations.map(dao.menuDao().getMenuList()) { coinInfoDbModelsList ->
            coinInfoDbModelsList.map {
                menuClientMapper.mapMenuDbModelToMenuClientDto(it)
            }
        }
    }

    override fun getMenuCategoryList(): LiveData<List<MenuCategoryDto>> {
        return Transformations.map(
            dao.menuCategoryDao().getMenuCategory()
        ) { coinInfoDbModelsList ->
            coinInfoDbModelsList.map {
                menuCategoryMapper.mapMenuCategoryDbModelToMenuCategoryDto(it)
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