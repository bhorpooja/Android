package com.example.imagething;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBoy = findViewById(R.id.btnBoy);
        Button btnCycle = findViewById(R.id.btnCycle);
        Button btnBus = findViewById(R.id.btnBus);
        ImageView imgCrd = findViewById(R.id.imgCrd);
        //traditional approach

//        btnBoy.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                imgCrd.setImageResource(R.drawable.ic_boy);
//            }
//        });

//        View.OnClickListener listner = new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                imgCrd.setImageResource(R.drawable.ic_boy);
//            }
//        };
//        btnBoy.setOnClickListener(listner);

        //java8 lambda
        btnCycle.setOnClickListener(view -> imgCrd.setImageResource(R.drawable.ic_cycle));

        //java8 method reference
        btnBus.setOnClickListener(this::onCycle);
    }
        private void onCycle(View view){
            ((ImageView)findViewById(R.id.imgCrd)).setImageResource(R.drawable.ic_bus);

        }


        public void onImgClick(View view) {

            ((ImageView)findViewById(R.id.imgCrd)).setImageResource(R.drawable.ic_launcher_background);

    }
    }

