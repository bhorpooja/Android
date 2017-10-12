package com.codekul.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msg("onCreate");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        msg("onRestart");
    }

    @Override
    protected void onStart() {
            super.onStart();
            msg("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        msg("onResume");
    }

    @Override
    protected void onPause() {
        msg("onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        msg("onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        msg("onDestroy");
        super.onDestroy();
    }
    private void msg(String mm){
        Toast.makeText(this,mm,Toast.LENGTH_SHORT).show();
    }
}
