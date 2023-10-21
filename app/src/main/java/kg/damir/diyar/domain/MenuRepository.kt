package kg.damir.diyar.domain

import androidx.lifecycle.LiveData
import kg.damir.diyar.data.network.model.MenuCategoryDto
import kg.damir.diyar.data.network.model.MenuClientDto

interface MenuRepository {
    fun getMenuList(): LiveData<List<MenuClientDto>>
    fun getMenuCategoryList(): LiveData<List<MenuCategoryDto>>
    fun loadData()
}