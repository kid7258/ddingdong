package com.toy.ddingdong.post.adapter.in.web;

import com.toy.ddingdong.post.application.port.in.GetPostUseCase;
import com.toy.ddingdong.post.domain.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GetPostController {
    private final GetPostUseCase getPostUseCase;

    @GetMapping("/posts/{id}")
    public Post getPost(@PathVariable Long id) {
        return getPostUseCase.getPost(id);
    }

    @GetMapping("/posts")
    public List<Post> getPosts(@RequestParam String name) {
        return getPostUseCase.getPosts(name);
    }
}
