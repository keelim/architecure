package com.keelim.arch.ui;

import android.content.Context;

import com.keelim.arch.R;
import com.keelim.arch.databinding.ActivityMainBinding;
import com.keelim.arch.di.ActivityContext;
import com.keelim.arch.di.ActivityScope;
import com.keelim.arch.di.FragmentScope;
import com.keelim.arch.ui.detail.PostDetailFragment;
import com.keelim.arch.ui.detail.PostDetailModule;
import com.keelim.arch.ui.post.PostFragment;
import com.keelim.arch.ui.post.PostModule;
import com.keelim.arch.ui.user.UserFragment;
import com.keelim.arch.ui.user.UserModule;

import androidx.databinding.DataBindingUtil;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainModule {

    @Provides
    @ActivityScope
    static ActivityMainBinding provideBinding(MainActivity activity) {
        return DataBindingUtil.setContentView(activity, R.layout.activity_main);
    }

    @Provides
    @ActivityContext
    static Context provideContext(MainActivity activity) {
        return activity;
    }

    /**
     * 서브컴포넌트 정의
     */
    @FragmentScope
    @ContributesAndroidInjector(modules = PostModule.class)
    abstract PostFragment getPostFragment();

    @FragmentScope
    @ContributesAndroidInjector(modules = PostDetailModule.class)
    abstract PostDetailFragment getPostDetailFragment();

    @FragmentScope
    @ContributesAndroidInjector(modules = UserModule.class)
    abstract UserFragment getUserFragment();
}

