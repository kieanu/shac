package com.funch.shac.remote.model

import com.squareup.moshi.Json

data class ActivityModel(
    // 액티비티 테이블에 유저 id 없어진듯
    @field:Json(name = "activity_id") val id: Int,
    @field:Json(name = "activity_content") var content: String,
    // Service에서 Multipart List로 이미지 여러개 보내기
    // 리스트 형태여야 여러개의 이미지를 받을 수 있지 않나?\
    @field:Json(name = "activity_image") var imageUrls: List<String>,
    @field:Json(name = "activity_activate") var isActivated: Boolean,
)
