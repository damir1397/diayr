package kg.cdt.diyar_guest.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kg.damir.diayr.data.network.model.GuestDto

data class DeliveryAddressesDto(
    @SerializedName("id") @Expose var id: Long = 0L,
    @SerializedName("uuid") @Expose var uuid: String? = null,
    @SerializedName("street_id") @Expose var street_id: Long? = 0L,
    @SerializedName("street_name") @Expose var street_name: String? = "",
    @SerializedName("town_number") @Expose var town_number: String? = "",
    @SerializedName("town_id") @Expose var town_id: Int? = 0,
    @SerializedName("flat") @Expose var flat: String? = null,
    @SerializedName("floor") @Expose var floor: String? = null,
    @SerializedName("intercom") @Expose var intercom: String? = null,
    @SerializedName("entrance") @Expose var entrance: String? = null,
    @SerializedName("latitude") @Expose var latitude: Double? = null,
    @SerializedName("longitude") @Expose var longitude: Double? = null,
    @SerializedName("guest_id") @Expose var guest_id: GuestDto? = null
)
