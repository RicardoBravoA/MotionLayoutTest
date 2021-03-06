package com.rba.motionlayout.test.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.rba.motionlayout.test.R
import com.rba.motionlayout.test.databinding.ItemMainBinding
import com.rba.motionlayout.test.model.AnimationModel

class MainAdapter(private val itemClick: (animationModel: AnimationModel) -> Unit) :
    ListAdapter<AnimationModel, MainAdapter.ItemViewHolder>(DiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding: ItemMainBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_main,
            parent,
            false
        )
        return ItemViewHolder(binding)
    }


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val animationModel = getItem(position)
        holder.itemView.setOnClickListener {
            itemClick(animationModel)
        }
        holder.bind(animationModel)
    }

    class ItemViewHolder(private var binding: ItemMainBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(animationModel: AnimationModel) {
            binding.titleTextView.text = animationModel.title
            binding.descriptionTextView.text = animationModel.description
        }
    }

    companion object DiffCallback : DiffUtil.ItemCallback<AnimationModel>() {
        override fun areItemsTheSame(oldItem: AnimationModel, newItem: AnimationModel): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: AnimationModel, newItem: AnimationModel): Boolean {
            return oldItem.id == newItem.id
        }
    }

}