package com.exercise.marsrover;


public class Rover {
    private int x;
    private int y;
    private Direction direction;

    public Rover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void move() {
        int[] nextPos = direction.move(x, y);
        x = nextPos[0];
        y = nextPos[1];
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public char getDirection() {
        return direction.getDirection();
    }

    public Direction getCurrentDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String statusReport(boolean obstacleDetected) {
        String directionString = switch (getDirection()) {
            case 'N' -> "North";
            case 'E' -> "East";
            case 'W' -> "West";
            case 'S' -> "South";
            default -> "Unknown";
        };
        String obstacleStatus = obstacleDetected ? "Obstacle detected." : "No Obstacle detected.";
        return "Rover is at (" + x + ", " + y + ") facing " + directionString + ". " + obstacleStatus;
    }
}
