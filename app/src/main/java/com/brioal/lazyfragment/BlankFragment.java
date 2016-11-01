package com.brioal.lazyfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by brioal on 16-11-1.
 * Email : brioal@foxmail.com
 * Github : https://github.com/Brioal
 */

public class BlankFragment extends BaseFragment {

    public static BlankFragment getInstance() {
        return new BlankFragment();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }
}
