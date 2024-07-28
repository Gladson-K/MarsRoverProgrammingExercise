package com.exercise.marsrover;

class South implements Direction {
    public int[] move(int x, int y) {
        return new int[] {x, y - 1};
    }

    public Direction turnLeft() {
        return new East();
    }

    public Direction turnRight() {
        return new West();
    }

    public char getDirection() {
        return 'S';
    }
}