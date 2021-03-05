package com.example.recyclerviewadvance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val listViewType = mutableListOf(
                MultiViewAdapter.ITEM_HEADER_VIEW,
                MultiViewAdapter.ITEM_OFFER_VIEW,
                MultiViewAdapter.ITEM_RESTAURANT_VIEW,
                MultiViewAdapter.ITEM_OFFER_VIEW,
                MultiViewAdapter.ITEM_RESTAURANT_VIEW,
                MultiViewAdapter.ITEM_OFFER_VIEW
        )
        val adapterRecyclerView = MultiViewAdapter(this, listViewType = listViewType)
        recyclerView.adapter = adapterRecyclerView
    }
}