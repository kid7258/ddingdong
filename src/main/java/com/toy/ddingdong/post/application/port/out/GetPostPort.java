package com.toy.ddingdong.post.application.port.out;

import com.toy.ddingdong.post.domain.Post;

import java.util.List;

public interface GetPostPort {
    Post getPost(Long id);

    List<Post> getPosts(String name);
}
