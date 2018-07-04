package com.thoughtworks.gcmapp.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import com.thoughtworks.gcmapp.util.Util;


public class BaseCustomViewGroup extends LinearLayout {

    protected static final String TAG = "BaseCustomViewGroup";

    public BaseCustomViewGroup(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, this.getClass().getSimpleName() + " onTouchEvent " + Util.action2String(event.getAction()));
//        boolean b = super.onTouchEvent(event);
        boolean b = true;
        Log.d(TAG, this.getClass().getSimpleName() + " onTouchEvent result " + b);
        return b;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i(TAG, this.getClass().getSimpleName() + " onInterceptTouchEvent " + Util.action2String(ev.getAction()));
        boolean b = super.onInterceptTouchEvent(ev);
//        boolean b = true;
        return b;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e(TAG, this.getClass().getSimpleName() + " dispatchTouchEvent " + Util.action2String(ev.getAction()));
        super.dispatchTouchEvent(ev);
        boolean b = true;
        Log.e(TAG, this.getClass().getSimpleName() + " dispatchTouchEvent result " + b);
        return b;
    }
}
