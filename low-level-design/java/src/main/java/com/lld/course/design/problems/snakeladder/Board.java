package com.lld.course.design.problems.snakeladder;

import lombok.Getter;

import java.util.HashMap;
import java.util.List;

public class Board {
    @Getter
    private final int size;
    private final HashMap<Integer, Integer> jumpers;

    public Board(int size, List<Jumper> jumpers) {
        if (areValidJumpers(jumpers)) {
            HashMap<Integer, Integer> jumperHash = new HashMap<>();
            for (Jumper jumper : jumpers) {
                jumperHash.put(jumper.getStart(), jumper.getEnd());
            }
            this.jumpers = jumperHash;
            this.size = size;
        } else {
            // throw exception here.
            System.out.println("Invalid jumpers");
            this.jumpers = null;
            this.size = 0;
        }
    }

    public int move(int currentPosition, int diceResult) {
        // 1. Move a move.
        // 2. check for any jumper there, if it's there... make a jump accordingly.
        // 3. if it goes beyond board, don't make move.
        int newPosition = currentPosition + diceResult;
        if (jumpers.containsKey(newPosition)) {
            newPosition = jumpers.get(newPosition);
        }
        if (newPosition > size) {
            System.out.println("user can't make a move. because it's beyond the board.");
            return currentPosition;
        }
        return newPosition;
    }

    private boolean areValidJumpers(List<Jumper> jumpers) {
        // todo: add some validation for-
        // 1. Two jumpers can't have same starting point.
        // 2. Jumper's end point can't go beyond board size.
        // 3. Jumper's start point can't go beyond board size.
        // 4. Jumper's start!=end
        // 5. Jumper's end point can't be the start  **open for discussion.
        return true;
    }
}
