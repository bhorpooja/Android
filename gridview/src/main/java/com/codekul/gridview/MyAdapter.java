package com.codekul.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by pooja on 13/10/17.
 */

public class MyAdapter extends BaseAdapter{


    private final Context context;
    private final ArrayList<MyItem> dataSet;
    private LayoutInflater inflater;
    public MyAdapter(Context context, ArrayList<MyItem> dataSet) {
        this.context=context;
        this.dataSet=dataSet;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dataSet.size();
    }

    @Override
    public Object getItem(int pos) {
        return dataSet.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {

        View view=inflater.inflate(R.layout.grid_item,parent,false);

        ((ImageView)view.findViewById(R.id.imgIc)).setImageResource(dataSet.get(pos).img);
        ((TextView)view.findViewById(R.id.txtName)).setText(dataSet.get(pos).txt);

        return view;
    }
}
