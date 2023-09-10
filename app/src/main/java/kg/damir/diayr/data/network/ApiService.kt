package kg.damir.diayr.data.network

import kg.damir.diayr.data.network.model.BaseResponseDto
import retrofit2.http.POST


interface ApiService {

    @POST("rest/users/get-menu-list")
   suspend fun getMenuList(): BaseResponseDto


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