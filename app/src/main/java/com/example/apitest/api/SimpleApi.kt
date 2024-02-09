package com.example.apitest.api

import com.example.apitest.model.User
import retrofit2.http.GET

interface SimpleApi {

    @GET("api/view-students")
    suspend fun getUser(): User
}