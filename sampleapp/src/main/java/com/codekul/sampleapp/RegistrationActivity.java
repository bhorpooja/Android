package com.codekul.sampleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity {


    public static final String RES_USER="usrDone";
    public static final String RES_PWD="pwdDone";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }
    public void onRegister(View view){
        Intent intent=new Intent();
        Bundle bundle=new Bundle();
       String name= ((EditText)findViewById(R.id.edtUser)).getText().toString();
      bundle.putString(RES_USER,name);
       String pwd=((EditText)findViewById(R.id.edtPwd)).getText().toString();
       bundle.putString(RES_PWD,pwd);
       intent.putExtras(bundle);
       setResult(RESULT_OK,intent);
       finish();


    }
}
