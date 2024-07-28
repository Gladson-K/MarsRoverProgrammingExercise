package com.exercise.marsrover;

public interface Direction {
    int[] move(int x, int y);
    Direction turnLeft();
    Direction turnRight();
    char getDirection();
}
