package kg.damir.diyar.utils

import android.content.Context
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import kg.damir.diyar.R

fun showError(textView: TextView, error: String, TAG: String) {
    try {
        textView.error = error
    } catch (e: Exception) {
        Log.d(TAG, e.message, e)
    }
}

fun showErrorWithRequestFocus(textView: TextView, error: String, TAG: String) {
    try {
        textView.error = error
        textView.requestFocus()
    } catch (e: Exception) {
        Log.d(TAG, e.message, e)
    }
}


fun ImageView.loadImage(image: String) {
    Glide
        .with(context)
        .load(image)
        .placeholder(R.drawable.progres_bar)
        .into(this)
}

fun TextView.changeColorOrange(context: Context) {
    context.resources?.getColor(R.color.white)?.let { it1 -> this.setTextColor(it1) }
    this.background =
        context.let { it1 -> ContextCompat.getDrawable(it1, R.drawable.tab_layout_styles) }
}

fun TextView.changeColorWhite(context: Context) {
    context.resources?.getColor(R.color.default_color_text_gray)
        ?.let { it1 -> this.setTextColor(it1) }
    this.background = context.let { it1 -> ContextCompat.getDrawable(it1, R.color.white) }
}