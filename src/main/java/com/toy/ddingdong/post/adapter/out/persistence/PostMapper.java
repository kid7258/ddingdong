package com.toy.ddingdong.post.adapter.out.persistence;

import com.toy.ddingdong.post.domain.Post;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PostMapper {
    Post mapToDomainEntity(PostEntity postEntity) {
        return Post.createPost(postEntity.getId(), postEntity.getName(), postEntity.getContent(),
                postEntity.getCreatedAt(), postEntity.getUpdatedAt());
    }

    List<Post> mapToDomainEntities(List<PostEntity> postEntities) {
        List<Post> mappedPosts = new ArrayList<>();
        for (PostEntity postEntity : postEntities) {
            mappedPosts.add(
                    Post.createPost(postEntity.getId(), postEntity.getName(), postEntity.getContent(),
                            postEntity.getCreatedAt(), postEntity.getUpdatedAt())
            );
        }

        return mappedPosts;
    }
}
