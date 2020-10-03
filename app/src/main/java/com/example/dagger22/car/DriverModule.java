package com.example.dagger22.car;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {

    private String name;

    public DriverModule(String name) {
        this.name = name;
    }

    @Provides
    @Singleton
    Driver provideDriver(){
        return new Driver(name);
    }
}
