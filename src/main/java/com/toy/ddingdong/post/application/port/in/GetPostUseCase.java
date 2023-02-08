package com.toy.ddingdong.post.application.port.in;

import com.toy.ddingdong.post.domain.Post;

import java.util.List;

public interface GetPostUseCase {
    Post getPost(Long id);
    List<Post> getPosts(String name);
}
