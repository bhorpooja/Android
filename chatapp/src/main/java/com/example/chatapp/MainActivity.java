package com.example.chatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnCam;
    ImageView imgSend,imgMic;
    EditText textMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        btnCam=findViewById(R.id.btnCam);
//        btnCam.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
        textMsg=findViewById(R.id.textMsg);
        imgMic=findViewById(R.id.imgMic);
        imgSend=findViewById(R.id.imgSend);
//        imgMic.setVisibility(1);
//        imgSend.setVisibility(2);
        textMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgMic.setVisibility(View.INVISIBLE);
                imgSend.setVisibility(View.VISIBLE);
            }
        });
    }
}
