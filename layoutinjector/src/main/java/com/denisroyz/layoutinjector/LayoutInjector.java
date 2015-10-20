package com.denisroyz.layoutinjector;

import android.app.Activity;

/**
 * Created by denisroyz on 10/7/2015.
 * //TODO should be not static
 */
public class LayoutInjector {

    private static boolean mSilentMode = true;

    public static void setSilentMode(boolean silentMode){
        mSilentMode = silentMode;
    }

    public static boolean isSilentMode(){
        return mSilentMode;
    }

    public static void inject(Activity activity){
        int layoutId = extractLayoutId(activity);
        if (layoutId>0){
            activity.setContentView(layoutId);
        } else {
            if (!isSilentMode()) throw new LayoutInjectorException();
        }
    }

    /**
     *
     * @param object - object annotated with {@link LayoutId}
     * @return {@link LayoutId#value()}, or -1, if input object is invalid
     */
    public static int extractLayoutId(Object object){
        Class<?> classObject = object.getClass();
        int layoutID;
        if (classObject.isAnnotationPresent(LayoutId.class)) {
            LayoutId singleAnnotation =
                    classObject.getAnnotation(LayoutId.class);
            layoutID = singleAnnotation.value();
        } else {
            layoutID = -1;
        }
        return layoutID;
    }
}
