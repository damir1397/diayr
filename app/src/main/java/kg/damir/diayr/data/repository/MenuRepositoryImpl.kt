package kg.damir.diayr.data.repository

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import androidx.work.ExistingWorkPolicy
import androidx.work.WorkManager
import kg.damir.diayr.data.database.AppDatabase
import kg.damir.diayr.data.database.MenuDbModel
import kg.damir.diayr.data.mapper.MenuClientMapper
import kg.damir.diayr.data.network.model.MenuCategoryDto
import kg.damir.diayr.data.network.model.MenuClientDto
import kg.damir.diayr.data.network.model.PriceContainerDto
import kg.damir.diayr.data.worker.RefreshDataWorker
import kg.damir.diayr.domain.MenuRepository


class MenuRepositoryImpl(
    private val application: Application
) : MenuRepository {
    private val menuDao = AppDatabase.getInstance(application).menuDao()
    private val menuClientMapper = MenuClientMapper()

    override fun getMenuList(): LiveData<List<MenuClientDto>> {
        return Transformations.map(menuDao.getMenuList()) { coinInfoDbModelsList ->
            coinInfoDbModelsList.map {
                menuClientMapper.mapMenuDbModelToMenuClientDto(it)
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