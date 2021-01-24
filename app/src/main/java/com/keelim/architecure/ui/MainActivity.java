package com.keelim.architecure.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;

import androidx.lifecycle.LifecycleOwner;

import com.keelim.architecure.databinding.ActivityMainBinding;

import javax.inject.Inject;

import dagger.Lazy;
import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity implements LifecycleOwner {

    @Inject
    Lazy<ActivityMainBinding> binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding.get().setLifecycleOwner(this);
    }
}
