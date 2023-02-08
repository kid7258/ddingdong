package com.toy.ddingdong.post.application;

import com.toy.ddingdong.post.application.port.in.GetPostUseCase;
import com.toy.ddingdong.post.application.port.out.GetPostPort;
import com.toy.ddingdong.post.domain.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class GetPostService implements GetPostUseCase {

    private final GetPostPort getPostPort;

    @Override
    public Post getPost(Long id) {
        return getPostPort.getPost(id);
    }

    @Override
    public List<Post> getPosts(String name) {
        return getPostPort.getPosts(name);
    }
}
