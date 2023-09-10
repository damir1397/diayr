package kg.damir.diayr.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

data class OSRMRouteResponseDto(
    @SerializedName("route") @Expose var route: MutableList<List<String>> = ArrayList(),
    @SerializedName("distance") @Expose var distance: String? = null,
    @SerializedName("duration") @Expose var duration: String? = null
)