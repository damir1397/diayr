package kg.damir.diayr.presentation.callBack

import androidx.recyclerview.widget.DiffUtil
import kg.damir.diayr.data.network.model.MenuClientDto

class MenuItemDiffCallback : DiffUtil.ItemCallback<MenuClientDto>() {
    override fun areItemsTheSame(oldItem: MenuClientDto, newItem: MenuClientDto): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: MenuClientDto, newItem: MenuClientDto): Boolean {
        return oldItem == newItem
    }
}