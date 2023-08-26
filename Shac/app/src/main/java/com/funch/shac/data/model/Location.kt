package com.funch.shac.data.model

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.parcelize.Parcelize

@Parcelize
data class Location(
    val id: Int,
    val lat: Double,
    val lon: Double,
    val address: String,
): Parcelable
