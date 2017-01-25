package com.mukhlils.testruma.frags;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mukhlils.testruma.R;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class A3Fragment extends RootFragment {


    public A3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_a3, container, false);
        rootView.findViewById(R.id.a_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enterAFragment();
            }
        });
        rootView.findViewById(R.id.b_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enterBFragment();
            }
        });
        return rootView;
    }
    private void enterAFragment() {
        A1Fragment a1Fragment = new A1Fragment();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.addToBackStack(null);
        transaction.replace(R.id.fragment_mainLayout, a1Fragment).commit();
    }
    private void enterBFragment() {
        A2Fragment a2Fragment = new A2Fragment();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.addToBackStack(null);
        transaction.replace(R.id.fragment_mainLayout, a2Fragment).commit();
    }
}
