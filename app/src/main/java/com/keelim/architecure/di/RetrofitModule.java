package com.keelim.architecure.di;

import com.keelim.architecure.data.CommentService;
import com.keelim.architecure.data.PostService;
import com.keelim.architecure.data.UserService;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import retrofit2.Retrofit;

@Module
public class RetrofitModule {
    @Provides
    @Reusable
    PostService providePostService(Retrofit retorfit){
        return retorfit.create(PostService.class);
    }

    @Provides
    @Reusable
    UserService provideUserService(Retrofit retrofit){
        return retrofit.create(UserService.class);
    }

    @Provides
    @Reusable
    CommentService provideCommentService(Retrofit retrofit){
        return retrofit.create(CommentService.class);
    }
}
