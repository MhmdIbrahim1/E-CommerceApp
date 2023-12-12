package com.example.e_commerce.signup

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.model.UserRequest
import com.example.data.repository.SignUpRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val signUpRepository: SignUpRepository
) : ViewModel() {
    val nameErrorLiveData = MutableLiveData<String>()
    val nameLiveData = MutableLiveData<String>()
    val numberErrorLiveData = MutableLiveData<String>()
    val numberLiveData = MutableLiveData<String>()
    val emailErrorLiveData = MutableLiveData<String>()
    val emailLiveData = MutableLiveData<String>()
    val passwordErrorLiveData = MutableLiveData<String>()
    val passwordLiveData = MutableLiveData<String>()

    fun signup(){
        val userRequest = UserRequest(
            name = nameLiveData.value,
            email = emailLiveData.value,
            password = passwordLiveData.value,
            phone = numberLiveData.value
        )
        viewModelScope.launch {
                signUpRepository.signup(userRequest)
        }
    }
}