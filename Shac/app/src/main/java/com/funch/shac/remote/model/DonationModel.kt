package com.funch.shac.remote.model

import com.squareup.moshi.Json

data class DonationModel(
    @field:Json(name = "donation_id") val id: Int,
    @field:Json(name = "donation_amount") val amount: Int,
)
