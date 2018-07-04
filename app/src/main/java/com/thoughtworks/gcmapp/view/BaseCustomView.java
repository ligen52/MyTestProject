package com.thoughtworks.gcmapp.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.thoughtworks.gcmapp.util.Util;


public class BaseCustomView extends View {

    private static final String TAG = "BaseCustomView";

    public BaseCustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, this.getClass().getSimpleName() + " onTouchEvent " + Util.action2String(event.getAction()));
        boolean b = super.onTouchEvent(event);
        Log.d(TAG, this.getClass().getSimpleName() + " onTouchEvent result " + b);
        return b;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e(TAG, this.getClass().getSimpleName() + " dispatchTouchEvent " + Util.action2String(event.getAction()));
        super.dispatchTouchEvent(event);
        boolean b = true;
        Log.e(TAG, this.getClass().getSimpleName() + " dispatchTouchEvent result " + b);
        return b;
    }
}
