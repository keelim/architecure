package com.keelim.arch.ui.user;

import android.content.Context;
import android.view.LayoutInflater;

import com.keelim.arch.databinding.FragmentUserBinding;
import com.keelim.arch.di.ActivityContext;
import com.keelim.arch.di.FragmentScope;

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
