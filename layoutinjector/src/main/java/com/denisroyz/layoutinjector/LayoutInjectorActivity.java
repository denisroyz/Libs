package com.denisroyz.layoutinjector;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by denisroyz on 10/7/2015.
 * Extend your activity from this to make layout injections with {@link LayoutId} annotation
 */
public class LayoutInjectorActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInjector.inject(this);
    }
}
