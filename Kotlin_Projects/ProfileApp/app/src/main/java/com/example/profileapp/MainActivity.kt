package com.example.profileapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var email: TextView
    lateinit var phone: TextView
    lateinit var location: TextView
    lateinit var name: TextView
    lateinit var role: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        email = findViewById(R.id.email)
        phone = findViewById(R.id.phone)
        location = findViewById(R.id.location)
        name=findViewById(R.id.displayed_name)
        role=findViewById(R.id.displayed_role)

        //get Data
        var shared: SharedPreferences =getSharedPreferences("myData", Context.MODE_PRIVATE)
        if(shared.contains("name")){
            name.text= shared.getString("name","")
        }
        if(shared.contains("role")) {
            role.text = shared.getString("role", "")
        }
    }

    fun openEmail(view: View) {
        val intent = Intent(Intent.ACTION_SENDTO,Uri.parse("mailto: Basma@gmail.com"))
        startActivity(intent)
    }

    fun openPhone(view: View) {
val intent= Intent(Intent.ACTION_DIAL, Uri.parse("tel: 05539864"))
        startActivity(intent)
    }
    fun openLocation(view: View) {
        val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/Basma_s2"))
        startActivity(intent)
    }

    fun nextPage(view: View) {
        var i = Intent(this,EditProfile::class.java)
        startActivity(i)
    }
}