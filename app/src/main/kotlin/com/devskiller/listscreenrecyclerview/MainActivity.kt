package com.devskiller.listscreenrecyclerview

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), OnCheckBoxClicked {

    private lateinit var adapter: ToDoAdapter
    private lateinit var list: List<ToDoItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        list = DataUtil.createSampleData()

        val recyclerView = findViewById<RecyclerView>(R.id.todoListView)
        adapter = ToDoAdapter(
            list,
            layoutInflater,
            this
        )
        recyclerView.setAdapter(adapter)
    }

    override fun onClick(position: Int, isChecked: Boolean) {
        list[position].complete = isChecked
    }
}
