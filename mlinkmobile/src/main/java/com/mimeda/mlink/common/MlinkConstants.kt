package com.mimeda.mlink.common

internal object MlinkConstants {

    var appId: Int? = null
    var publisher: String? = null

    const val SHARED_PREF_NAME = "MLinkSharedPref"
    const val MLINK_UUID = "mLinkUUID"
    const val MLINK_TIME = "mLinkTime"
    const val MLINK_SESSION_ID = "mLinkSessionId"

    const val DATE_FORMAT = "dd.MM.yyyy HH:mm"
    const val THIRTY_MINUTES = 30 * 60 * 1000

    const val HOME = "Home"
    const val LISTING = "Listing"
    const val SEARCH = "Search"
    const val PRODUCT_DETAILS = "ProductDetails"
    const val CART = "Cart"
    const val PURCHASE = "Purchase"
    const val VIEW = "View"
    const val ADD_TO_CART = "AddToCart"
    const val SUCCESS = "Success"
    const val HOME_VIEW = "Home.View"
    const val HOME_ADD_TO_CART = "Home.AddToCart"
    const val LISTING_VIEW = "Listing.View"
    const val LISTING_ADD_TO_CART = "Listing.AddToCart"
    const val SEARCH_VIEW = "Search.View"
    const val SEARCH_ADD_TO_CART = "Search.AddToCart"
    const val PRODUCT_DETAILS_VIEW = "ProductDetails.View"
    const val PRODUCT_DETAILS_ADD_TO_CART = "ProductDetails.AddToCart"
    const val CART_VIEW = "Cart.View"
    const val PURCHASE_SUCCESS = "Purchase.Success"

    const val ANDROID = "Android"
    const val VERSION = "v"
    const val PUBLISHER = "&pub"
    const val APP_ID = "&appid"
    const val TIMESTAMP = "&t"
    const val DEVICE_ID = "&d"
    const val LANGUAGE = "&lng"
    const val PLATFORM = "&p"
    const val EVENT = "&en"
    const val EVENT_PAGE = "&ep"
    const val AID = "&aid"
    const val USER_ID = "&uid"
    const val SESSION_ID = "&s"
    const val PRODUCTS = "&pl"
    const val CATEGORY_ID = "&ct"
    const val KEYWORD = "&kw"
    const val TRANSACTION_ID = "&trans"
    const val TOTAL_ROW_COUNT = "&trc"

    const val LINE_ITEM_ID = "lineItemId"
    const val CREATIVE_ID = "&creativeId"
    const val AD_UNIT = "&adUnit"
    const val KEYWORD_AD = "&keyword"

    const val IMPRESSION_URL = "/impression?"
    const val IMPRESSION = "Ad Impression"
    const val CLICK_URL = "/click?"
    const val CLICK = "Ad Click"
}