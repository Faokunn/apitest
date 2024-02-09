package com.example.apitest.repository

import com.example.apitest.api.RetrofitInstance
import com.example.apitest.model.User

class Repository {

    suspend fun getUser(): User {
        return RetrofitInstance.api.getUser()
    }

}