package com.example.swap_string;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MyMessage extends Activity {
    TextView t;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Intent secondActivity = getIntent();
        t=(TextView) findViewById(R.id.msg_text_view);
        String result=secondActivity.getStringExtra("same");
        t.setText(result);

    }
}