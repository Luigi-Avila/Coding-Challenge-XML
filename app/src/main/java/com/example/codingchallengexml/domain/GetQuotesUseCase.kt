package com.example.codingchallengexml.domain

import com.example.codingchallengexml.data.SimpsonRepository
import com.example.codingchallengexml.data.models.SimpsonResponse

class GetQuotesUseCase {

    private val repository = SimpsonRepository()

    suspend operator fun invoke(): List<SimpsonResponse> = repository.getQuotes()
}