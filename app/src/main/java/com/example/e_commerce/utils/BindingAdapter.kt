package com.example.e_commerce.utils

import androidx.databinding.BindingAdapter
import com.google.android.material.textfield.TextInputLayout
@BindingAdapter("app:error")
fun bindError(textInputLayout: TextInputLayout,message:String?){
    textInputLayout.error = message
}