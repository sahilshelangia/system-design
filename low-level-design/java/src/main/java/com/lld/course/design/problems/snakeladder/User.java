package com.lld.course.design.problems.snakeladder;

import lombok.Getter;

import java.util.UUID;


@Getter
public class User {
    private UUID uuid;
    private String name;

    public User(String name) {
        this.uuid = UUID.randomUUID();
        this.name = name;
    }
}
