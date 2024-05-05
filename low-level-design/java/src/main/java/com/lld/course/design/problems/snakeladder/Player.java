package com.lld.course.design.problems.snakeladder;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Player {
    private User user;
    @Setter
    private int position;

    public Player(User user) {
        this.user = user;
        this.position = 0;
    }

}
