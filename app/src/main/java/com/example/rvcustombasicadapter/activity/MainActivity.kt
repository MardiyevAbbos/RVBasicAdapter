package com.example.rvcustombasicadapter.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rvcustombasicadapter.R
import com.example.rvcustombasicadapter.adapter.CustomAdapter
import com.example.rvcustombasicadapter.model.Member

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

        val members = prepareMemberList()
        refreshAdapter(members)

    }

    private fun initView() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 1)
    }


    private fun refreshAdapter(members: ArrayList<Member>) {
        val adapter = CustomAdapter(members)
        recyclerView.adapter = adapter
    }


    private fun prepareMemberList(): ArrayList<Member> {
        val members: ArrayList<Member> = ArrayList()

        for (i in 1..30) {
            members.add(Member("$i)Lionel", "$i)Messi"))
        }
        return members
    }


}