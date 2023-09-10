package kg.damir.diayr.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import kg.damir.diayr.databinding.ActivityMenuBinding
import kg.damir.diayr.presentation.adapter.MenuAdapter
import kg.damir.diayr.presentation.factory.ViewModelFactory
import kg.damir.diayr.presentation.view_model.MenuViewModel

class MenuActivity : AppCompatActivity() {


    val binding by lazy { ActivityMenuBinding.inflate(layoutInflater) }
    private lateinit var viewModel: MenuViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val adapter = MenuAdapter(this)
        val recycleViewMenu = binding.recycleViewMenu
        recycleViewMenu.layoutManager = GridLayoutManager(this, 2)
        recycleViewMenu.adapter = adapter

        val viewModelFactory = ViewModelFactory(application)
        viewModel = ViewModelProvider(this, viewModelFactory)[MenuViewModel::class.java]
        viewModel.getMenuList.observe(this) {
            adapter.submitList(it)
        }
    }

}