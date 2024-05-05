package com.lld.course.design.problems.snakeladder;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Jumper> jumpers = Arrays.asList(new Jumper(1, 3), new Jumper(5, 10), new Jumper(20, 15), new Jumper(9, 7));
        List<User> users = Arrays.asList(new User("Govind"), new User("Aditya"), new User("Anoosha"));
        Game game = new Game(users, jumpers, 100, new NormalDice());
        User winner = game.start();
        System.out.printf("%s is the winner of this game", winner.getName());
    }
}
