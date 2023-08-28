package com.devskiller.listscreenrecyclerview

import android.os.Build
import android.widget.CheckBox
import androidx.recyclerview.widget.RecyclerView
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [Build.VERSION_CODES.N])
class TodoListTests {

    private lateinit var recyclerView: RecyclerView

    @Before
    fun setup() {
        val activity = Robolectric.setupActivity(MainActivity::class.java)

        recyclerView = activity.findViewById(R.id.todoListView)
        recyclerView.measure(0, 0)
        recyclerView.layout(0, 0, 100, Int.MAX_VALUE)
    }

    @Test
    fun checkToDoItemCount() = assertEquals(12, recyclerView.getChildCount())

    @Test
    fun checkToDoFirstCheckBoxId() {
        val itemView = recyclerView.getChildAt(0)
        val checkbox = itemView.findViewById<CheckBox>(R.id.doneCheckBox)

        assertNotNull(checkbox)
    }
}
