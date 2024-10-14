package com.example.arrayadapterwithlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String fruitlist [] = {"apple","orange","banana","dates","cherry"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView) findViewById(R.id.list);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, R.layout.activity_main2,R.id.textview,fruitlist);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Log.i("ListView","Item is clicked @position "+position);
                if(position==0)
                {
                    startActivity(new Intent(MainActivity.this,MainActivity4.class));
                }
                else if(position==1)
                {
                    startActivity(new Intent(MainActivity.this,MainActivity5.class));
                }
                else if(position==2)
                {
                    startActivity(new Intent(MainActivity.this, MainActivity3.class));
                }
                else if(position==3)
                {
                    startActivity(new Intent(MainActivity.this,MainActivity6.class));
                }
                else if(position==4)
                {
                    startActivity(new Intent(MainActivity.this, MainActivity7.class));
                }

            }
        });
    }
}