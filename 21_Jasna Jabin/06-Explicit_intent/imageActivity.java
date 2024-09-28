package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class imageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String imgindex = bundle.getString("ImageIndex");
            SetImage(imgindex);
        }
    }

    private void SetImage(String imgindex) {
        ImageView imageview = (ImageView) findViewById(R.id.img1);
        switch (imgindex) {
            case "1":
                imageview.setImageResource(R.drawable.apple);
                break;
            case "2":
                imageview.setImageResource(R.drawable.orange);
                break;
            case "3":
                imageview.setImageResource(R.drawable.pineapple);
                break;
            case "4":
                imageview.setImageResource(R.drawable.pomengranate);
                break;
            default:
                Toast.makeText(this, "Invalid index", Toast.LENGTH_SHORT).show();
        }
    }
}