package com.example.codingchallengexml.data.network

import com.example.codingchallengexml.data.models.SimpsonResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface SimpsonClient {

    @GET("/quotes")
    suspend fun getQuotes(@Query("count")count: Int): Response<List<SimpsonResponse>>
}