package com.codingdemos.places;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    int[] mPlaceList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(MainActivity.this, 2);
        mRecyclerView.setLayoutManager(mGridLayoutManager);

        mPlaceList = new int[]{R.drawable.image_1, R.drawable.image_2, R.drawable.image_3,
                R.drawable.image_4, R.drawable.image_5, R.drawable.image_6, R.drawable.image_7,
                R.drawable.image_8, R.drawable.image_9, R.drawable.image_10, R.drawable.image_11,
                R.drawable.image_12, R.drawable.image_13, R.drawable.image_14};

        MyAdapter myAdapter = new MyAdapter(MainActivity.this, mPlaceList);
        mRecyclerView.setAdapter(myAdapter);
    }
}
