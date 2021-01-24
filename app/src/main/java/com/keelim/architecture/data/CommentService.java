package com.keelim.architecture.data;

import java.util.List;

import com.keelim.architecture.data.entity.Comment;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CommentService {
    @GET("/comments")
    Single<List<Comment>> getComments(@Query("postId") long id);
}
