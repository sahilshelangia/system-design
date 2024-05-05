package com.lld.course.design.problems.snakeladder;

import java.util.Random;

public class NormalDice implements IDice {

    @Override
    public int roll() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
