package com.example.lvcustomadapater;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

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
        data= new ArrayList<>();
        data.add(new Restuarant(R.drawable.lavash,"LAVASH", "5",
                "https://goo.gl/maps/zThtieX1pSNnd9j77"));
        data.add(new Restuarant(R.drawable.mezoo,"Mezoo", "4.3",
                "https://goo.gl/maps/3F75QR1YtAFWhXbf6"));
        data.add(new Restuarant(R.drawable.roka,"ROKA", "4",
                "https://goo.gl/maps/nB3YeyPXgLrpPHNr6"));
        data.add(new Restuarant(R.drawable.croi,"Croi Bakehouse", "3.5",
                "https://goo.gl/maps/FZmeXxWDnJzS9EAt8"));
        data.add(new Restuarant(R.drawable.di,"Di Lusso", "2.6",
                "https://goo.gl/maps/wtH43TFZCWmyvyYBA"));
        data.add(new Restuarant(R.drawable.okku,"Okku", "4.8",
                "https://goo.gl/maps/Q5LkjuJ5M1SpDWi37"));
        data.add(new Restuarant(R.drawable.bedous,"Bedous lounge", "4.2",
                "https://goo.gl/maps/mQQKcP1xe95F2sm67"));
        data.add(new Restuarant(R.drawable.meraki,"Meraki", "3",
                "https://goo.gl/maps/aym2t2A4qrp2UGFE7"));


    }
}
