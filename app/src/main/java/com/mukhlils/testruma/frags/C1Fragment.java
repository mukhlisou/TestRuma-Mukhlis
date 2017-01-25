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
public class C1Fragment extends RootFragment {

    public C1Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_c1, container, false);


        return rootView;
    }


}
