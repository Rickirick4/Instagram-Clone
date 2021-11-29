package com.rickirick.instaclone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rickirick.instaclone.databinding.RecyclerRowBinding
import com.rickirick.instaclone.model.Posts
import com.squareup.picasso.Picasso

class FeedRecyclerAdapter(val postList: ArrayList<Posts>) : RecyclerView.Adapter<FeedRecyclerAdapter.FeedHolder>() {

    class FeedHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FeedHolder(binding)
    }

    override fun onBindViewHolder(holder: FeedHolder, position: Int) {
        holder.binding.recyclerViewEmailText.text = postList.get(position).email
        holder.binding.recyclerCommentText.text = postList.get(position).comment
        Picasso.get().load(postList.get(position).downloadURL).into(holder.binding.recyclerImageView)
    }

    override fun getItemCount(): Int {
        return postList.size
    }

}