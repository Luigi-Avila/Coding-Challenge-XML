package com.example.codingchallengexml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.codingchallengexml.databinding.ActivityMainBinding
import com.example.codingchallengexml.ui.SimpsonAdapter
import com.example.codingchallengexml.ui.SimpsonViewModel

class MainActivity : AppCompatActivity() {

    private val simpsonViewModel: SimpsonViewModel by viewModels()

    private lateinit var mBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        simpsonViewModel.getQuotes()

        setupRecycler()
    }

    private fun setupRecycler() {
        val recycler = mBinding.recyclerView

        simpsonViewModel.listOfQuotes.observe(this, Observer {
            recycler.adapter = SimpsonAdapter(it)
            recycler.layoutManager = LinearLayoutManager(this)
        })


    }
}