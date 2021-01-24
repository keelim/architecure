package com.keelim.architecture.ui.user;

import android.content.Context;
import android.view.LayoutInflater;

import com.keelim.architecture.databinding.FragmentUserBinding;
import com.keelim.architecture.di.ActivityContext;
import com.keelim.architecture.di.FragmentScope;

import dagger.Module;
import dagger.Provides;

@Module
public class UserModule {
    @Provides
    @FragmentScope
    FragmentUserBinding provideBinding(@ActivityContext Context context){
        return FragmentUserBinding.inflate(LayoutInflater.from(context));
    }
}
