package kg.damir.diyar.data.network

import kg.damir.diyar.data.network.model.AddOrderRequestDto
import kg.damir.diyar.data.network.model.BaseResponseDto
import retrofit2.http.POST
import retrofit2.http.Query


interface ApiService {

    /**
     * try get user app settings
     */
    @POST(getMobileAppSettings)
    suspend fun getMobileAppSettings(): BaseResponseDto

    /**
     * try set registered push token
     */
    @POST(setRegisteredPushTokenUrlPrefix)
    suspend fun setRegisteredPushToken(
        @Query("phone") phone: String,
        @Query("registered_push_token") registered_push_token: String,
        @Query("app_version") app_version: String,
        os_version: String,
    ): BaseResponseDto


    /**
     * try get menu list
     */
    @POST(getMenuList)
    suspend fun getMenuList(
        @Query("name_dish") name_dish: String,
        @Query("local_lan") local_lan: String
    ): BaseResponseDto


    /**
     * try get news list
     */
    @POST(getNewsList)
    suspend fun getNewsList(
        @Query("offset") offset: Int = 0,
        @Query("limit") limit: Int = 30,
    ): BaseResponseDto

    /**
     * try slider list
     */
    @POST(getSliderList)
    suspend fun getSliderList(): BaseResponseDto


    /**
     * try search address by lat lon
     */

    @POST(searchAddressByLatLon)
    suspend fun searchAddressByLatLon(
        @Query("longitude") longitude: String,
        @Query("latitude") latitude: String,
        @Query("offset") offset: Int = 0,
        @Query("limit") limit: Int = 30
    ): BaseResponseDto


    /**
     * try search numbers town by street
     */
    @POST(searchNumbersTownByStreet)
    suspend fun searchNumbersTownByStreet(
        @Query("streetId") streetId: Long,
        @Query("number") number: String
    ): BaseResponseDto

    /**
     * try search address by street name
     */
    @POST(searchAddressByStreetName)
    suspend fun searchAddressByStreetName(
        @Query("name") name: String,
    ): BaseResponseDto

    /**
     * try get about us list
     */
    @POST(getAboutUsList)
    suspend fun getAboutUsList(): BaseResponseDto

    /**
     * try add order
     */
    @POST(addOrder)
    suspend fun addOrder(@Query("list_orders") list_orders: List<AddOrderRequestDto>): BaseResponseDto

    /**
     * try get orders history by guest
     */
    @POST(getListOrderHistoryByGuest)
    suspend fun getListOrderHistoryByGuest(@Query("phone") phone: String): BaseResponseDto

    /**
     * try get order by number order
     */
    @POST(getOrderListByNumberOrder)
    suspend fun getListOrderByNumberOrder(@Query("number_order") number_order: String): BaseResponseDto

    /**
     * try get menu category us list
     */
    @POST(getMenuCategoryList)
    suspend fun getMenuCategoryList(): BaseResponseDto

    /**
     * try get menu category us list
     */
    @POST(getPriceDelivered)
    suspend fun getPriceDelivered(@Query("number_id") number_id: Int): BaseResponseDto

    /**
     * checkWorkTime
     */
    @POST(checkWorkDay)
    suspend fun checkWorkDay(): BaseResponseDto

    companion object {
        const val loginUrlPrefix = "rest/users/login"
        const val logoutUrlPrefix = "rest/users/logout"
        const val getPersonalUrlPrefix = "rest/users/get-client-personal"
        const val setRegisteredPushTokenUrlPrefix = "rest/users/set-registered-push-token"
        const val getMobileAppSettings = "rest/users/get-mobile-app-settings"
        const val getMenuList = "rest/users/get-menu-list"
        const val getNewsList = "rest/users/get-news-list"
        const val getSliderList = "rest/users/get-slider-list"
        const val searchAddressByLatLon = "rest/users/search-address-by-lat-lon"
        const val searchAddressByStreetName = "rest/users/search-address-by-street-name"
        const val searchNumbersTownByStreet = "rest/users/search-numbers-town-by-street"
        const val getAboutUsList = "rest/users/get-about-us-list"
        const val addOrder = "rest/users/add-order"
        const val getOrderListByNumberOrder = "rest/users/get-list-orders-by-number-order"
        const val getListOrderHistoryByGuest = "rest/users/get-list-order-history-by-phone"
        const val getMenuCategoryList = "rest/users/get-menu-category-list"
        const val getPriceDelivered = "rest/users/get-price-delivered"
        const val checkWorkDay = "rest/users/check-work-time"
    }
}