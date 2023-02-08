package com.toy.ddingdong.post.application;

import com.toy.ddingdong.post.application.port.in.WritePostRequest;
import com.toy.ddingdong.post.application.port.in.WritePostUseCase;
import com.toy.ddingdong.post.application.port.out.WritePostPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class WritePostService implements WritePostUseCase {

    private final WritePostPort writePostPort;

    @Override
    public void writePost(WritePostRequest request) {
        writePostPort.writePost(request.getName(), request.getContent());
    }
}
