package com.codekul.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnSave(View view){
//        SharedPreferences prefs=getPreferences(MODE_APPEND);

        SharedPreferences prefs=getSharedPreferences("MyPrefs", MODE_PRIVATE);
        SharedPreferences.Editor editor=prefs.edit();
        editor.putBoolean("bool",true);
        editor.putInt("_int",12);
        editor.putString("_string","Hello World");
        editor.apply();
    }

    public void onBtnRead(View view){

        SharedPreferences prefs=getSharedPreferences("MyPrefs",MODE_PRIVATE);
        Boolean bool=prefs.getBoolean("bool",false);
        Integer _int=prefs.getInt("_int",-1);
        String _string=prefs.getString("_string","none");
        ((TextView)findViewById(R.id.txtVw)).setText("\n Boolean : "+bool+"\n Integer :"+_int+"\n String :"+_string);

    }
}
