package com.example.explicit_intents;

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
                imageview.setImageResource(R.drawable.lion2);
                break;
            case "3":
                imageview.setImageResource(R.drawable.lion3);
                break;
            case "4":
                imageview.setImageResource(R.drawable.lion4);
                break;
        }
    }

}