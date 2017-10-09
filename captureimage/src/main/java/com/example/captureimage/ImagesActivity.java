package com.example.captureimage;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static com.example.captureimage.MainActivity.REQ_IMG;


public class ImagesActivity extends AppCompatActivity {

    public static final String RES_ONE="imgOne";
    public static final String RES_TWO="imgTwo";
    public static final String RES_THREE="imgThree";
    public static final String RES_FOUR="imgFour";
    public static final String RES_FIVE="imgFive";
    public static final String RES_SIX="imgSix";
    Intent intent;
    Bundle bundle;
    int drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);

    }

    public void onImgOne(View view) {
        intent   =new Intent();
       // bundle=new Bundle();
        int drawable=R.drawable.ic_boy;
       // bundle.putInt(RES_ONE,drawable);
//        intent.putExtras(bundle);
        intent.putExtra(RES_ONE,drawable);
        setResult(REQ_IMG,intent);
        finish();

    }
//    public void onImgTwo(View view){
//        intent   =new Intent();
//        int drawable=R.drawable.ic_bus;
////        bundle.putInt(RES_TWO,drawable);
////        intent.putExtras(bundle);
//        intent.putExtra(RES_TWO,drawable);
//        setResult(REQ_IMG,intent);
//        finish();
//    }
//    public void onImgThree(View view){
//         intent=new Intent();
//         drawable=R.drawable.ic_cycle;
//       // bundle.putInt(RES_THREE,drawable);
////        intent.putExtras(bundle);
//        intent.putExtra(RES_THREE,drawable);
//         setResult(REQ_IMG,intent);
//         finish();
//    }
//    public void onImgFour(View view){
//        intent=new Intent();
//        drawable=R.drawable.ic_key;
////        bundle.putInt(RES_FOUR,drawable);
////        intent.putExtras(bundle);
//        intent.putExtra(RES_FOUR,drawable);
//        setResult(REQ_IMG,intent);
//        finish();
//    }
//    public void onImgFive(View view){
//        intent=new Intent();
//        drawable=R.drawable.ic_login;
////        bundle.putInt(RES_FIVE,drawable);
////        intent.putExtras(bundle);
//        intent.putExtra(RES_FIVE,drawable);
//        setResult(REQ_IMG,intent);
//        finish();
//
//    }
//    public void onImgSix(View view){
//        intent=new Intent();
//        drawable=R.drawable.ic_users;
////        bundle.putInt(RES_SIX,drawable);
////        intent.putExtras(bundle);
//        intent.putExtra(RES_SIX,drawable);
//        setResult(REQ_IMG,intent);
//        finish();
//
//    }

}
