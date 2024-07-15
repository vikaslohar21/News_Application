package com.example.newsapplication.api

import androidx.room.Query
import com.example.newsapplication.models.NewsResponse
import com.example.newsapplication.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET

interface NewsAPI {

    @GET("v2/top-headlines")
    suspend fun getHeadlines(
        @retrofit2.http.Query("country")
        countryCode: String = "us",
        @retrofit2.http.Query("page")
        pageNumber: Int = 1,
        @retrofit2.http.Query("apiKey")
        apiKey: String = API_KEY
    ): Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchForNews(
        @retrofit2.http.Query("q")
        searchQuery:String,
        @retrofit2.http.Query("page")
        pageNumber: Int = 1,
        @retrofit2.http.Query("apiKey")
        apiKey: String = API_KEY
    ): Response<NewsResponse>
}