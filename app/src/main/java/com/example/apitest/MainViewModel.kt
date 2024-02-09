package com.example.apitest

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.apitest.repository.Repository
import androidx.lifecycle.viewModelScope
import com.example.apitest.model.User
import kotlinx.coroutines.launch

class MainViewModel(private val repository: Repository): ViewModel(){

    val myResponse:MutableLiveData<User> = MutableLiveData()

    fun getUser(){
        viewModelScope.launch {
            val response = repository.getUser()
            myResponse.value = response
        }
    }

}