package com.codekul.sampleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        ((TextView)findViewById(R.id.txtLogin)).setText(bundle.getString(MainActivity.KEY_LOGIN));
    }
}
