package com.funch.shac.data.source.remote

import com.funch.shac.data.model.User
import com.funch.shac.data.repository.datasource.UserDataSource
import com.funch.shac.data.repository.remote.UserRemote
import javax.inject.Inject

class UserRemoteDataSource @Inject constructor(
    private val userRemote: UserRemote
) : UserDataSource {
    override suspend fun getUsers(): List<User> {
        return userRemote.getUsers()
    }

    override suspend fun getUser(userId: Int): User {
        return userRemote.getUser(userId)
    }

    override suspend fun isRemote(): Boolean {
       return userRemote.isRemote()
    }

}