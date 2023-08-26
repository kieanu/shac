package com.funch.shac.remote.mapper

import com.funch.shac.data.model.User
import com.funch.shac.remote.model.UserModel
import javax.inject.Inject

class UserMapper @Inject constructor() : Mapper<UserModel, User>  {
    override fun mapFromModel(model: UserModel): User {
        return User(
            id = model.id,
            activityId = model.activityId,
            loginId = model.loginId,
            loginPassword = model.loginPassword,
            phoneNumber = model.phoneNumber,
            email = model.email,
            account = model.account,
            donationList = model.donationList,
            isGhost = model.isGhost
        )
    }

    override fun mapToModel(type: User): UserModel {
        return UserModel(
            id = type.id,
            activityId = type.activityId,
            loginId = type.loginId,
            loginPassword = type.loginPassword,
            phoneNumber = type.phoneNumber,
            email = type.email,
            account = type.account,
            donationList = type.donationList,
            isGhost = type.isGhost
        )
    }
}