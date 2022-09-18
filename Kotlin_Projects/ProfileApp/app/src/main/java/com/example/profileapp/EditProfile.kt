package com.example.profileapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class EditProfile : AppCompatActivity() {
    lateinit var name:EditText
    lateinit var role:EditText
    lateinit var button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        name=findViewById(R.id.name)
        role=findViewById(R.id.role)
        button=findViewById(R.id.Button)


        //save Data
        button.setOnClickListener {
            var nameValue= name.text.toString()
            var roleValue= role.text.toString()
            if(nameValue.isEmpty() || roleValue.isEmpty()){
                Toast.makeText(this,"please enter your name and role",Toast.LENGTH_LONG).show()
            }else{
                var shared:SharedPreferences=getSharedPreferences("myData",Context.MODE_PRIVATE)
                var editor:SharedPreferences.Editor= shared.edit()
                editor.putString("name", nameValue)
                editor.putString("role", roleValue)
                editor.commit()

                var i= Intent(this, MainActivity::class.java)
                i.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                startActivity(i)
            }
        }
    }
}