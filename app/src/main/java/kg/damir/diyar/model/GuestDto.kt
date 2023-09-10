package kg.cdt.diyar_guest.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class GuestDto(
    @SerializedName("id") @Expose var id: Long = 0L,
    @SerializedName("uuid") @Expose var uuid: String? = null,
    @SerializedName("name") @Expose var name: String? = null,
    @SerializedName("surname") @Expose var surname: String? = null,
    @SerializedName("phone_number") @Expose var phone_number: String = "",
    @SerializedName("verify") @Expose var verify: Boolean? = false,
    @SerializedName("registered_push_token") @Expose var registered_push_token: String? = null,
    @SerializedName("app_version") @Expose var app_version: String? = null,
    @SerializedName("os_version") @Expose var os_version: String? = null,
    @SerializedName("remote_ip") @Expose var remote_ip: String? = null,
    @SerializedName("last_activity") @Expose var last_activity: String? = null
)
