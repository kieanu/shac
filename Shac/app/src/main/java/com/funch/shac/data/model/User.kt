package com.funch.shac.data.model

import com.squareup.moshi.Json

data class User(
    val id: Int,
    val activityId: Int,
    val loginId: String,
    var loginPassword: String,
    var phoneNumber: String,
    var email: String,
    var account: String,
    var donationList: List<Donation>,
    var isGhost: Boolean,
)
