package com.example.explicit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;




import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
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
                imageview.setImageResource(R.drawable.img1);
                break;
            case "2":
                imageview.setImageResource(R.drawable.img2);
                break;
            case "3":
                imageview.setImageResource(R.drawable.img3);
                break;
            case "4":
                imageview.setImageResource(R.drawable.img4);
                break;
            default:
                Toast.makeText(MainActivity2.this, "Wrong input", Toast.LENGTH_SHORT).show();
        }
    }

}