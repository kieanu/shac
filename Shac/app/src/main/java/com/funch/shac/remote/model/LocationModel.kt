package com.funch.shac.remote.model

import com.squareup.moshi.Json

data class LocationModel(
    @field:Json(name = "location_id") val id: Int,
    @field:Json(name = "latitude") val lat: Double,
    @field:Json(name = "longitude") val lon: Double,
    @field:Json(name = "address") val address: String,
)
