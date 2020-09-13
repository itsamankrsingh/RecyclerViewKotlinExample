package com.magician.recyclerviewkotlinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var mRecyclerView: RecyclerView
    private lateinit var listItem:ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRecyclerView=findViewById(R.id.recycler_view)
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager= LinearLayoutManager(this)

        listItem= ArrayList()
        listItem.add(User("Aman Singh","Bhagalpur,India"))
        listItem.add(User("Aman Singh","Bhagalpur,India"))
        listItem.add(User("Aman Singh","Bhagalpur,India"))
        listItem.add(User("Aman Singh","Bhagalpur,India"))
        listItem.add(User("Aman Singh","Bhagalpur,India"))
        listItem.add(User("Aman Singh","Bhagalpur,India"))
        listItem.add(User("Aman Singh","Bhagalpur,India"))
        listItem.add(User("Aman Singh","Bhagalpur,India"))
        listItem.add(User("Aman Singh","Bhagalpur,India"))
        listItem.add(User("Aman Singh","Bhagalpur,India"))
        listItem.add(User("Aman Singh","Bhagalpur,India"))
        listItem.add(User("Aman Singh","Bhagalpur,India"))
        listItem.add(User("Aman Singh","Bhagalpur,India"))
        listItem.add(User("Aman Singh","Bhagalpur,India"))
        listItem.add(User("Aman Singh","Bhagalpur,India"))
        listItem.add(User("Aman Singh","Bhagalpur,India"))
        listItem.add(User("Aman Singh","Bhagalpur,India"))
        listItem.add(User("Aman Singh","Bhagalpur,India"))
        listItem.add(User("Aman Singh","Bhagalpur,India"))
        listItem.add(User("Aman Singh","Bhagalpur,India"))
        mRecyclerView.adapter=CustomAdapter(listItem)
    }
}