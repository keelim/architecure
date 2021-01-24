package com.keelim.architecure.utils;

import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import java.util.concurrent.atomic.AtomicBoolean;


import timber.log.Timber;

public class SingleLiveEvent<T> extends MutableLiveData<T> {
    private final AtomicBoolean mPending  = new AtomicBoolean(false);


    @MainThread
    public void observe(LifecycleOwner owner, final Observer<? super T> observer){
        if(hasActiveObservers()){
            Timber.w("여러 Observer 가 존재하지만, 단 하나만 알림을 받을 수 있다");
        }

        super.observe(owner, t->{
            if(mPending.compareAndSet(true, false)){
                observer.onChanged(t);
            }
        });
    }
}
