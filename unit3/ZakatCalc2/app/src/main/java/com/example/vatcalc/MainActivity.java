package com.example.vatcalc;

import android.support.v7.app.AppCompatActivity;
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
        userInput=findViewById(R.id.userInput);
        calc=findViewById(R.id.calcButton);
        result=findViewById(R.id.result);
        /*calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInputValue=userInput.getText().toString();
                float inputAsNumber=0;
                if (userInputValue.isEmpty())
                    Toast.makeText(MainActivity.this,"الرجاء ادخال المبلغ" ,Toast.LENGTH_LONG).show();
                else
                   { inputAsNumber=Float.parseFloat(userInputValue);
                result.setText((inputAsNumber/40)+"");}
            }
        });*/
    }
    public void onCalc(View view)
    {
        String userInputValue=userInput.getText().toString();
        float inputAsNumber=0;
        if (userInputValue.isEmpty())
            Toast.makeText(MainActivity.this,"الرجاء ادخال المبلغ" ,Toast.LENGTH_LONG).show();
        else
        { inputAsNumber=Float.parseFloat(userInputValue);
        result.setText((inputAsNumber/40)+"");}
    }
}
