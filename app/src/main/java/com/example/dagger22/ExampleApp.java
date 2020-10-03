package com.example.dagger22;

import android.app.Application;

import com.example.dagger22.car.DriverModule;
import com.example.dagger22.dagger.AppComponent;
import com.example.dagger22.dagger.DaggerAppComponent;

public class ExampleApp extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.factory().create(new DriverModule("Rufat"));

    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
