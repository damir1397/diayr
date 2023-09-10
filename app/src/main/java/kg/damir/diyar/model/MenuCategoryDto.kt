package kg.cdt.diyar_guest.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MenuCategoryDto(
    @SerializedName("id") @Expose var id: Long = 0L,
    @SerializedName("name_en") @Expose var name_en: String? = null,
    @SerializedName("name_ru") @Expose var name_ru: String? = "",
    @SerializedName("name_ky") @Expose var name_ky: String? = "",
    @SerializedName("alias") @Expose var alias: String? = null,
    @SerializedName("create_time") @Expose var create_time: String? = null,
    @SerializedName("sort_number") @Expose var sort_number: Int? = null,
    @SerializedName("category_view") @Expose var category_view: String? = null,

    )
