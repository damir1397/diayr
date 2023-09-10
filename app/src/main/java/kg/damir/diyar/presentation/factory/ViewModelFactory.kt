package kg.damir.diyar.presentation.factory

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kg.damir.diyar.presentation.view_model.MenuViewModel


class ViewModelFactory (private val application: Application) : ViewModelProvider.Factory {

        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(MenuViewModel::class.java)) {
                @Suppress("UNCHECKED_CAST")
                return MenuViewModel(application) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }

}