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
public class B2Fragment extends RootFragment {


    public B2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_b2, container, false);
        rootView.findViewById(R.id.d_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enterPrevFragment();
            }
        });
        return rootView;
    }
    private void enterPrevFragment() {
        B1Fragment b1Fragment = new B1Fragment();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.addToBackStack(null);
        transaction.replace(R.id.fragment_mainLayout, b1Fragment).commit();
    }

}
