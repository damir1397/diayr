package kg.damir.diyar.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class StatusDto(
    @SerializedName("id") @Expose var id: Long = 0L,
    @SerializedName("uuid") @Expose var uuid: String? = null,
    @SerializedName("alias") @Expose var alias: String = "",
    @SerializedName("status_ru") @Expose var status_ru: String? = "",
    @SerializedName("status_ky") @Expose var status_ky: String? = "",
    @SerializedName("status_en") @Expose var status_en: String? = null,
    @SerializedName("description") @Expose var description: String? = null
)
