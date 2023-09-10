package kg.damir.diayr.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kg.damir.diayr.data.network.model.PriceDeliveredDto
import kg.damir.diayr.data.network.model.StreetsDbDto

data class StreetsNumberDto(
    @SerializedName("id") @Expose var id: Long = 0L,
    @SerializedName("streets_db_id") @Expose var streets_db_id: StreetsDbDto? = null,
    @SerializedName("number") @Expose var number: String? = "",
    @SerializedName("latitude") @Expose var latitude: Double? = null,
    @SerializedName("longitude") @Expose var longitude: Double? = null,
    @SerializedName("price_delivered_id") @Expose var price_delivered_id: PriceDeliveredDto? = null
)
