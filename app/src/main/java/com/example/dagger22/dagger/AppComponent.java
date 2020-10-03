package com.example.dagger22.dagger;

import com.example.dagger22.car.DriverModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

    ActivityComponent.Factory getActivityComponentFactory();

    @Component.Factory
    interface Factory {
        AppComponent create(DriverModule driverModule);
    }

}
