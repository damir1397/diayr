package kg.damir.diayr.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "menu_category")
data class MenuCategoryDbModel(
@PrimaryKey
    var menuCategoryId: Long = 0L,
    var name_en: String? = null,
    var name_ru: String? = "",
    var name_ky: String? = "",
    var alias: String? = null,
    var create_time: String? = null,
    var sort_number: Int? = null,
    var category_view: String? = null,

)
