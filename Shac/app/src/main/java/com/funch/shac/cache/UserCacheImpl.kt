package com.funch.shac.cache

import com.funch.shac.cache.dao.UserDao
import com.funch.shac.cache.mapper.UserCacheMapper
import com.funch.shac.data.repository.cache.UserCache
import javax.inject.Inject

class UserCacheImpl @Inject constructor(
    private val userDao: UserDao,
    private val userCacheMapper: UserCacheMapper,
) : UserCache {

}