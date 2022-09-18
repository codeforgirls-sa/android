package com.example.greatuserapp

import android.content.Context
import android.content.SharedPreferences
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
class MainActivity : AppCompatActivity() {
    lateinit var helloText: TextView
    lateinit var editText: EditText
    lateinit var button: Button
    lateinit var descriptionText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //init views
        helloText = findViewById(R.id.textView)
        editText = findViewById(R.id.userName)
        button = findViewById(R.id.saveButton)
        descriptionText = findViewById(R.id.description)

        //get Data
        var sharedPref:SharedPreferences= getSharedPreferences("myData",Context.MODE_PRIVATE)
if(sharedPref.contains("name")){
    button.visibility=View.GONE
    editText.visibility=View.GONE
    descriptionText.visibility=View.VISIBLE
    Toast.makeText(this,"Hello ${sharedPref.getString("name","")}",Toast.LENGTH_LONG).show()
}
    }

    //save Data onClick the Button
    fun saveName(view: View) {
        var name = editText.text.toString()
        if (name.isEmpty()) {
            Toast.makeText(this, "please enter your name", Toast.LENGTH_LONG).show()
        } else {
            var sharedPref:SharedPreferences= getSharedPreferences("myData",Context.MODE_PRIVATE)
            var editor:SharedPreferences.Editor=sharedPref.edit()
            editor.putString("name", name)
            editor.commit()
            Toast.makeText(this, "Hello $name", Toast.LENGTH_LONG).show()
        }

    }


}