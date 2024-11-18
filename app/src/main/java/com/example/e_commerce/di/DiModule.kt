package com.example.e_commerce.di

import com.example.e_commerce.network.ApiInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit


@InstallIn(SingletonComponent::class)
@Module
object DiModule {
    @Provides
    fun provideRetrofit():ApiInterface{
        val logging=HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)
        val client = OkHttpClient.Builder().connectTimeout(60,TimeUnit.SECONDS)
            .readTimeout(60,TimeUnit.SECONDS).writeTimeout(60,TimeUnit.SECONDS)
            .addInterceptor(logging).build()

        return Retrofit.Builder()
            .baseUrl("https://api.escuelajs.co/api/v1/").client(client).build().create(ApiInterface::class.java)
    }
}