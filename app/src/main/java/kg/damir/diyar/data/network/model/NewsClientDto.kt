package kg.damir.diyar.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class NewsClientDto(
    @SerializedName("id") @Expose var id: Long = 0L,
    @SerializedName("heading_ru") @Expose var heading_ru: String? = "",
    @SerializedName("heading_kg") @Expose var heading_kg: String? = "",
    @SerializedName("text_ru") @Expose var text_ru: String? = "",
    @SerializedName("text_kg") @Expose var text_kg: String? = "",
    @SerializedName("news_photo") @Expose var news_photo: String? = null,
    @SerializedName("create_time") @Expose var create_time: String? = null,
    @SerializedName("active") @Expose var active: Boolean? = false
)
