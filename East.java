package com.exercise.marsrover;

class East implements Direction {
    public int[] move(int x, int y) {
        return new int[] {x + 1, y};
    }

    public Direction turnLeft() {
        return new North();
    }

    public Direction turnRight() {
        return new South();
    }

    public char getDirection() {
        return 'E';
    }
}