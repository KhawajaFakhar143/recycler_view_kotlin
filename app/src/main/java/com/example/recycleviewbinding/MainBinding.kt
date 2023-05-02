package com.example.recycleviewbinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewbinding.databinding.RecycleViewItemsBinding


class MainAdapter(val taskList: List<Task>) : RecyclerView.Adapter<MainAdapter.MainViewHolder>(){


    inner class MainViewHolder(val itemBinding: RecycleViewItemsBinding): RecyclerView.ViewHolder(itemBinding.root){
        fun bindItem(task: Task){
            itemBinding.tvListItem.text = task.name
            itemBinding.tvItemTime.text = task.timeStamp
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(RecycleViewItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        var item=taskList[position]
        holder.bindItem(item
        )
    }

    override fun getItemCount(): Int {
        return taskList.size
    }
}