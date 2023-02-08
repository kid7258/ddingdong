package com.toy.ddingdong.post.adapter.in.web;

import com.toy.ddingdong.post.application.port.in.WritePostRequest;
import com.toy.ddingdong.post.application.port.in.WritePostUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WritePostController {
    private final WritePostUseCase writePostUseCase;

    @PostMapping("/posts")
    public void writePost(@RequestBody WritePostRequest request) {
        writePostUseCase.writePost(request);
    }
}
