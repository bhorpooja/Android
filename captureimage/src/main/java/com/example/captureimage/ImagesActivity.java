package com.example.captureimage;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static com.example.captureimage.MainActivity.REQ_IMG;


public class ImagesActivity extends AppCompatActivity {

    public static final String RES_PROCESSING="imgDrawable";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);

    }

    public void onImgOne(View view) {
       Intent intent   =new Intent();
       Bundle bundle=new Bundle();
        int drawable=R.drawable.ic_boy;
        bundle.putInt(RES_PROCESSING,drawable);
        intent.putExtras(bundle);
        setResult(RESULT_OK,intent);
        finish();

    }
    public void onImgTwo(View view){
       Intent intent=new Intent();
       Bundle bundle=new Bundle();
        int drawable=R.drawable.ic_bus;
        bundle.putInt(RES_PROCESSING,drawable);
        intent.putExtras(bundle);
        setResult(RESULT_OK,intent);
        finish();
    }
    public void onImgThree(View view){
        Intent intent=new Intent();
        Bundle bundle=new Bundle();
        int drawable=R.drawable.ic_cycle;
        bundle.putInt(RES_PROCESSING,drawable);
        intent.putExtras(bundle);
        setResult(RESULT_OK,intent);
        finish();
    }
    public void onImgFour(View view){
        Intent intent=new Intent();
        Bundle bundle=new Bundle();
        int drawable=R.drawable.ic_key;
        bundle.putInt(RES_PROCESSING,drawable);
        intent.putExtras(bundle);
        setResult(RESULT_OK,intent);
        finish();
    }
    public void onImgFive(View view){
        Intent intent=new Intent();
        Bundle bundle=new Bundle();
        int drawable=R.drawable.ic_login;
        bundle.putInt(RES_PROCESSING,drawable);
        intent.putExtras(bundle);
        setResult(RESULT_OK,intent);
        finish();

    }
    public void onImgSix(View view){
        Intent intent=new Intent();
        Bundle bundle=new Bundle();
        int drawable=R.drawable.ic_users;
        bundle.putInt(RES_PROCESSING,drawable);
        intent.putExtras(bundle);
        setResult(RESULT_OK,intent);
        finish();

    }

}
