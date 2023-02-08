package com.toy.ddingdong.post.adapter.out.persistence;

import com.toy.ddingdong.post.application.port.out.GetPostPort;
import com.toy.ddingdong.post.application.port.out.WritePostPort;
import com.toy.ddingdong.post.domain.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class PostPersistenceAdapter implements WritePostPort, GetPostPort {

    private final PostMapper postMapper;
    private final PostRepository postRepository;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void writePost(String name, String content) {
        LocalDateTime postedAt = LocalDateTime.now();
        PostEntity postEntity = new PostEntity(name, content, postedAt, postedAt);
        postRepository.save(postEntity);
    }

    @Transactional(readOnly = true)
    @Override
    public Post getPost(Long id) {
        PostEntity postEntity = postRepository.findById(id)
                .orElseThrow();
        return postMapper.mapToDomainEntity(postEntity);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Post> getPosts(String name) {
        List<PostEntity> postEntities = postRepository.findAllByName(name);
        return postMapper.mapToDomainEntities(postEntities);
    }
}
