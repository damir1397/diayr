package kg.damir.diayr.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class EmployeeDto(
    @SerializedName("id") @Expose var id: Long = 0L,
    @SerializedName("uuid") @Expose var uuid: String? = null,
    @SerializedName("second_name") @Expose var second_name: String = "",
    @SerializedName("name") @Expose var name: String = "",
    @SerializedName("last_name") @Expose var last_name: String? = null,
    @SerializedName("phone") @Expose var phone: String = "",
    @SerializedName("address") @Expose var address: String? = null,
    @SerializedName("birth_date") @Expose var birth_date: String? = null,
    @SerializedName("password") @Expose var password: String = "",
    @SerializedName("description") @Expose var description: String? = null,
    @SerializedName("registered_push_token") @Expose var registered_push_token: String? = null,
    @SerializedName("app_version") @Expose var app_version: String? = null,
    @SerializedName("os_version") @Expose var os_version: String? = null,
    @SerializedName("remote_ip") @Expose var remote_ip: String? = null,
    @SerializedName("last_activity") @Expose var last_activity: String? = null,
    @SerializedName("last_login") @Expose var last_login: String? = null,
    @SerializedName("state_number") @Expose var state_number: String? = null,
    @SerializedName("brand") @Expose var brand: String? = null
)
