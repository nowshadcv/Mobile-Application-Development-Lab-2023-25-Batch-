package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Log.d("life cycle", "onCreate invoked ");

        }
        protected void onStart(){
            super.onStart();
            Log.d("life cycle", "onStart invoked");
        }
        protected void onResume(){
            super.onResume();
            Log.d("life cycle", "onResume invoked");

        }
        protected void onPause(){
            super.onPause();
            Log.d("life cycle", "onPause invoked");
        }
        protected void  onStop(){
            super.onStop();
            Log.d("life cycle", "onStop invoked");
        }
        protected void onRestart(){
            super.onRestart();
            Log.d("life cycle", "onRestart invoked");
        }
        protected void onDestroy(){
            super.onDestroy();
            Log.d("life cycle", "onDestroy invoked");
        }
    }