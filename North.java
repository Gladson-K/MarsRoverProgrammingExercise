package com.exercise.marsrover;

class North implements Direction {
    public int[] move(int x, int y) {
        return new int[] {x, y + 1};
    }

    public Direction turnLeft() {
        return new West();
    }

    public Direction turnRight() {
        return new East();
    }

    public char getDirection() {
        return 'N';
    }
}
