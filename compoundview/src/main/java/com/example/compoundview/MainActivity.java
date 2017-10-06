package com.example.compoundview;

import android.graphics.Interpolator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    private LayoutInflater inflater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onBtnOk(View view){

        inflater= (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
//        inflater=getLayoutInflater();
//        inflater=LayoutInflater.from(this);
        FrameLayout frame=findViewById(R.id.frame);
        frame.removeAllViews();

        View viewInflated=inflater.inflate(R.layout.compound_view,frame,true);
        viewInflated.findViewById(R.id.imgVw).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim=AnimationUtils.loadAnimation(MainActivity.this,R.anim.bounce);
                anim.setInterpolator(new WobblyBounceInterpolator(0.3,30));
                view.startAnimation(anim);
            }
        });

        viewInflated.findViewById(R.id.txtVw).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation anim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.bounce);
                view.startAnimation(anim);
            }
        });

    }
    private class WobblyBounceInterpolator implements android.view.animation.Interpolator{

        private double amplitude;
        private double frequency;
        WobblyBounceInterpolator(double amplitude,double frequency){
            this.amplitude=amplitude;
            this.frequency=frequency;
        }
        @Override
        public float getInterpolation(float time) {
            return (float) (-1 * Math.pow(Math.E, -time / amplitude)*Math.cos(frequency * time) + 1);
        }
    }

}
