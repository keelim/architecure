package com.keelim.architecure.di;

import android.content.Context;

import androidx.databinding.DataBindingUtil;

import com.keelim.architecure.R;
import com.keelim.architecure.databinding.ActivityMainBinding;
import com.keelim.architecure.ui.MainActivity;

import dagger.Provides;

public abstract class MainModule {
    @Provides
    @ActivityScope
    static ActivityMainBinding provideBinding(MainActivity activity){
        return DataBindingUtil.setContentView(activity, R.layout.activity_main);
    }

    @Provides@ActivityContext
    static Context provideContext(MainActivity activity){
        return activity;
    }
}
