package com.example.explicit;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            String imgindex=bundle.getString("ImageIndex");
            SetImage(imgindex);
        }
    }

    private void SetImage(String imgindex) {
        ImageView imageview = (ImageView) findViewById(R.id.img1);
        switch (imgindex)
        {
            case "1":
                imageview.setImageResource(R.drawable.apple);
                break;
            case "2":
                imageview.setImageResource(R.drawable.pineapple);
                break;
            case "3":
                imageview.setImageResource(R.drawable.grape);
                break;
            case "4":
                imageview.setImageResource(R.drawable.pomegranate);
                break;
            default:
                Toast.makeText(ImageActivity.this, "Invalid input", Toast.LENGTH_SHORT).show();

        }
    }

}