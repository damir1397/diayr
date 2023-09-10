package kg.damir.diyar.presentation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import kg.damir.diyar.data.network.model.MenuCategoryDto
import kg.damir.diyar.databinding.CustomTabCategoryMenuListBinding
import kg.damir.diyar.presentation.callBack.MenuCategoryItemDiffCallback
import kg.damir.diyar.presentation.holder.MenuCategoryViewHolder
import kg.damir.diyar.utils.changeColorOrange
import kg.damir.diyar.utils.changeColorWhite
import kotlin.let as let1


class MenuCategoryAdapter(private val context: Context) : ListAdapter<MenuCategoryDto, MenuCategoryViewHolder>(MenuCategoryItemDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuCategoryViewHolder {
        val binding = CustomTabCategoryMenuListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MenuCategoryViewHolder(binding)
    }
    private var selectedItem = 0


    override fun onBindViewHolder(holder: MenuCategoryViewHolder, position: Int) {
        val item = getItem(position)

        holder.binding.menuCategoryName.text = item.name_ru

        context.let1 { it1 -> holder.binding.menuCategoryName.changeColorWhite(it1) }

        holder.itemView.setOnClickListener {
            selectedItem = position

                clickCategory?.invoke(item)
        }
        if (selectedItem == position) {
            context.let1 { it1 -> holder.binding.menuCategoryName.changeColorOrange(it1) }
        } else {
            context.let1 { it1 -> holder.binding.menuCategoryName.changeColorWhite(it1) }
        }
    }

    companion object {
        var clickCategory: ((MenuCategoryDto) -> Unit)? = null

    }

}