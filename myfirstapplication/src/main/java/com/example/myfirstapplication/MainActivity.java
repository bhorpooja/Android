package com.example.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

class MainActivity extends AppCompatActivity{

    Button btn_login;
    EditText uname;
    EditText pass;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState)
        {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_login=findViewById(R.id.button);
        uname=findViewById(R.id.editText);
        pass=findViewById(R.id.editText2);
        result=findViewById(R.id.textView2);

            btn_login.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(uname.getText().toString().equals("pooja")&&pass.getText().toString().equals("pooja")){
                    result.setText("login success");
                }
                else {
                    result.setText("not success");
                }
            }
        });
        }

}
