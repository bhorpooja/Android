package com.codekul.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new ImageFragment());
    }

    public void loadFragment(Fragment frag) {
        String backStateName=frag.getClass().getName();
        FragmentManager fm=getSupportFragmentManager();
        boolean fragPopped=fm.popBackStackImmediate(backStateName,0);
        if (!fragPopped) {
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frameLayout, frag);
            ft.addToBackStack(backStateName);
            ft.commit();
        }

    }

    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount()==1){
            finish();
        }
        else {
            super.onBackPressed();
        }
    }
}
