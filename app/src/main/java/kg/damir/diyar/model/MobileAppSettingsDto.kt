package kg.cdt.diyar_guest.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MobileAppSettingsDto(
    @SerializedName("id") @Expose var id: Long = 0L,
    @SerializedName("geo_min_distance") @Expose var geo_min_distance: Long = 30L,
    @SerializedName("geo_min_time") @Expose var geo_min_time: Long = 30L,
    @SerializedName("geo_timer_second") @Expose var geo_timer_second: Long = 60L,
    @SerializedName("use_geo_network") @Expose var use_geo_network: Boolean = true,
    @SerializedName("discount") @Expose var discount: Int? = null
)