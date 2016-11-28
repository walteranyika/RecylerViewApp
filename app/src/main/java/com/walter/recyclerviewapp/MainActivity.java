package com.walter.recyclerviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Person> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv= (RecyclerView) findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        initializeData();
        RVAdapter adapter=new RVAdapter(list);
        rv.setAdapter(adapter);
    }

    private void initializeData()
    {
        list.add(new Person("John Mark","24",R.mipmap.ic_launcher));
        list.add(new Person("Hellen Sambili","29",R.mipmap.ic_launcher));
        list.add(new Person("Tom Juma","54",R.mipmap.ic_launcher));
        list.add(new Person("Thomas Edison","55",R.mipmap.ic_launcher));
        list.add(new Person("Humprey Mieno","36",R.mipmap.ic_launcher));
    }
}
