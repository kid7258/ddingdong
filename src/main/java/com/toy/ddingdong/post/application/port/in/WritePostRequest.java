package com.toy.ddingdong.post.application.port.in;

import lombok.Getter;

@Getter
public class WritePostRequest {
    private String name;
    private String content;
}
