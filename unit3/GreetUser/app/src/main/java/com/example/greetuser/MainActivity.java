package com.example.greetuser;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //views
    EditText editText;
    TextView description;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //init views
        editText=findViewById(R.id.userName);
        description=findViewById(R.id.description);
        button=findViewById(R.id.saveButton);

        //get Data
        SharedPreferences sharedPref = getSharedPreferences("myyData", Context.MODE_PRIVATE);
        if (sharedPref.contains("name")) {
            button.setVisibility(View.GONE);
            editText.setVisibility(View.GONE);
            description.setVisibility(View.VISIBLE);
            Toast.makeText(this, "Hello " + sharedPref.getString("name", ""),
                    Toast.LENGTH_LONG).show(); }
    }
    //save Data onClick the Button
    public void saveName(View view){
        String nameValue=editText.getText().toString();
        if (nameValue.isEmpty())
            Toast.makeText(this,"please enter your name",Toast.LENGTH_LONG).show();
        else {
            SharedPreferences sharedPref = getSharedPreferences("myyData", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.putString("name", nameValue);
            editor.commit();
            Toast.makeText(this,"Hello "+nameValue,Toast.LENGTH_LONG).show();
        }
    }


}