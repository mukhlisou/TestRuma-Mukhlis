package com.mukhlils.testruma.frags;

import android.support.v4.app.Fragment;

import com.mukhlils.testruma.BackPressImpl;
import com.mukhlils.testruma.OnBackPressListener;

/**
 * Created by shahabuddin on 6/6/14.
 */
public class RootFragment extends Fragment implements OnBackPressListener {

    @Override
    public boolean onBackPressed() {
        return new BackPressImpl(this).onBackPressed();
    }
}
