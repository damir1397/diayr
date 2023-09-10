package kg.damir.diyar.presentation.view_model

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kg.damir.diyar.data.repository.MenuRepositoryImpl
import kg.damir.diyar.domain.GetMenuCategoryUseCase
import kg.damir.diyar.domain.GetMenuListUseCase
import kg.damir.diyar.domain.LoadDateUseCase
import kotlinx.coroutines.launch

class MenuViewModel(application: Application) : ViewModel() {

    private val repository = MenuRepositoryImpl(application)

    private  val getMenuListUseCase = GetMenuListUseCase(repository)
    private  val loadDateUseCase = LoadDateUseCase(repository)
    private  val getMenuCategoryUseCase = GetMenuCategoryUseCase(repository)


    val getMenuList = getMenuListUseCase()
    val getMenuCategoryList = getMenuCategoryUseCase()


    init {
        viewModelScope.launch {
            loadDateUseCase()
        }
    }

}