package com.funch.shac.cache.mapper

import com.funch.shac.cache.model.UserCacheModel
import com.funch.shac.data.model.User
import javax.inject.Inject

class UserCacheMapper @Inject constructor() :
    CacheMapper<UserCacheModel, User> {
    override fun mapFromCached(type: UserCacheModel): User {
        TODO("Not yet implemented")
    }

    override fun mapToCached(type: User): UserCacheModel {
        TODO("Not yet implemented")
    }
}