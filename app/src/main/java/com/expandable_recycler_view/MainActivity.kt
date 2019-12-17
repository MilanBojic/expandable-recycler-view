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
        val listOfIT = arrayListOf(
            Person("Vernon M. Solano"),
            Person("Harley D. Patterson"),
            Person("Ray K. Hernandez"),
            Person("Patricia F. Jimenez"),
            Person("Valerie D. Striplin")
        )
        val listOfDev = arrayListOf(
            Person("George A. Perry"),
            Person("Tara G. Rick"),
            Person("Rosario G. Schmid"),
            Person("Brett P. Austin"),
            Person("Julie E. Stevenson")
        )
        val listOfManagements = arrayListOf(
            Person("David M. Clark"),
            Person("Jeffrey L. Stout"),
            Person("Theresa C. Jackson"),
            Person("Ben L. Hayes"),
            Person("Lydia J. Thompson")
        )

        val listOfQA = arrayListOf(
            Person("Rachel R. Howell"),
            Person("Ned A. Seibold"),
            Person("Thomas B. Blevins"),
            Person("Christopher D. Bentley"),
            Person("Glenn E. Alvarado")
        )
        val listOfManufacturer = arrayListOf(
            Group("IT support", listOfIT, R.drawable.support),
            Group("Developers", listOfDev, R.drawable.dev),
            Group("Management", listOfManagements, R.drawable.management),
            Group("QA", listOfQA, R.drawable.qa)
        )


        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycler_view_main) as RecyclerView
        val layoutManager = LinearLayoutManager(this)
        adapter = GroupAdapter(listOfManufacturer)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter

    }
}
