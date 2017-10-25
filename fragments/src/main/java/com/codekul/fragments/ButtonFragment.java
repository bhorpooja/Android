package com.codekul.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ButtonFragment extends Fragment {


    public ButtonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rtVw=inflater.inflate(R.layout.fragment_button, container, false);
        rtVw.findViewById(R.id.btnCycle).setOnClickListener(this::onCycle);
        rtVw.findViewById(R.id.btnBus).setOnClickListener(this::onBus);
        rtVw.findViewById(R.id.btnBoy).setOnClickListener(this::onBoy);
        return rtVw;
    }

    private void onBoy(View view) {
        ((MainActivity)getActivity()).loadFragment(ImageFragment.getInstance(R.drawable.ic_boy));
    }

    private void onBus(View view) {
        ImageFragment frag=new ImageFragment();
        Bundle bundle=new Bundle();
        bundle.putInt("img",R.drawable.ic_bus);
        frag.setArguments(bundle);
        ((MainActivity)getActivity()).loadFragment(frag);
    }

    private void onCycle(View view) {

        ((MainActivity) getActivity()).loadFragment(ImageFragment.getInstance(R.drawable.ic_cycle));
    }

}
