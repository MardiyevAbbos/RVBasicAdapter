package com.example.rvcustombasicadapter.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rvcustombasicadapter.R
import com.example.rvcustombasicadapter.model.Member

class CustomAdapter(val members: ArrayList<Member>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_custom_layout, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is CustomViewHolder) {
            holder.apply {
                val member = members.get(position)
                firstName.setText(member.firstName)
                lastName.setText(member.lastName)
            }
        }
    }

    override fun getItemCount(): Int {
        return members.size
    }

    inner class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val firstName = view.findViewById<TextView>(R.id.first_name)
        val lastName = view.findViewById<TextView>(R.id.last_name)
    }

}