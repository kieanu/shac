package com.funch.shac.remote.model

import com.squareup.moshi.Json

data class CategoryModel(
    @field:Json(name = "category_id") val id: Int,
    @field:Json(name = "category_id") val name: String,
)
