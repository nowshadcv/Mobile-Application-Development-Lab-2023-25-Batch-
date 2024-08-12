package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Lifecycle","onCreate Invoked");
    }
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle","onStart invoked");
    }
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle","onResume Invoked");
    }
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle","onPause invoked");
    }
    protected void onStop() {
        super.onStop();
        Log.d("LIFECYCLE","onStop Invoked");
    }
    protected void onRestart() {
        super.onRestart();
        Log.d("LIFECYCLE","onRestart Invoked");
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LIFECYCLE","onDestroy Invoked");
    }
}