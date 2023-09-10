package kg.damir.diyar.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class SliderListDto(
    @SerializedName("id") @Expose var id: Long? = 0L,
    @SerializedName("slider_photo") @Expose var slider_photo: String? = null
)
