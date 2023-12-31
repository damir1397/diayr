package kg.damir.diyar.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class PriceDeliveredDto(
    @SerializedName("id") @Expose var id: Long = 0L,
    @SerializedName("uuid") @Expose var uuid: String? = null,
    @SerializedName("price") @Expose var price: Int = 0
) 
