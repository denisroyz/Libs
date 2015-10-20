package com.denisroyz.layoutinjector;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by denisroyz on 10/7/2015.
 * Annotate your {@link LayoutInjectorActivity } or {@link LayoutInjectorFragment }
 * * Example for {@link android.app.Activity}:
 * * @LayoutId(R.layout.layout_name)
 * * public class MyActivity extends LayoutInjectorActivity
 *
 * * Example for {@link android.app.Fragment}:
 * * @LayoutId(R.layout.layout_name)
 * * public class MyActivity extends LayoutInjectorActivity
 *
 * // TODO add {@link LayoutInjector use case}
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface LayoutId {
    int value();
}
