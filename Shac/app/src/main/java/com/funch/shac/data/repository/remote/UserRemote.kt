package com.funch.shac.data.repository.remote

import com.funch.shac.data.model.User


interface UserRemote {
    suspend fun getUsers(): List<User>
    suspend fun getUser(userId: Int): User

    suspend fun isRemote(): Boolean
}