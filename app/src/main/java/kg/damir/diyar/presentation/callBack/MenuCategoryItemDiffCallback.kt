package kg.damir.diyar.presentation.callBack

import androidx.recyclerview.widget.DiffUtil
import kg.damir.diyar.data.network.model.MenuCategoryDto

class MenuCategoryItemDiffCallback : DiffUtil.ItemCallback<MenuCategoryDto>() {

    override fun areItemsTheSame(oldItem: MenuCategoryDto, newItem: MenuCategoryDto): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: MenuCategoryDto, newItem: MenuCategoryDto): Boolean {
        return oldItem == newItem
    }
}