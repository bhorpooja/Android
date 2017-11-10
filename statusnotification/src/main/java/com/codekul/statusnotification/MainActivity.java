package com.codekul.statusnotification;

import android.app.Notification;
import android.app.NotificationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final int NOTIFICATION_SAMPLE=1234;
    private NotificationManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
    }

    public void onBtnOkay(View view){
        Notification.Builder builder=new Notification.Builder(this)
                .setContentInfo("Content Info")
                .setContentText("Content Text")
                .setContentTitle("Content Title")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setDefaults(Notification.DEFAULT_ALL)
                .setOngoing(true);
        Notification notification=builder.build();
       manager.notify(NOTIFICATION_SAMPLE,notification);

    }
}
