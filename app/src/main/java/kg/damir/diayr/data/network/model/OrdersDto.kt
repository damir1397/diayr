package kg.damir.diayr.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.Calendar

data class OrdersDto(
    @SerializedName("id") @Expose var id: Long? = null,
    @SerializedName("uuid") @Expose var uuid: String? = null,
    @SerializedName("guest_id") @Expose var guest_id: GuestDto? = null,
    @SerializedName("employee") @Expose var employee: EmployeeDto? = null,
    @SerializedName("status_id") @Expose var status_id: StatusDto? = null,
    @SerializedName("menu") @Expose var menu: MenuClientDto? = null,
    @SerializedName("count") @Expose var count: Int? = 0,
    @SerializedName("numbers_orders") @Expose var numbers_orders: Int? = 0,
    @SerializedName("time_processing") @Expose var time_processing: String? = null,
    @SerializedName("time_accepted") @Expose var time_accepted: String? = null,
    @SerializedName("time_transferred_kitchen") @Expose var time_transferred_kitchen: String? = null,
    @SerializedName("time_transferred_courier") @Expose var time_transferred_courier: String? = null,
    @SerializedName("time_delivered") @Expose var time_delivered: String? = null,
    @SerializedName("time_canceled") @Expose var time_canceled: Calendar? = null,
    @SerializedName("price_delivered_id") @Expose var price_delivered_id: PriceDeliveredDto? = null,
    @SerializedName("create_time") @Expose var create_time: String? = null,
    @SerializedName("deleted") @Expose var deleted: Boolean = false,
    @SerializedName("deliveryAddresses") @Expose var deliveryAddresses: DeliveryAddressesDto? = null,
    @SerializedName("comment") @Expose var comment: String? = null,
    @SerializedName("surrender") @Expose var surrender: String? = null,
    @SerializedName("delivery") @Expose var delivery: Boolean? = null,
    @SerializedName("payment_method") @Expose var payment_method: String? = null,
    @SerializedName("payment_numbers") @Expose var payment_numbers: String? = null,
    @SerializedName("payment_status") @Expose var payment_status: Boolean? = null,
    @SerializedName("payment_id") @Expose var payment_id: String? = null,
    @SerializedName("prepare_for") @Expose var prepare_for: String? = null,
    @SerializedName("discount") @Expose var discount: Int? = 0
)
