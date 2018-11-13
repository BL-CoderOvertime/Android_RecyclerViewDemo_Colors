package com.lambdaschool.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ColorData> colorDataList;

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    ColorDataListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorDataList = ColorDataFactory.getColorDataList();
        Log.i("Factory called", colorDataList.toString());

        recyclerView = findViewById(R.id.recycler_view);
        layoutManager = new LinearLayoutManager(this);
        listAdapter = new ColorDataListAdapter(colorDataList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(listAdapter);
    }
}
