package com.example.dagger22.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Enginee {

    private static final String TAG = "DieselEngine";

    private int horsePower;

    @Inject
    public DieselEngine(int horsePower){
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Diesel engine started. Horsepower: " + horsePower);
    }

}
