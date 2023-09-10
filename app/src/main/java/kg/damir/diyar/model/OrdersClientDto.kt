package kg.cdt.diyar_guest.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kg.damir.diyar.data.network.model.DeliveryAddressesDto
import kg.damir.diyar.data.network.model.EmployeeDto
import kg.damir.diyar.data.network.model.GuestDto
import kg.damir.diyar.data.network.model.MenuClientDto
import kg.damir.diyar.data.network.model.PriceDeliveredDto
import kg.damir.diyar.data.network.model.StatusDto

data class OrdersClientDto(
    @SerializedName("id") @Expose var id: Long = 0L,
    @SerializedName("guest_id") @Expose var guest_id: GuestDto? = null,
    @SerializedName("employee") @Expose var employee: EmployeeDto? = null,
    @SerializedName("menu") @Expose var menu: MenuClientDto? = null,
    @SerializedName("status_id") @Expose var status_id: StatusDto? = null,
    @SerializedName("count") @Expose var count: Int? = 0,
    @SerializedName("numbers_orders") @Expose var numbers_orders: Int? = 0,
    @SerializedName("time_processing") @Expose var time_processing: String? = null,
    @SerializedName("time_accepted") @Expose var time_accepted: String? = null,
    @SerializedName("time_transferred_kitchen") @Expose var time_transferred_kitchen: String? = null,
    @SerializedName("time_transferred_courier") @Expose var time_transferred_courier: String? = null,
    @SerializedName("time_delivered") @Expose var time_delivered: String? = null,
    @SerializedName("time_canceled") @Expose var time_canceled: String? = null,
    @SerializedName("price_delivered_id") @Expose var price_delivered_id: PriceDeliveredDto? = null,
    @SerializedName("create_time") @Expose var create_time: String? = null,
    @SerializedName("surrender") @Expose var surrender: String? = null,
    @SerializedName("delivery") @Expose var delivery: Boolean? = null,
    @SerializedName("deliveryAddresses") @Expose var deliveryAddresses: DeliveryAddressesDto? = null,
    @SerializedName("discount") @Expose var discount: Int? = 0
)