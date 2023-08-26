package com.funch.shac.data

import com.funch.shac.data.model.User
import com.funch.shac.data.repository.UserRepository
import com.funch.shac.data.source.datasource.UserDataSourceFactory
import com.funch.shac.remote.mapper.UserMapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val dataSourceFactory: UserDataSourceFactory,
    private val userMapper: UserMapper,
) : UserRepository {
    override suspend fun getUsers(): Flow<List<User>> {
        TODO("Not yet implemented")
    }

    override suspend fun getUser(userId: Int): Flow<User> {
        TODO("Not yet implemented")
    }

}