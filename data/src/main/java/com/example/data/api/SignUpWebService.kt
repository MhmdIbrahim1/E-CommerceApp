package com.example.data.api

import com.example.data.model.UserRequest
import com.example.data.model.UserResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface SignUpWebService {

    @POST("/api/v1/auth/signup")
    suspend fun signingAPI(@Body userRequest: UserRequest) : UserResponse
}