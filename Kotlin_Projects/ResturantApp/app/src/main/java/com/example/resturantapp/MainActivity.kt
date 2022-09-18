package com.example.resturantapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var list:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list=findViewById(R.id.lv)

        var arr: ArrayList<Resturant> = ArrayList()

        arr.add(Resturant(R.drawable.lavash,"LAVASH", "5",
                "https://goo.gl/maps/zThtieX1pSNnd9j77"))
                arr.add(Resturant(R.drawable.mezoo,"Mezoo", "4.3",
                    "https://goo.gl/maps/3F75QR1YtAFWhXbf6"))
        arr.add(Resturant(R.drawable.roka,"ROKA", "4",
            "https://goo.gl/maps/nB3YeyPXgLrpPHNr6"))
        arr.add(Resturant(R.drawable.croi,"Croi Bakehouse", "3.5",
            "https://goo.gl/maps/FZmeXxWDnJzS9EAt8"))
        arr.add(Resturant(R.drawable.di,"Di Lusso", "2.6",
            "https://goo.gl/maps/wtH43TFZCWmyvyYBA"))
        arr.add(Resturant(R.drawable.okku,"Okku", "4.8",
            "https://goo.gl/maps/Q5LkjuJ5M1SpDWi37"))
        arr.add(Resturant(R.drawable.bedous,"Bedous lounge", "4.2",
            "https://goo.gl/maps/mQQKcP1xe95F2sm67"))
        arr.add(Resturant(R.drawable.meraki,"Meraki", "3",
            "https://goo.gl/maps/aym2t2A4qrp2UGFE7"))

val ad:MyAdapter= MyAdapter(this, arr)
        list.adapter= ad

    }
}