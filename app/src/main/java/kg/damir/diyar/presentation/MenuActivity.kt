package kg.damir.diyar.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kg.damir.diyar.databinding.ActivityMenuBinding
import kg.damir.diyar.presentation.adapter.MenuAdapter
import kg.damir.diyar.presentation.adapter.MenuCategoryAdapter
import kg.damir.diyar.presentation.factory.ViewModelFactory
import kg.damir.diyar.presentation.view_model.MenuViewModel

class MenuActivity : AppCompatActivity() {


    val binding by lazy { ActivityMenuBinding.inflate(layoutInflater) }
    private lateinit var viewModel: MenuViewModel
    private val menuAdapter = MenuAdapter(this)
    private val menuCategoryAdapter = MenuCategoryAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initMenuClientAdapter()
        initMenuCategoryAdapter()
        val viewModelFactory = ViewModelFactory(application)
        viewModel = ViewModelProvider(this, viewModelFactory)[MenuViewModel::class.java]

        viewModel.getMenuList.observe(this) {
            menuAdapter.submitList(it)
        }

        viewModel.getMenuCategoryList.observe(this) {
            menuCategoryAdapter.submitList(it)
        }
    }

    private fun initMenuClientAdapter() {
        val recycleViewMenu = binding.recycleViewMenu
        recycleViewMenu.layoutManager = GridLayoutManager(this, 2)
        recycleViewMenu.adapter = menuAdapter
    }

    private fun initMenuCategoryAdapter() {
        binding.tabLayoutRecycleView.layoutManager =
            LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        binding.tabLayoutRecycleView.adapter = menuCategoryAdapter
    }

}