package com.mimeda.mlink.data

data class MlinkAdPayload(
    val userId: Int? = null,
    val lineItemId: Int? = null,
    val creativeId: Int? = null,
    val adUnit: String? = null,
    val keyword: String? = null,
)
