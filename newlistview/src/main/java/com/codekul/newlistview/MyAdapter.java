package com.codekul.newlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by pooja on 10/10/17.
 */

public class MyAdapter extends BaseAdapter {

    private Context context;
    private List<CustItem> dataSet;
    private LayoutInflater inflater;
    public MyAdapter(Context context,List<CustItem> dataSet){
        this.context=context;
        this.dataSet=dataSet;
        this.inflater=LayoutInflater.from(context);
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
    public View getView(int pos, View view, ViewGroup viewGroup) {
        View viewRoot=inflater.inflate(R.layout.cust_item,viewGroup,false);
        ((ImageView)viewRoot.findViewById(R.id.imgVw)).setImageResource(dataSet.get(pos).getImgId());
        ((TextView)viewRoot.findViewById(R.id.txtVw)).setText(dataSet.get(pos).getTxt());

        return viewRoot;
    }
}
