package com.keelim.architecture.ui;

import android.content.Context;

import com.keelim.architecture.R;
import com.keelim.architecture.databinding.ActivityMainBinding;
import com.keelim.architecture.di.ActivityContext;
import com.keelim.architecture.di.ActivityScope;
import com.keelim.architecture.di.FragmentScope;
import com.keelim.architecture.ui.detail.PostDetailFragment;
import com.keelim.architecture.ui.detail.PostDetailModule;
import com.keelim.architecture.ui.post.PostFragment;
import com.keelim.architecture.ui.post.PostModule;
import com.keelim.architecture.ui.user.UserFragment;
import com.keelim.architecture.ui.user.UserModule;

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

