package com.codekul.externalstorage;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    public static final String TAG=MainActivity.class.getCanonicalName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnSave(View view){

        savePrivate();

    }
    public void onBtnRead(View view){

        readPrivate();

    }
    public void onBtnInfo(View view){
        savePrivate();
    }

    private Boolean isExternalStorageWritable(){

        String state=Environment.getExternalStorageState();
        if(Environment.MEDIA_MOUNTED.equals(state)) {
            return true;
        }
        return false;
    }

    private Boolean isExternalStorageReadable(){

        String state= Environment.getExternalStorageState();
        if(Environment.MEDIA_MOUNTED.equals(state)) {
            return true;
        }
        return false;
    }

    public void savePublic(){

        if(isExternalStorageWritable()){

            File file=new File(Environment.getExternalStoragePublicDirectory("My"),"My.txt");
            try {
                FileOutputStream fos=new FileOutputStream(file);
                fos.write("External Storage ...".getBytes());
                Log.i(TAG,"Path - "+file.getAbsolutePath());
                fos.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void readPublic(){

        if (isExternalStorageReadable()){

            File file=new File(Environment.getExternalStoragePublicDirectory("My"),"My.txt");
            try {
                FileInputStream fin=new FileInputStream(file);
                StringBuilder builder=new StringBuilder();
                while (true){
                    int ch=fin.read();
                    if(ch==-1) break;
                    else builder.append((char)ch);
                }
                ((TextView)findViewById(R.id.txtVw)).setText(builder.toString());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private void savePrivate(){

        if(isExternalStorageWritable()){

            File file=new File(getExternalFilesDir("My"),"My.txt");

            try {
                FileOutputStream fos=new FileOutputStream(file);
                fos.write("External Storage ...".getBytes());
                Log.i(TAG,"Path - "+file.getAbsolutePath());
                fos.close();
            } catch (FileNotFoundException e) {
               e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void readPrivate(){

        if (isExternalStorageReadable()){

            File file=new File(getExternalFilesDir("My"),"My.txt");
            try {
                FileInputStream fin=new FileInputStream(file);
                StringBuilder builder=new StringBuilder();
                while (true){
                    int ch=fin.read();
                    if(ch==-1) break;
                    else builder.append((char)ch);
                }
                ((TextView)findViewById(R.id.txtVw)).setText(builder.toString());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
