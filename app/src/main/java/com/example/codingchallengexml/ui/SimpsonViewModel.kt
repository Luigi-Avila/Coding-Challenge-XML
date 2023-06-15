package com.example.codingchallengexml.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.codingchallengexml.domain.GetQuotesUseCase
import kotlinx.coroutines.launch

class SimpsonViewModel: ViewModel() {

    private val getQuotesUseCase = GetQuotesUseCase()

    fun getQuotes(){
        viewModelScope.launch {
            getQuotesUseCase()
        }
    }
}