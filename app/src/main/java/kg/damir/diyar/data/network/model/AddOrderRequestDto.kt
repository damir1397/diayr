package kg.damir.diyar.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class AddOrderRequestDto(
    @SerializedName("name") @Expose val name: String? = "",
    @SerializedName("surName") @Expose val surName: String? = "",
    @SerializedName("phone") @Expose val phone: String? = "",
    @SerializedName("streetName") @Expose val streetName: String? = "",
    @SerializedName("townNumber") @Expose val townNumber: String? = "",
    @SerializedName("flat") @Expose val flat: String? = "",
    @SerializedName("floor") @Expose val floor: String? = "",
    @SerializedName("entrance") @Expose val entrance: String? = "",
    @SerializedName("intercom") @Expose val intercom: String? = "",
    @SerializedName("latitude") @Expose val latitude: String? = "",
    @SerializedName("longitude") @Expose val longitude: String? = "",
    @SerializedName("menuId") @Expose val menuId: Long? = 0,
    @SerializedName("count") @Expose val count: Int? = 0,
    @SerializedName("comment") @Expose val comment: String? = "",
    @SerializedName("surrender") @Expose var surrender: String? = "",
    @SerializedName("delivery") @Expose var delivery: Boolean? = null,
    @SerializedName("registered_push_token") @Expose var registered_push_token: String? = null,
    @SerializedName("app_version") @Expose var app_version: String? = null,
    @SerializedName("os_version") @Expose var os_version: String? = null,
    @SerializedName("payment_method") @Expose var payment_method: String? = null,
    @SerializedName("payment_numbers") @Expose var payment_numbers: String? = null,
    @SerializedName("payment_status") @Expose var payment_status: Boolean? = null,
    @SerializedName("payment_id") @Expose var payment_id: String? = null,
    @SerializedName("prepare_for") @Expose var prepare_for: String? = null,
    @SerializedName("sum_to_pay") @Expose var sum_to_pay: String? = null,
    @SerializedName("street_number_id") @Expose var street_number_id: Int? = null,
    @SerializedName("discount") @Expose var discount: Int? = 0
)