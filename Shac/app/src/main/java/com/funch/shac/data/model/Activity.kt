package com.funch.shac.data.model

import com.squareup.moshi.Json

data class Activity(
   val id: Int,
   var content: String,
   var imageUrls: List<String>,
   var isActivated: Boolean,
)
