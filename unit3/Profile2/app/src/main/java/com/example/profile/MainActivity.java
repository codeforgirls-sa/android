package com.example.profile;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //views
    TextView name;
    TextView role;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.profileName);
        role = findViewById(R.id.profileRole);
        //get Data
        SharedPreferences sharedPref = getSharedPreferences("myData", Context.MODE_PRIVATE);
        if (sharedPref.contains("name"))
            name.setText(sharedPref.getString("name", ""));
        if (sharedPref.contains("role"))
            role.setText(sharedPref.getString("role", ""));
    }

    public void editProfile(View view) {
        Intent intent = new Intent(MainActivity.this, EditProfile.class);
        startActivity(intent);
    }

    public void openEmail(View view) {
        //email challenge solution
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        String[] TO = {"address@email.com"};
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Your subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message goes here");
        startActivity(Intent.createChooser(emailIntent, "Send mail..."));
    }

    public void openPhone(View view) {
        Uri uri = Uri.parse("tel:0123456789");
        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
        // intent.setData(Uri.parse("tel:0123456789"));
        startActivity(intent);
    }

    public void openTwitter(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/Twitter"));
        startActivity(intent);
    }
}
