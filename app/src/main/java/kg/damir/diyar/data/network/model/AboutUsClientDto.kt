package kg.damir.diyar.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class AboutUsClientDto(
    @SerializedName("id") @Expose var id: Long? = 0L,
    @SerializedName("heading_ru") @Expose var heading_ru: String? = "",
    @SerializedName("heading_kg") @Expose var heading_kg: String? = "",
    @SerializedName("text_ru") @Expose var text_ru: String? = "",
    @SerializedName("text_kg") @Expose var text_kg: String? = "",
    @SerializedName("photo_1") @Expose var photo_1: String? = null,
    @SerializedName("photo_2") @Expose var photo_2: String? = null,
    @SerializedName("photo_3") @Expose var photo_3: String? = null,
    @SerializedName("photo_4") @Expose var photo_4: String? = null,
    @SerializedName("photo_5") @Expose var photo_5: String? = null,
    @SerializedName("photo_6") @Expose var photo_6: String? = null,
    @SerializedName("photo_7") @Expose var photo_7: String? = null,
    @SerializedName("photo_8") @Expose var photo_8: String? = null,
    @SerializedName("photo_9") @Expose var photo_9: String? = null,
    @SerializedName("photo_10") @Expose var photo_10: String? = null,
    @SerializedName("create_time") @Expose var create_time: String? = null
)