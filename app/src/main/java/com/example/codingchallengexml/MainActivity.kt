package com.example.codingchallengexml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.example.codingchallengexml.databinding.ActivityMainBinding
import com.example.codingchallengexml.ui.SimpsonViewModel

class MainActivity : AppCompatActivity() {

    private val simpsonViewModel: SimpsonViewModel by viewModels()

    private lateinit var mBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.btnRefresh.setOnClickListener{
            Log.i("Hello", "BTN pressed")
            simpsonViewModel.getQuotes()
        }
    }
}