package kg.damir.diayr.presentation.holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import kg.damir.diayr.R


class MenuViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
    val menuGram: TextView =view.findViewById(R.id.menu_gram)
    val menuPrise: TextView =view.findViewById(R.id.menu_prise)
    val menuTitle: TextView =view.findViewById(R.id.menu_title)
    val menuPhoto: ImageView =view.findViewById(R.id.menu_photo)
    val menuCount: TextView =view.findViewById(R.id.menu_count)
    val plusCount: ImageView =view.findViewById(R.id.plus_count)
    val minusCount: ImageView =view.findViewById(R.id.minus_count)
    val countAnimate: TextView =view.findViewById(R.id.count_animate)
    val dishImage: CardView =view.findViewById(R.id.dish_image)
}