package com.example.dagger22.dagger;

import com.example.dagger22.MainActivity;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

//    @Subcomponent.Builder
//    interface Builder {
//
//        @BindsInstance
//        Builder horsePower(@Named("horse power") int horsePower);
//
//        @BindsInstance
//        Builder engineCapacity(@Named("engine capacity") int engineCapacity);
//
//        ActivityComponent build();
//    }

    @Subcomponent.Factory
    interface Factory {

        ActivityComponent create(@BindsInstance @Named("horse power") int horsePower,
                                 @BindsInstance @Named("engine capacity") int engineCapacity);

    }

}
