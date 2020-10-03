package com.example.dagger22.car;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Remote";

    @Inject
    public Remote() {
    }

    public void setListener(){
        Log.d(TAG, "Remote: connected");
    }
}
