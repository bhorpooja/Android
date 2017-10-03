package com.example.interactivitycommunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnOne).setOnClickListener(this::onOne);

        findViewById(R.id.btnTwo).setOnClickListener(this::onTwo);
    }

    private void onOne(View view) {
        Intent intent=new Intent(this,OneActivity.class);
        startActivity(intent);
    }

    private void onTwo(View view) {
        Intent intent=new Intent(this,TwoActivity.class);
        startActivity(intent);
    }
}
