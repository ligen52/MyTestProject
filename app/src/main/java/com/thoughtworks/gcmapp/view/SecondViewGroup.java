package com.thoughtworks.gcmapp.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class SecondViewGroup extends BaseCustomViewGroup {

    public SecondViewGroup(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
//        this.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG, this.getClass().getSimpleName() + " onClick");
//            }
//        });
    }

//    @Override
//    public boolean onInterceptTouchEvent(MotionEvent ev) {
//        boolean interceptTouchEvent = super.onInterceptTouchEvent(ev);
//        return true;
//    }

//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        super.onTouchEvent(event);
//        return false;
//    }

//    @Override
//    public boolean dispatchTouchEvent(MotionEvent ev) {
//        return super.dispatchTouchEvent(ev);
//    }
}
