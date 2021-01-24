package com.keelim.architecure.di;

import androidx.lifecycle.ViewModelProvider;

import dagger.Binds;

public abstract class ViewModelModule {

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(AppViewModelFactory factory);
}
