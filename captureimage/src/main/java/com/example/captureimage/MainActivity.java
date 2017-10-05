package com.example.captureimage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static com.example.captureimage.ImagesActivity.DRAW;

public class MainActivity extends AppCompatActivity {

    public static final int REQ_ONE=1234;
    ImageView imgShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onSelect(View view) {
                Intent intent=new Intent(getApplicationContext(),ImagesActivity.class);
                startActivityForResult(intent,REQ_ONE);
            }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REQ_ONE){
                if (data!=null){
                    Bundle bundle=getIntent().getExtras();
                   byte[] b=bundle.getByteArray("boy");
                    Bitmap bitmap= BitmapFactory.decodeByteArray(b,0,b.length);

                    imgShow=findViewById(R.id.imgView);
                    imgShow.setImageBitmap(bitmap);

            }
        }
    }
}
