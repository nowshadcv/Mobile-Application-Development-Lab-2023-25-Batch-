
package com.example.explicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
                imageview.setImageResource(R.drawable.s23);
                break;
            case "2":
                imageview.setImageResource(R.drawable.s24);
                break;
            case "3":
                imageview.setImageResource(R.drawable.s22);
                break;
            case "4":
                imageview.setImageResource(R.drawable.s21);
                break;
            default:
                Toast.makeText(MainActivity2.this,"Wrong Input",Toast.LENGTH_SHORT).show();
                break;
        }

    }

}
