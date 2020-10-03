package com.example.dagger22.dagger;

import com.example.dagger22.car.Enginee;
import com.example.dagger22.car.PetrolEngine;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule { // do this classs as abstract class

    // and @Provides change to @Binds and add abstract word before Enginee and delete the body of this method
    @Provides
    Enginee provideEngine(PetrolEngine petrolEngine){
        return petrolEngine;
    }

}
