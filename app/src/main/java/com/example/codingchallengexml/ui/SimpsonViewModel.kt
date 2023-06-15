package com.example.codingchallengexml.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.codingchallengexml.data.models.SimpsonResponse
import com.example.codingchallengexml.domain.GetQuotesUseCase
import kotlinx.coroutines.launch

class SimpsonViewModel: ViewModel() {

    private val _listOfQuotes = MutableLiveData<List<SimpsonResponse>>()
    val listOfQuotes: LiveData<List<SimpsonResponse>> = _listOfQuotes

    private val getQuotesUseCase = GetQuotesUseCase()

    fun getQuotes(){
        viewModelScope.launch {
            _listOfQuotes.value = getQuotesUseCase()!!
        }
    }
}