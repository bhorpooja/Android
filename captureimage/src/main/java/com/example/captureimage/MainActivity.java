package com.example.captureimage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static com.example.captureimage.ImagesActivity.RES_FIVE;
import static com.example.captureimage.ImagesActivity.RES_FOUR;
import static com.example.captureimage.ImagesActivity.RES_ONE;
import static com.example.captureimage.ImagesActivity.RES_SIX;
import static com.example.captureimage.ImagesActivity.RES_THREE;
import static com.example.captureimage.ImagesActivity.RES_TWO;

public class MainActivity extends AppCompatActivity {

    public static final int REQ_IMG=1234;
    ImageView imgShow;
    int draw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onSelect(View view) {
                Intent intent=new Intent(getApplicationContext(),ImagesActivity.class);
                startActivityForResult(intent,REQ_IMG);
            }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REQ_IMG){
//                        Bundle bundle=data.getExtras();
                        if (data != null) {
                            imgShow = findViewById(R.id.imgView);

                            draw = data.getIntExtra(RES_ONE, 0);
//                            imgShow.setImageResource(bundle.getInt(ImagesActivity.RES_ONE));
                            imgShow.setImageResource(draw);

                            draw = data.getIntExtra(RES_TWO, 1);
                            imgShow.setImageResource(draw);
//
//                            draw = data.getIntExtra(RES_THREE, 2);
//                            imgShow.setImageResource(draw);
//
//                            draw = data.getIntExtra(RES_FOUR, 3);
//                            imgShow.setImageResource(draw);
//
//                            draw = data.getIntExtra(RES_FIVE, 4);
//                            imgShow.setImageResource(draw);
//
//                            draw = data.getIntExtra(RES_SIX, 5);
//                            imgShow.setImageResource(draw);
                        }
        }
    }
}
