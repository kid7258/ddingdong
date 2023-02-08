package com.toy.ddingdong.post.application.port.out;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WritePostPort {
    void writePost(String name, String content);
}
