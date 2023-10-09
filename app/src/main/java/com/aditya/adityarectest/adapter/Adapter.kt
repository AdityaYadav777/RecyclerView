 package com.aditya.adityarectest.adapter

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aditya.adityarectest.R
import com.aditya.adityarectest.model.item_Data

 class Adapter(val data: MutableList<item_Data>) :RecyclerView.Adapter<Adapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val name=itemView.findViewById<TextView>(R.id.txt_Name)
        val desc=itemView.findViewById<TextView>(R.id.txt_Desc)


    }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

            return MyViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item_data,parent,false)
            )
        }

        override fun getItemCount(): Int {
return data.size

        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

             holder.name.text=data[position].name
            holder.desc.text=data[position].desc

        }


}