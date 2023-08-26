package com.funch.shac.data.api


// api try catch 문
internal inline fun <T> handleApi(transform: () -> T): NetworkResult<T> = try {
    NetworkResult.Success(transform.invoke())
} catch (e: Exception) {
    NetworkResult.Error(e)
}