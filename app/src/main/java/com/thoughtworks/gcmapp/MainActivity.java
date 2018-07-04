package com.thoughtworks.gcmapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;

import com.google.firebase.iid.FirebaseInstanceId;
import com.thoughtworks.gcmapp.util.Util;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_viewgroup);
        Log.i(TAG, "activity id " + FirebaseInstanceId.getInstance().getToken());
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, this.getClass().getSimpleName() + " onTouchEvent " + Util.action2String(event.getAction()));
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e(TAG, this.getClass().getSimpleName() + " dispatchTouchEvent " + Util.action2String(event.getAction()));
        boolean b = super.dispatchTouchEvent(event);
        Log.e(TAG, this.getClass().getSimpleName() + " dispatchTouchEvent result " + b);
        return b;
    }
}
