package com.magician.recyclerviewkotlinexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_layout.view.*

class CustomAdapter(private var list:ArrayList<User>):RecyclerView.Adapter<CustomAdapter.ViewHolder>() {


    class ViewHolder(item: View):RecyclerView.ViewHolder(item){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_layout,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.textViewName.text=list[position].name
        holder.itemView.textViewAddress.text=list[position].address
    }

    override fun getItemCount(): Int {
        return list.size
    }
}