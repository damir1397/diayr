package kg.damir.diayr.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class PriceContainer(
    @SerializedName("id")
    @Expose
    var id: Long = 0L,
    @SerializedName("price")
    @Expose
    var price: Int = 0
)