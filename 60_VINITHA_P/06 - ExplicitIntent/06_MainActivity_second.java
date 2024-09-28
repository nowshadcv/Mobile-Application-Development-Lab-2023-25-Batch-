package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity_second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_second2);
                Bundle bundle=getIntent().getExtras();
                if(bundle!=null){
                    String imgindex=bundle.getString("ImageIndex");
                    setImage(imgindex);
                }
            }

            private void setImage(String index) {
                ImageView imageView=(ImageView) findViewById(R.id.img1);
                switch(index){
                    case "1":
                        imageView.setImageResource(R.drawable.image);
                        break;
                    case "2":
                        imageView.setImageResource(R.drawable.image1);
                        break;
                    case "3":
                        imageView.setImageResource(R.drawable.image2);
                        break;
                    case "4":
                        imageView.setImageResource(R.drawable.image3);
                        break;
                }
            }

        }


