package com.example.listviewprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String Fruitlist [] = {"banana","apple","orange","dates"};
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview=(android.widget.ListView) findViewById(R.id.list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,R.layout.activity_listview,R.id.textview,Fruitlist);
        listview.setAdapter(arrayAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Log.i("ListView","item is calicked @position "+position);
                if(position==0){
                    startActivity(new Intent(MainActivity.this,banana.class));
                }
                else if (position==1){
                    startActivity(new Intent(MainActivity.this,apple.class));
                }
                else if(position==2){
                    startActivity(new Intent(MainActivity.this,orange.class));
                }
                else if(position==3){
                    startActivity(new Intent(MainActivity.this,dates.class));
                }
            }
        });

    }
}