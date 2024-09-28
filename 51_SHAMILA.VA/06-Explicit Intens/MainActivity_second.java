package com.example.explicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity_second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_second2);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            String imgindex=bundle.getString("ImageIndex");
            SetImage(imgindex);
        }
    }

    private void SetImage(String imgindex) {
        ImageView imageview = (ImageView) findViewById(R.id.image);
        switch (imgindex)
        {
            case "0":
                imageview.setImageResource(R.drawable.fruits);
                break;
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
                imageview.setImageResource(R.drawable.pomagranate);
                break;
            default:
                Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        }
    }

}