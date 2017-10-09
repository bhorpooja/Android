package com.codekul.listviewdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    public static final String KEY_DESC="Desc";
    public static final int REQ_ONE=1234;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,getList());
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Bundle bundle = new Bundle();
                bundle.putString(KEY_DESC, " This is one number, which is starting. There is one only.");

                Intent intent = new Intent(getApplicationContext(), OneActivity.class);
                intent.putExtras(bundle);
                //startActivity(intent);
                startActivityForResult(intent, REQ_ONE);
            }
        });
    }
    private List<String> getList(){
        List<String> list=new ArrayList<>();
        list.add("Pooja");
        list.add("Sonal");
        list.add("Pradnya");
        list.add("Shraddha");
            return list;
    }
}
