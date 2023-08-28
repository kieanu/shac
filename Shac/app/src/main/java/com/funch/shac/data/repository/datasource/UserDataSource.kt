package com.funch.shac.data.repository.datasource

import com.funch.shac.data.model.User


interface UserDataSource {
    // remote
    suspend fun getUsers(): List<User>
    suspend fun getUser(userId: Int): User

    // cache

    // remote & cache (공통)

    // datasource
    suspend fun isRemote(): Boolean
}