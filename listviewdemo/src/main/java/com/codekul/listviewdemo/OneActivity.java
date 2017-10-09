package com.codekul.listviewdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        Intent parentIntent=getIntent();
        Bundle bundle=parentIntent.getExtras();
        String desc=bundle.getString(MainActivity.KEY_DESC);
        ((TextView)findViewById(R.id.textView)).setText(desc);
    }
}
