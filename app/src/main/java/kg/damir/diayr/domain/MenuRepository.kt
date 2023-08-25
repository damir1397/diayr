package kg.damir.diayr.domain

import androidx.lifecycle.LiveData
import kg.damir.diayr.data.network.model.MenuClientDto

interface MenuRepository {
    fun getMenuList(): LiveData<List<MenuClientDto>>

    fun loadData()
}