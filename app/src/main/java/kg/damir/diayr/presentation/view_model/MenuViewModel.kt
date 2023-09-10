package kg.damir.diayr.presentation.view_model

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kg.damir.diayr.data.repository.MenuRepositoryImpl
import kg.damir.diayr.domain.GetMenuListUseCase
import kg.damir.diayr.domain.LoadDateUseCase
import kotlinx.coroutines.launch

class MenuViewModel(application: Application) : ViewModel() {

    private val repository = MenuRepositoryImpl(application)

    private  val getMenuListUseCase = GetMenuListUseCase(repository)
    private  val loadDateUseCase = LoadDateUseCase(repository)


    val getMenuList = getMenuListUseCase()


    init {
        viewModelScope.launch {
            loadDateUseCase()
        }
    }

}