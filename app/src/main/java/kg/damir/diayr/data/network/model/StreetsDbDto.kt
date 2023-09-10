package kg.damir.diayr.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class StreetsDbDto(
    @SerializedName("id") @Expose var id: Long = 0L,
    @SerializedName("name") @Expose var name: String? = "",
    @SerializedName("city") @Expose var city: String? = "",
    @SerializedName("building") @Expose var building: String? = "",
    @SerializedName("purpose") @Expose var purpose: String? = "",
    @SerializedName("type") @Expose var type: String? = "",
    @SerializedName("latitude") @Expose var latitude: Double? = null,
    @SerializedName("longitude") @Expose var longitude: Double? = null
) 
