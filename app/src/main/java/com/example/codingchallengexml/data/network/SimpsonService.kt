package com.example.codingchallengexml.data.network

import android.util.Log
import com.example.codingchallengexml.core.RetrofitHelper
import com.example.codingchallengexml.data.models.SimpsonResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class SimpsonService {

    private val retrofit = RetrofitHelper.getRetrofit()
    private val count = 20

    suspend fun getQuotes(): List<SimpsonResponse> {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(SimpsonClient::class.java).getQuotes(count)
            Log.i("Hello", "Valor del body ${response.body()}")
            response.body() ?: emptyList()
        }
    }

}