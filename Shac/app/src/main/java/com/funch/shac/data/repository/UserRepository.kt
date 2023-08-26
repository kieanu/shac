package com.funch.shac.data.repository

import com.funch.shac.data.model.User
import kotlinx.coroutines.flow.Flow

interface UserRepository {
    suspend fun getUsers(): Flow<List<User>>
    suspend fun getUser(userId: Int): Flow<User>
}