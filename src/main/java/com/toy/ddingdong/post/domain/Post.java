package com.toy.ddingdong.post.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Post {
    private final Long id;
    private final String name;
    private final String content;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;

    public static Post createPost(Long id, String name, String content, LocalDateTime createdAt, LocalDateTime updatedAt) {
        return new Post(id, name, content, createdAt, updatedAt);
    }
}
