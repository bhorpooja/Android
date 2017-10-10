package com.codekul.newlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> dataSet=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        normalList();

        dataSet.add("Android");
        dataSet.add("Spring");
        dataSet.add("Java");
        dataSet.add("Angular");
        dataSet.add("iOS");
        dataSet.add("PHP");
        dataSet.add(".NET");
        dataSet.add("c#");


        ArrayAdapter arrayAdapter=new ArrayAdapter(this ,android.R.layout.simple_list_item_1,dataSet);
        ListView listView=findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener((adapterView, view, pos, id) -> {
            ((EditText)findViewById(R.id.edtMbl)).setText(dataSet.get(pos));
        });

       listView.setOnItemLongClickListener((adapterView, view, pos, id) ->{
               dataSet.remove(pos);
                arrayAdapter.notifyDataSetChanged();
                return true;
       });
    }
    public void onAdd(View view){
        dataSet.add(((EditText)findViewById(R.id.edtMbl)).getText().toString());
        ArrayAdapter<String> adapter=(ArrayAdapter<String>)((ListView)findViewById(R.id.listView)).getAdapter();
        adapter.notifyDataSetChanged();

    }

}
