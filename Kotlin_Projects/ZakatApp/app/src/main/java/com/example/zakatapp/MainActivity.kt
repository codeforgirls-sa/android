package com.example.zakatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    lateinit var resultText: TextView
    lateinit var button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //init views
        editText = findViewById(R.id.userInput)
        resultText = findViewById(R.id.result_value)

        button.setOnClickListener {

            var value: String = editText.text.toString()
            if (value.isEmpty()) {
                Toast.makeText(this, "please add number", Toast.LENGTH_LONG).show()

            } else {
                var valueAsNum: Double = value.toDouble()
                resultText.setText((valueAsNum / 40).toString())
            }
        }

    }

    fun onCalc(view: View) {
        var value: String = editText.text.toString()
        if (value.isEmpty()) {
            Toast.makeText(this, "please add number", Toast.LENGTH_LONG).show()
        } else {
            var valueAsNum: Double = value.toDouble()
            resultText.setText((valueAsNum / 40).toString())
        }

    }

}