package com.example.codingchallengexml.data

import com.example.codingchallengexml.data.models.SimpsonResponse
import com.example.codingchallengexml.data.network.SimpsonService

class SimpsonRepository {

    private val simpsonService = SimpsonService()

    suspend fun getQuotes(): List<SimpsonResponse> {
        return simpsonService.getQuotes()
    }
}