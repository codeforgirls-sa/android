package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //views
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.myLV);
        //Data
        ArrayList<String> colors=new ArrayList<>();
        colors.add("red");colors.add("blue");colors.add("black");colors.add("white");colors.add("green");colors.add("grey");
        //Adapter
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,colors);
        listView.setAdapter(adapter);
        //item click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"hello index"+position,Toast.LENGTH_LONG).show();
            }
        });
    }
}
