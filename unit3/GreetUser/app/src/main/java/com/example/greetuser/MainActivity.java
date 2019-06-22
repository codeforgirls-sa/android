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
    EditText name;
    TextView description;
    Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.userName);
        description=findViewById(R.id.description);
        save=findViewById(R.id.saveButton);
        SharedPreferences sharedPref = getSharedPreferences("myData", Context.MODE_PRIVATE);
        if (sharedPref.contains("name")) {
            save.setVisibility(View.GONE);
            name.setVisibility(View.GONE);
            description.setVisibility(View.VISIBLE);
            Toast.makeText(this, "hello" + sharedPref.getString("name", ""), Toast.LENGTH_LONG).show();
        }
    }
    public void saveName(View view){
        String nameValue=name.getText().toString();
        if (nameValue.isEmpty())
            Toast.makeText(this,"please enter your name",Toast.LENGTH_LONG).show();
        else {
            SharedPreferences sharedPref = getSharedPreferences("myData", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.putString("name", nameValue);
            editor.commit();
            Toast.makeText(this,"hello"+nameValue,Toast.LENGTH_LONG).show(); ;
        }
    }
}
