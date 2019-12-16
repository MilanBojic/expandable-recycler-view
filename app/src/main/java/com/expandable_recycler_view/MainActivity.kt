package com.expandable_recycler_view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thoughtbot.expandablerecyclerview.sample.Group
import com.thoughtbot.expandablerecyclerview.sample.expand.GroupAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    lateinit var adapter: GroupAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val listOfContact = arrayListOf(
            Contact("milan"),
            Contact("pero"),
            Contact("nikica"),
            Contact("mikica"),
            Contact("ldap")
        )
        val listOfContact2 = arrayListOf(
            Contact("milan2"),
            Contact("pero2"),
            Contact("nikica2"),
            Contact("mikica2"),
            Contact("ldap2")
        )
        val listOfContact3 = arrayListOf(
            Contact("milan3"),
            Contact("pero3"),
            Contact("nikica3"),
            Contact("mikica3"),
            Contact("ldap3")
        )
        val listOfGroup = arrayListOf(
            Group("grupa1", listOfContact),
            Group("grupa2", listOfContact2),
            Group("grupa3", listOfContact3),
            Group("grupa4", listOfContact),
            Group("grupa5", listOfContact2)
        )


        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycler_view_main) as RecyclerView
        val layoutManager = LinearLayoutManager(this)
        adapter = GroupAdapter(listOfGroup)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter

    }
}
