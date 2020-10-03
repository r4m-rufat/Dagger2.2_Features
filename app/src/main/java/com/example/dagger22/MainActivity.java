package com.example.dagger22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import com.example.dagger22.car.Car;
import com.example.dagger22.dagger.ActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent activityComponent = ((com.example.dagger22.ExampleApp) getApplication()).getAppComponent()
                .getActivityComponentFactory()
                .create(200, 40);

        activityComponent.inject(this);

        car1.drive();
        car2.drive();

    }
}