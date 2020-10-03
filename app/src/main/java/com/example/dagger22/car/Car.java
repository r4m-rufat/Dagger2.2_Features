package com.example.dagger22.car;

import android.util.Log;

import com.example.dagger22.dagger.PerActivity;

import javax.inject.Inject;

@PerActivity
public class Car {

    private static final String TAG = "Car";

    private Driver driver;
    private Enginee enginee;
    private Wheels wheels;

    @Inject
    public Car(Driver driver, Enginee enginee, Wheels wheels) {
        this.driver = driver;
        this.enginee = enginee;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener();
    }

    public void drive(){
        enginee.start();
        Log.d(TAG, driver + " " + driver.name +  " drives " + this);
    }
}
