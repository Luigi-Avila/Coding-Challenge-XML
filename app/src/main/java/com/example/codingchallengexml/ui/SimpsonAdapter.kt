package com.example.codingchallengexml.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.codingchallengexml.R
import com.example.codingchallengexml.data.models.SimpsonResponse
import com.example.codingchallengexml.databinding.ItemQuoteBinding

class SimpsonAdapter(private val listQuotes: List<SimpsonResponse> ): RecyclerView.Adapter<SimpsonAdapter.ViewHolder>() {

    private lateinit var mContext: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        mContext = parent.context
        val view = LayoutInflater.from(mContext).inflate(R.layout.item_quote, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = listQuotes.get(position)

        with(holder){
            binding.tvTitle.text = data.quote
            Glide.with(mContext)
                .load(data.image)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(binding.imgPhoto)
        }

    }

    override fun getItemCount(): Int = listQuotes.size

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val binding = ItemQuoteBinding.bind(itemView)
    }

}