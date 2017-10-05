package com.example.captureimage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;

import static com.example.captureimage.MainActivity.REQ_ONE;

public class ImagesActivity extends AppCompatActivity {

    public static final String RES_ONE="resOne";
    public static final String DRAW="Drawable";
    private ImageView imgOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);

    }

    public void onImgClick(View view) {
        imgOne=findViewById(R.id.imgOne);
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.ic_boy);
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG,100,baos);
        byte[] b=baos.toByteArray();

        Intent intent=new Intent();
        intent.putExtra(DRAW,b);
        setResult(REQ_ONE,intent);
       finish();

    }
}
