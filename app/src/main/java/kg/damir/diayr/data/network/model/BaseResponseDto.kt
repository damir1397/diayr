package kg.damir.diayr.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class BaseResponseDto(
    @SerializedName("success") @Expose val success: Boolean = false,
    @SerializedName("message") @Expose val message: String = "",
    @SerializedName("error") @Expose val error: String = "",
    @SerializedName("result") @Expose val result: Result? = null,
    @SerializedName("time") @Expose val time: String = "",
    @SerializedName("ver") @Expose val ver: String = ""
) {
    data class Result(
//        val delivery_osrm_route_response: OSRMRouteResponse? = null,
//        val delivery_mobile_app_settings: MobileAppSettings? = null,
        @SerializedName("client_get_menu_list") @Expose val client_get_menu_list: List<MenuClientDto>? = null,
        @SerializedName("client_get_news_list") @Expose val client_get_news_list: List<NewsClientDto>? = null,
        @SerializedName("client_get_slider_list") @Expose val client_get_slider_list: List<SliderListDto>? = null,
        @SerializedName("client_search_address_by_lat_lon") @Expose val client_search_address_by_lat_lon: List<StreetsNumberDto>? = null,
        @SerializedName("client_search_by_street_name") @Expose val client_search_by_street_name: List<StreetsDbDto>? = null,
        @SerializedName("client_about_us") @Expose val client_about_us: List<AboutUsClientDto>? = null,
        @SerializedName("client_orders_saved_info") @Expose val client_orders_saved_info: List<OrdersClientDto>? = null,
        @SerializedName("client_get_orders_history") @Expose val client_get_orders_history: List<OrdersHistoryClientDto>? = null,
        @SerializedName("client_guest_info") @Expose val client_guest_info: GuestDto? = null,
        @SerializedName("menu_category_list") @Expose val menu_category_list: List<MenuCategoryDto>? = null,
        @SerializedName("client_get_price_delivered") @Expose val client_get_price_delivered: StreetsNumberDto? = null,
        @SerializedName("client_check_work_time") @Expose val client_check_work_time: WorkTimeDto? = null

    )
}