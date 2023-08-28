package com.funch.shac.remote

import com.funch.shac.data.model.User
import com.funch.shac.data.repository.remote.UserRemote
import com.funch.shac.remote.api.UserService
import com.funch.shac.remote.mapper.UserMapper
import javax.inject.Inject

class UserRemoteImpl @Inject constructor(
    private val userService: UserService,
    private val userMapper: UserMapper
) : UserRemote {
    override suspend fun getUsers(): List<User> {
        return userService.getUsers().body()!!.map { userModel ->
            userMapper.mapFromModel(userModel)
        }
    }

    override suspend fun getUser(userId: Int): User {
        return userMapper.mapFromModel(userService.getUser(userId).body()!!)
    }

    // 이 부분 원래는 로컬 DB에 저장된 값이 없으면 true를 호출하게 끔 userDao를 이용해야함. 현재는 DataSource에서 받아서 사용
    override suspend fun isRemote(): Boolean {
        return true
    }

}