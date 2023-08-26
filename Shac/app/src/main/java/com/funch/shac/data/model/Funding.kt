package com.funch.shac.data.model

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.parcelize.Parcelize

@Parcelize
data class Funding(
    val id: Int,
    val userId: Int,
    val categoryId: Int,
    val locationId: Int,
    var name: String,
    var startDate: Long,
    var endDate: Long,
    var participants: Int,
    val imageUrl: String,
    var candidate: Int, // particiepants랑 뭐가 다름?
    var candidateList: List<Int>, // 이거 리스트는 왜 있지?
    var account: Int // String이어야하는거 아님?
):Parcelable
