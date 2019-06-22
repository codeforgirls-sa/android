package com.example.profile;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EditProfile extends AppCompatActivity {
    //Views
    EditText name;
    EditText role;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        //init views
        name=findViewById(R.id.userName);
        role=findViewById(R.id.userRole);
        //get Data
        SharedPreferences sharedPref = getSharedPreferences("myData",Context.MODE_PRIVATE);
        if (sharedPref.contains("name"))
            name.setText(sharedPref.getString("name",""));
        if (sharedPref.contains("role"))
            role.setText(sharedPref.getString("role",""));
    }
    public void saveData(View view)
    {
        String nameValue=name.getText().toString();
        String roleValue=role.getText().toString();
        if (nameValue.isEmpty()&&roleValue.isEmpty())
            Toast.makeText(this,"please enter your name and role",Toast.LENGTH_LONG).show();
        else
        {
            SharedPreferences sharedPref = getSharedPreferences("myData",Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.putString("name", nameValue);
            editor.putString("role", roleValue);
            editor.commit();
            Intent intent=new Intent(EditProfile.this,MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }
    }
}
