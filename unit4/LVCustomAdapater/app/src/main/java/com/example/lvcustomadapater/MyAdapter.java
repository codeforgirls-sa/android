package com.example.lvcustomadapater;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    Context context;
    ArrayList<Restuarant> data;
    public MyAdapter(Context context,ArrayList<Restuarant> Data)
    {
        this.context=context;
        this.data=Data;
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView=layoutInflater.inflate(R.layout.list_item, null);
        final TextView name=convertView.findViewById(R.id.name);
        TextView rating=convertView.findViewById(R.id.rating);
        Button Location=convertView.findViewById(R.id.showLocation);
        //set Data
        name.setText(data.get(position).name);
        rating.setText("Rating:"+data.get(position).rating);
        Location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(data.get(position).locationLink));
                context.startActivity(intent);
            }
        });


        return convertView;
    }
}
