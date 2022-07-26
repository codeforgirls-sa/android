package com.example.vatcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Views
    EditText userInput;
    Button calc;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //init views
        userInput = findViewById(R.id.userInput);
        calc = findViewById(R.id.Calculate);
        result = findViewById(R.id.result_value);

        /*calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        String userInputValue=userInput.getText().toString();

        if (userInputValue.isEmpty())
            Toast.makeText(MainActivity.this,"الرجاء ادخال المبلغ" ,Toast.LENGTH_LONG).show();
        else
        {
            Float inputAsNumber= Float.parseFloat(userInputValue);
        result.setText((inputAsNumber/40)+"");}
            }
        });*/
    }

    public void onCalc(View view) {
        String userInputValue = userInput.getText().toString();

        if (userInputValue.isEmpty())
            Toast.makeText(MainActivity.this, "الرجاء ادخال المبلغ", Toast.LENGTH_LONG).show();
        else {
            Float inputAsNumber = Float.parseFloat(userInputValue);
            result.setText((inputAsNumber / 40) + "");
        }
    }
}
