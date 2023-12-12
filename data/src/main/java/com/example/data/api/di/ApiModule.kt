package com.example.data.api.di

import com.example.data.api.SignUpWebService
import com.example.data.datasource.SignUpDataSource
import com.example.data.datasource.SignupDataSourceContract
import com.example.data.repository.SignUpRepository
import com.example.data.repository.SignUpRepositoryContract
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ApiModule {
    @Provides
    @Singleton
    fun provideRetrofit(gsonConverterFactory: GsonConverterFactory): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://ecommerce.routemisr.com")
            .addConverterFactory(gsonConverterFactory)
            .build()
    }

    @Provides
    @Singleton
    fun provideUserApi(retrofit: Retrofit): SignUpWebService {
        return retrofit.create(SignUpWebService::class.java)
    }


    @Provides
    @Singleton
    fun provideSignupDataSource(signUpWebService: SignUpWebService): SignupDataSourceContract {
        return SignUpDataSource(signUpWebService)
    }

    @Provides
    @Singleton
    fun provideSignUpRepository(signUpDataSource: SignupDataSourceContract): SignUpRepositoryContract {
        return SignUpRepository(signUpDataSource)
    }

    @Provides
    @Singleton
    fun provideGsonConverterFactory(): GsonConverterFactory {
        return GsonConverterFactory.create()
    }
}