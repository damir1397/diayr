package kg.damir.diayr.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MenuClientDto(
    @SerializedName("id")
    @Expose
    var id: Long? = 0L,
    @SerializedName("name_en")
    @Expose
    var name_en: String? = null,
    @SerializedName("name_ru")
    @Expose
    var name_ru: String? = "",
    @SerializedName("name_ky")
    @Expose
    var name_ky: String? = "",
    @SerializedName("dish_outlet")
    @Expose
    var dish_outlet: String? = "",
    @SerializedName("price")
    @Expose
    var price: Int? = 0,
    @SerializedName("menu_category_id")
    @Expose
    var menu_category_id: MenuCategory? = null,
    @SerializedName("description")
    @Expose
    var description: String? = null,
    @SerializedName("create_time")
    @Expose
    var create_time: String? = null,
    @SerializedName("menu_photo")
    @Expose
    var menu_photo: String? = null,
    @SerializedName("price_container_id")
    @Expose
    var price_container_id: PriceContainer? = null,
    @SerializedName("count_container")
    @Expose
    var count_container: Int = 1,
    @SerializedName("popular")
    @Expose
    var popular: Boolean? = false
)