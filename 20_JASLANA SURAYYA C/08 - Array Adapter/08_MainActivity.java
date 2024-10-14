package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.ListView;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;


public class MainActivity extends AppCompatActivity {
    String fruitlist[] = {"apple", "orange", "banana", "cherry", "dates"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_list_view, R.id.textview, fruitlist);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("ListView", "Item is clicked @position" + position);
                if (position == 0) {
                    startActivity(new Intent(MainActivity.this, apple.class));
                } else if (position == 1) {
                    startActivity(new Intent(MainActivity.this, orange.class));
                } else if (position == 2) {
                    startActivity(new Intent(MainActivity.this, banana.class));
                } else if (position == 3) {
                    startActivity(new Intent(MainActivity.this, dates.class));
                } else if (position == 4) {
                    startActivity(new Intent(MainActivity.this, cherry.class));
                }
            }
        });
    }
}

