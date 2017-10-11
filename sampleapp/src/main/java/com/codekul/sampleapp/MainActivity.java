package com.codekul.sampleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int REQ_REGISTER=1234;
    public static final int REQ_LOGIN=1235;
    public static final String KEY_LOGIN="success";
    private TextView txtUsr;
    private EditText edtPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRegistration(View view){
        Intent intent=new Intent(this,RegistrationActivity.class);
        startActivityForResult(intent,REQ_REGISTER);
    }

    public void onLogin(View view){

        if(txtUsr!=null && edtPwd!=null){
        Bundle bundle=new Bundle();
        bundle.putString(KEY_LOGIN,"Login Successfully..Welcome..!");
        Intent intent=new Intent(this,LoginActivity.class);
        intent.putExtras(bundle);
        startActivityForResult(intent,REQ_LOGIN);
        }
        else {
            Bundle bundle=new Bundle();
            bundle.putString(KEY_LOGIN,"Login Not Successfully..First do registration..?");
            Intent intent=new Intent(this,LoginActivity.class);
            intent.putExtras(bundle);
            startActivityForResult(intent,REQ_LOGIN);

        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==REQ_REGISTER){
            if(resultCode==RESULT_OK){
                Bundle bundle=data.getExtras();
                if(bundle!=null){
                    txtUsr=findViewById(R.id.txtUsr);
                    txtUsr.setText(bundle.getString(RegistrationActivity.RES_USER));
                    edtPwd=findViewById(R.id.edtPwd);
                    edtPwd.setText(bundle.getString(RegistrationActivity.RES_PWD));
                }
            }

        }

    }
}
