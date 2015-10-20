package com.denisroyz.layoutinjector;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by denisroyz on 10/7/2015.
 * Extend your activity from this to make layout injections with {@link LayoutId} annotation
 */
public class LayoutInjectorFragment extends Fragment {

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreateView(inflater,container,savedInstanceState);
        View view = null;
        int layoutID = LayoutInjector.extractLayoutId(this);
        if (layoutID>0){
            view = inflater.inflate(layoutID, container, false);
        }
        return view;
    }
}
