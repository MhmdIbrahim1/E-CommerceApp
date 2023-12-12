package com.example.e_commerce.signin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SigninViewModel : ViewModel() {

    var passwordLiveData = MutableLiveData<String>()
    var errorPasswordLiveData = MutableLiveData<String>()
    var emailLiveData = MutableLiveData<String>()
    var errorEmailLiveData = MutableLiveData<String>()
}