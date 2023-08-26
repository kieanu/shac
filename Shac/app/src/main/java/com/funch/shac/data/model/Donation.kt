package com.funch.shac.data.model

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.parcelize.Parcelize

@Parcelize
data class Donation(
    val id: Int,
    val amount: Int,
) : Parcelable
