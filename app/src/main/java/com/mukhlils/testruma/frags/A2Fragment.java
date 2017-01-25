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
public class A2Fragment extends RootFragment {


    public A2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_a2, container, false);

        rootView.findViewById(R.id.a_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enterAFragment();
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


    private void enterAFragment() {
        A1Fragment a1Fragment = new A1Fragment();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.addToBackStack(null);
        transaction.replace(R.id.fragment_mainLayout, a1Fragment).commit();
    }
    private void enterCFragment() {
        A3Fragment a3Fragment = new A3Fragment();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.addToBackStack(null);
        transaction.replace(R.id.fragment_mainLayout, a3Fragment).commit();
    }

}
