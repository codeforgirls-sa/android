package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText input;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //views init
        ListView listView=findViewById(R.id.myLV);
        input=findViewById(R.id.userInput);
        //data
        final ArrayList<String> toDoData=new ArrayList<>();
        toDoData.add("clean my room");toDoData.add("study for GRE test");toDoData.add("book for my vacation");
        toDoData.add("walk for 40 min");
        //adapter
        adapter=new ArrayAdapter(MainActivity.this,R.layout.new_item,R.id.t1,toDoData);
        listView.setAdapter(adapter);
        //remove task
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                adapter.remove(toDoData.get(position));
            }
        });
    }
    //add new task action
    public void addTask(View view)
    {
        String task=input.getText().toString();
        if (task.isEmpty())
        {
            Toast.makeText(this,"please enter task name",Toast.LENGTH_LONG);
        }else
        {
           adapter.add(task);
        }
    }
}
