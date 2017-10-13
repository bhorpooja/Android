package com.codekul.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<MyItem> dataSet=new ArrayList<>();
        dataSet.add(new MyItem(R.mipmap.ic_launcher,"Launcher"));
        dataSet.add(new MyItem(R.drawable.ic_settings,"Setting"));
        dataSet.add(new MyItem(R.drawable.ic_file_manager,"FileManager"));
        dataSet.add(new MyItem(R.drawable.ic_playstore,"Play Store"));
        dataSet.add(new MyItem(R.drawable.ic_gallery_,"Gallery"));
        dataSet.add(new MyItem(R.drawable.ic_gmail,"Email"));
        dataSet.add(new MyItem(R.drawable.ic_search,"Google"));
        dataSet.add(new MyItem(R.drawable.ic_photo_camera,"Camera"));

        dataSet.add(new MyItem(R.drawable.ic_alarm_clock,"Clock"));
        dataSet.add(new MyItem(R.drawable.ic_calendar,"Calendar"));
        dataSet.add(new MyItem(R.drawable.ic_music_player,"Music"));
        dataSet.add(new MyItem(R.drawable.ic_youtube,"YouTube"));
        dataSet.add(new MyItem(R.drawable.ic_phone_book,"Contacts"));
        dataSet.add(new MyItem(R.drawable.ic_facebook,"Facebook"));
        dataSet.add(new MyItem(R.drawable.ic_whatsapp,"WhatsApp"));
        dataSet.add(new MyItem(R.drawable.ic_twitter,"Twitter"));
        MyAdapter adapter=new MyAdapter(this,dataSet);
        ((GridView)findViewById(R.id.gridItem)).setAdapter(adapter);
    }
}
