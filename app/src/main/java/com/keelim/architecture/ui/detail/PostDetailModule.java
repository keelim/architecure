package com.keelim.architecture.ui.detail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.keelim.architecture.databinding.FragmentPostDetailBinding;
import com.keelim.architecture.di.ApplicationContext;
import com.keelim.architecture.di.FragmentScope;

import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dagger.Module;
import dagger.Provides;

@Module
public class PostDetailModule {

    @Provides
    @FragmentScope
    public FragmentPostDetailBinding provideBinding(@ApplicationContext Context context) {
        return FragmentPostDetailBinding.inflate(LayoutInflater.from(context), null, false);
    }

    @Provides
    @FragmentScope
    public LinearLayoutManager provideLayoutManager(@ApplicationContext Context context) {
        return new LinearLayoutManager(context) {
            @Override
            public RecyclerView.LayoutParams generateDefaultLayoutParams() {
                return new RecyclerView.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                );
            }
        };
    }

    @Provides
    @FragmentScope
    public NavController provideNavController(PostDetailFragment fragment) {
        return NavHostFragment.findNavController(fragment);
    }

}
