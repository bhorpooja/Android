package com.codekul.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ImageFragment extends Fragment {


    public static final String KEY_IMG="img";

    public static ImageFragment getInstance(int img){
        ImageFragment im=new ImageFragment();
        Bundle bundle=new Bundle();
        bundle.putInt(KEY_IMG,img);
        im.setArguments(bundle);
        return im;

    }
    public ImageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rtVw=inflater.inflate(R.layout.fragment_image, container, false);
        Bundle bundle=getArguments();
        if (bundle!=null) {
            int img = bundle.getInt("img");
            ((ImageView) rtVw.findViewById(R.id.imgVw)).setImageResource(img);
        }
        return rtVw;
    }

}
