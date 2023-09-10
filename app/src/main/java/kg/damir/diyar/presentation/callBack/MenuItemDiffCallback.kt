package kg.damir.diyar.presentation.callBack

import androidx.recyclerview.widget.DiffUtil
import kg.damir.diyar.data.network.model.MenuClientDto

class MenuItemDiffCallback : DiffUtil.ItemCallback<MenuClientDto>() {
    override fun areItemsTheSame(oldItem: MenuClientDto, newItem: MenuClientDto): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: MenuClientDto, newItem: MenuClientDto): Boolean {
        return oldItem == newItem
    }
}