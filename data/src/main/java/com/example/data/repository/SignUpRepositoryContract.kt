package com.example.data.repository

import com.example.data.model.UserRequest
import com.example.data.model.UserResponse
interface SignUpRepositoryContract {
suspend fun signup(userRequest: UserRequest) : UserResponse
}