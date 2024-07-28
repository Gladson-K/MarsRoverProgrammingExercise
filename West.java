package com.exercise.marsrover;

class West implements Direction {
    public int[] move(int x, int y) {
        return new int[] {x - 1, y};
    }

    public Direction turnLeft() {
        return new South();
    }

    public Direction turnRight() {
        return new North();
    }

    public char getDirection() {
        return 'W';
    }
}
