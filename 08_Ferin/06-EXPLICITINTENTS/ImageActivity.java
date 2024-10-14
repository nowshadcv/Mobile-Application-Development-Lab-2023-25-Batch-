package com.example.explicitintents;
import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.widget.ImageView;

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
                imageview.setImageResource(R.drawable.lion1);
                break;
            case "2":
                imageview.setImageResource(R.drawable.tiger1);
                break;
            case "3":
                imageview.setImageResource(R.drawable.elephant);
                break;
            case "4":
                imageview.setImageResource(R.drawable.zebra);
                break;
        }
    }

}