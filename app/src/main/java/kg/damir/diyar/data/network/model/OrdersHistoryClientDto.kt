package kg.damir.diyar.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class OrdersHistoryClientDto(
    @SerializedName("id") @Expose var id: Long = 0L,
    @SerializedName("orders_id") @Expose var orders_id: OrdersClientDto? = null,
    @SerializedName("guest_id") @Expose var guest_id: GuestDto? = null,
    @SerializedName("status_id") @Expose var status_id: StatusDto? = null,
    @SerializedName("create_time") @Expose var create_time: String? = null,
)
