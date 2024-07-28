package com.exercise.marsrover;



import java.util.HashSet;
import java.util.Set;

public class Grid {
    private int rows;
    private int columns;
    private Set<String> obstacles;

    public Grid(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.obstacles = new HashSet<>();
    }

    public void addObstacle(int x, int y) {
        obstacles.add(x + "," + y);
    }

    public boolean isObstacle(int x, int y) {
        return obstacles.contains(x + "," + y);
    }
}
