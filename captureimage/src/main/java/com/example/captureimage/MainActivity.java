package com.example.captureimage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {

    public static final int REQ_IMG=1234;
    ImageView imgShow;

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
            if(resultCode==RESULT_OK) {
                       Bundle bundle=data.getExtras();
                if (bundle != null) {
                    imgShow = findViewById(R.id.imgView);
                    imgShow.setImageResource(bundle.getInt(ImagesActivity.RES_PROCESSING));

                }
            }
        }
    }
}
