package com.funch.shac.remote.mapper

interface Mapper<E, D> {
    fun mapFromModel(model: E): D
    fun mapToModel(type: D): E
}
