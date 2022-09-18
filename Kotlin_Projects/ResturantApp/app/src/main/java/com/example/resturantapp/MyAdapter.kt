package com.example.resturantapp

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(var context: Context, var Arr: ArrayList<Resturant>) : BaseAdapter() {


    override fun getCount(): Int {
        return Arr.size
    }

    override fun getItem(p0: Int): Any {
        TODO("Not yet implemented")
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()

    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
val view:View= View.inflate(context, R.layout.list_item, null)

         var name: TextView = view.findViewById(R.id.name)
        var rating: TextView = view.findViewById(R.id.rating)
        var img: ImageView= view.findViewById(R.id.imageView)
        var loc: ImageView = view.findViewById(R.id.locition)
        name.text= Arr.get(p0).name
        rating.text=Arr.get(p0).rating
        img.setImageResource(Arr.get(p0).img)

loc.setOnClickListener(View.OnClickListener {
val i= Intent(Intent.ACTION_VIEW, Uri.parse(Arr.get(p0).location))
    context.startActivity(i)
})
return view
    }
}