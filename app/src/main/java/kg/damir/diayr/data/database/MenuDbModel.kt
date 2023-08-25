package kg.damir.diayr.data.database

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kg.damir.diayr.data.network.model.MenuCategory
import kg.damir.diayr.data.network.model.PriceContainer

@Entity(tableName = "menu")
data class MenuDbModel(
    @PrimaryKey
    var menu_id: Long,
    var name_en: String,
    var name_ru: String,
    var name_ky: String,
    var dish_outlet: String,
    var price: Int,

    @Embedded(prefix = "menu_category_")
    var menu_category_id: MenuCategoryDbModel,
    var description: String,
    var menu_photo: String,
    @Embedded(prefix = "price_container_")
    var price_container_id: PriceContainerDbModel,
    var count_container: Int,
    var popular: Boolean
)
