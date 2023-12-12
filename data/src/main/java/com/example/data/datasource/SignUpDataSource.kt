package com.example.data.datasource

import com.example.data.api.SignUpWebService
import com.example.data.model.UserRequest
import com.example.data.model.UserResponse
import javax.inject.Inject

class SignUpDataSource @Inject constructor(
    private val signUpWebService: SignUpWebService,
): SignupDataSourceContract {
    override suspend fun signup(userRequest: UserRequest): UserResponse {
        return signUpWebService.signingAPI(userRequest)
    }
}