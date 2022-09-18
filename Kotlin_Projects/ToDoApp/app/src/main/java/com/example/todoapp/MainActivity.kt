package com.example.todoapp

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var list: ListView
    lateinit var editText: EditText
    lateinit var adapter: ArrayAdapter<String>
    lateinit var arr: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list = findViewById(R.id.lv)
        editText = findViewById(R.id.editText)

        //array
        arr = arrayListOf(
            "Android Bootcamp  -Code For Girls-",
            "Programming Assignment",
            "Publish the article",
            "Analyze the survey results",
            "Check emails")

        adapter = ArrayAdapter(this, R.layout.item_row, R.id.ch, arr)
        list.adapter = adapter


    }

    fun addTasks(view: View) {
        var task = editText.text.toString()
        if (task.isEmpty()) {
            Toast.makeText(this, "pleas add new task", Toast.LENGTH_LONG).show()
        } else {
            arr.add(task)
            adapter.notifyDataSetChanged()
            editText.setText("")
        }
    }
}
