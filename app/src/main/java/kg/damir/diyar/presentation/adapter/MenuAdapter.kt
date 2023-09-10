package kg.damir.diyar.presentation.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.ListAdapter
import com.bumptech.glide.Glide
import kg.damir.diyar.R
import kg.damir.diyar.data.network.model.MenuClientDto
import kg.damir.diyar.presentation.callBack.MenuItemDiffCallback
import kg.damir.diyar.presentation.holder.MenuViewHolder


class MenuAdapter(val context: Context) : ListAdapter<MenuClientDto, MenuViewHolder>(
    MenuItemDiffCallback()
) {
    private val TAG = this.javaClass.name

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.custom_menu_list, parent, false)
        return MenuViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        val item = getItem(position)
        with(holder) {
            var countMeal = 0
            menuCount.text = countMeal.toString()
            menuGram.text = item.dish_outlet + "${context?.getString(R.string.gram)}"
            menuPrise.text = item.price.toString() + " ${context?.getString(R.string.som)}"

            menuTitle.text = item.name_ky

            if (item.menu_photo != null) {
                menuPhoto.loadImage(item.menu_photo.toString())
            }

            plusCount.setOnClickListener {
                menuCount.text = (countMeal++).toString()
            }

            minusCount.setOnClickListener {
                menuCount.text = (if (countMeal > 0) {
                    countMeal--
                } else {
                    0
                }).toString()
            }

            dishImage.setOnClickListener {
            }
        }

    }


    fun ImageView.loadImage(image: String) {
        Glide
            .with(context)
            .load(image)
            .into(this)
    }

}