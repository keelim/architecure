package com.keelim.architecture.di;

import com.keelim.architecture.ui.MainActivity;
import com.keelim.architecture.ui.MainModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityModule {

    /**
     * MainActivity를 위한 서브컴포넌트 정의한다.
     */
    @ActivityScope
    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity mainActivity();

}
