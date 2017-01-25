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
public class A1Fragment extends RootFragment {


    public A1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_a1, container, false);

        rootView.findViewById(R.id.b_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enterBFragment();
            }
        });
        rootView.findViewById(R.id.c_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enterCFragment();
            }
        });

        return rootView;
    }
    private void enterBFragment() {
        A2Fragment a2Fragment = new A2Fragment();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.addToBackStack(null);
        transaction.replace(R.id.fragment_mainLayout, a2Fragment).commit();
    }
    private void enterCFragment() {
        A3Fragment a3Fragment = new A3Fragment();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.addToBackStack(null);
        transaction.replace(R.id.fragment_mainLayout, a3Fragment).commit();
    }
}
