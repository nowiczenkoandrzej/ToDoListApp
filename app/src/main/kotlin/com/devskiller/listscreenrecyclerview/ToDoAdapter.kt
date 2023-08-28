package com.devskiller.listscreenrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.devskiller.listscreenrecyclerview.databinding.TodoItemBinding

class ToDoAdapter(
    val todoItemList: List<ToDoItem>,
    private val mLayoutInflater: LayoutInflater,
    private val listener: OnCheckBoxClicked
) : RecyclerView.Adapter<ToDoAdapter.ToDoItemHolder>() {

    class ToDoItemHolder(
        itemView: View,
        private val listener: OnCheckBoxClicked
    ) : RecyclerView.ViewHolder(itemView) {

        val todoItemView: TextView
        val doneCheckBox: CheckBox

        init {
            val todoItemBinding = TodoItemBinding.bind(itemView)
            todoItemView = todoItemBinding.itemText
            doneCheckBox = (todoItemBinding.doneCheckBox as CheckBox)

            // implement checkbox click handling here
            doneCheckBox.setOnCheckedChangeListener { buttonView, isChecked ->
                val position = adapterPosition
                if(position != RecyclerView.NO_POSITION) {
                    listener.onClick(position, isChecked)
                }
            }

        }
    }

    // implement this method to use proper layout for to do items
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ToDoItemHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.todo_item, parent, false)
        return ToDoItemHolder(view, listener)
    }

    // set the values from model data to view properly
    override fun onBindViewHolder(
        holder: ToDoItemHolder,
        position: Int
    ) {
        holder.todoItemView.text = todoItemList[position].task
        holder.doneCheckBox.isChecked = todoItemList[position].complete
        holder.doneCheckBox
    }

    override fun getItemCount() = todoItemList.size
}
