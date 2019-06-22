package com.example.lvcustomadapater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//vies
    ListView listView;
    ArrayList<Restuarant> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //init view
        listView=findViewById(R.id.myLV);
        //Data
        setRestaurantData();
        //Adapter
        MyAdapter adapter=new MyAdapter(this,data);
        listView.setAdapter(adapter);

    }
    void setRestaurantData()
    {
        data=new ArrayList<>();
        data.add(new Restuarant("Salt","9.2","https://goo.gl/maps/Q5LkjuJ5M1SpDWi37"));
        data.add(new Restuarant("Parker's","9.1","https://goo.gl/maps/ixTWjzYJd6Ww4N6d6"));
        data.add(new Restuarant("Alley Cafe","8.5","https://goo.gl/maps/1CoMXuTXXN7vArGm7"));
        data.add(new Restuarant("Sunroom cafe","7.6","https://goo.gl/maps/kmAj77Mxr6k5CLDG9"));
        data.add(new Restuarant("Ble' cafe","7.6","https://goo.gl/maps/TydCDjvnKP4k9hX2A"));


    }
}
