package com.codekul.services;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class SongService extends Service {

    private MediaPlayer mp;
    public SongService() {
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mp=MediaPlayer.create(this,R.raw.my);
        mp.start();
        return START_STICKY;
        //return START_NOT_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onDestroy() {
        mp.stop();
        mp.release();

        super.onDestroy();
    }
}
