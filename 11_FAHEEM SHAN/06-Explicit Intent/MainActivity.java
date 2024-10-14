package com.example.explicit;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnIndexSendButtonClicked(View view){
        Intent intent = new Intent(this,MainActivity2.class);

        EditText editText = findViewById(R.id.text);
        String index =editText.getText().toString();
        intent.putExtra("ImageIndex",index);
        startActivity(intent);
    }
}