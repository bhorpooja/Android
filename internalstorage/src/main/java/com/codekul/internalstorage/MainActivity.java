package com.codekul.internalstorage;

import android.os.FileObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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
        saveToFile();
    }

    public void onBtnRead(View view){
        readFromFile();
    }

    public void onBtnInfo(View view){
        getFileInfo();
    }

    private  void saveToFile(){

        try {
            final FileOutputStream fos=openFileOutput("My.txt",MODE_APPEND);
            fos.write("Hello, Welcome to Codekul.".getBytes());
            fos.close();
            Toast.makeText(this,"File Saves Successfully",Toast.LENGTH_SHORT).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void readFromFile() {

        try {
            FileInputStream fis=openFileInput("My.txt");
            StringBuilder str=new StringBuilder();
            while (true){
                int ch=fis.read();
                if(ch==-1)  break;
                else str.append((char) ch);
            }
            ((TextView)findViewById(R.id.txtVw)).setText(str.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void getFileInfo(){
        File fileRoot=new File(getFilesDir(),"MyName.txt");
        Log.i(TAG,"Path : "+fileRoot);

        String []files=fileList();
        for (String file:files) {
            Log.i(TAG, "Files : " + file);
        }
    }
}
