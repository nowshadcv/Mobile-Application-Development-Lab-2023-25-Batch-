package com.example.arraylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String cars[] = {"Lamborghini","Ferrari","AstonMartin","BMW"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.activity_list,R.id.textview,cars);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("ListView","Item is clicked @position" +position);
                if (position==0) {
                    startActivity(new Intent(MainActivity.this,BMW.class));

                }
                else if (position==1) {

                    startActivity(new Intent(MainActivity.this,Aston_Martin.class));
                }
                else if (position == 2){
                    startActivity(new Intent(MainActivity.this,Lamborghini.class));
                } else if (position==3) {
                    startActivity(new Intent(MainActivity.this,Ferrari.class));
                }
            }
        });
    }
}