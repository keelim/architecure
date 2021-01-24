package com.keelim.architecture.data;

import java.util.List;

import com.keelim.architecture.data.entity.Post;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;

public interface PostService {
    @GET("/posts")
    Single<List<Post>> getPosts();
}
