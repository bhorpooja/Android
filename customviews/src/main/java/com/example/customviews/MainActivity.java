package com.example.customviews;

import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyView view=new MyView(this);
        view.setText("It's My Custom View");
       // view.measure(10,10);
        setContentView(R.layout.activity_main);

    }
}
