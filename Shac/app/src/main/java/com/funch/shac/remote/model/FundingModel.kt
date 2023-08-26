package com.funch.shac.remote.model

import com.squareup.moshi.Json

data class FundingModel(
    @field:Json(name = "funding_id") val id: Int,
    @field:Json(name = "user_id") val userId: Int,
    @field:Json(name = "category_id") val categoryId: Int,
    @field:Json(name = "location_id") val locationId: Int,
    @field:Json(name = "funding_name") var name: String,
    @field:Json(name = "start_date") var startDate: Long,
    @field:Json(name = "end_date") var endDate: Long,
    @field:Json(name = "participants") var participants: Int,
    @field:Json(name = "funding_image") val imageUrl: String,
    @field:Json(name = "funding_candidate_number") var candidate: Int, // particiepants랑 뭐가 다름?
    @field:Json(name = "funding_candidate") var candidateList: List<Int>, // 이거 리스트는 왜 있지?
    @field:Json(name = "funding_account") var account: Int // String이어야하는거 아님?
)