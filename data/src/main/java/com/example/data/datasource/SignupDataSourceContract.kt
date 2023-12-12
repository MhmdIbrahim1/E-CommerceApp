package com.example.data.datasource

import com.example.data.model.UserRequest
import com.example.data.model.UserResponse

interface SignupDataSourceContract {
    suspend fun signup(userRequest: UserRequest) : UserResponse
}