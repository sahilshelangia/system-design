package com.lld.course.design.problems.snakeladder;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {
    private final Queue<Player> players;
    private final Board board;
    private final IDice dice;


    public Game(List<User> users, List<Jumper> jumpers, int boardSize, IDice dice) {
        Queue<Player> players = new LinkedList<>();
        for (User user : users) {
            players.add(new Player(user));
        }
        this.players = players;
        this.board = new Board(boardSize, jumpers);
        this.dice = dice;
    }

    public User start() {
        while (true) {
            Player currentPlayer = getNextPlayer();
            System.out.printf("It's %s turn\n", currentPlayer.getUser().getName());
            int newPos = board.move(currentPlayer.getPosition(), dice.roll());
            System.out.printf("Old position: %d, new position: %d\n", currentPlayer.getPosition(), newPos);
            currentPlayer.setPosition(newPos);
            if (newPos == board.getSize()) {
                // winner
                return currentPlayer.getUser();
            }
        }
    }

    private Player getNextPlayer() {
        Player player = this.players.remove();
        this.players.add(player);
        return player;
    }
}
