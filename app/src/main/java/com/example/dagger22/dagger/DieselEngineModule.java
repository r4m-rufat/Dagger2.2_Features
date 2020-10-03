package com.example.dagger22.dagger;
import com.example.dagger22.car.DieselEngine;
import com.example.dagger22.car.Enginee;

import dagger.Module;
import dagger.Provides;

@Module
public  class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower(){
        return horsePower;
    }

    @Provides
    Enginee provideEngine(DieselEngine dieselEngine) {
        return dieselEngine;
    }

}
