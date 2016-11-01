package com.brioal.lazyfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;

/**
 * Created by brioal on 16-11-1.
 * Email : brioal@foxmail.com
 * Github : https://github.com/Brioal
 */

public class BaseFragment extends Fragment {
    private boolean isViewPrepared = false; //View
    private boolean hasFetcherData = false;



    //Load Data
    public void lazyLoadData() {
        Log.i("BaseFragment", System.currentTimeMillis()+"LoadData");
    }

    //Judge To Load Data
    public void judgeLoadData() {
        if (getUserVisibleHint() && !hasFetcherData && isViewPrepared) {
            hasFetcherData = true;
            lazyLoadData();
        }
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        isViewPrepared = true;
        judgeLoadData();
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            judgeLoadData();
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        isViewPrepared = false;
        hasFetcherData = false;
    }
}
