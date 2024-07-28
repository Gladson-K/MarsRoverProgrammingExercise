package com.exercise.marsrover;


public class MarsRover {
    private Grid grid;
    private Rover rover;
    private boolean obstacleDetected = false;

    public MarsRover(Grid grid, Rover rover) {
        this.grid = grid;
        this.rover = rover;
    }

    public void executeCommands(Command[] commands) {
        for (Command command : commands) {
            if (command instanceof MoveCommand) {
                int[] nextPos = rover.getCurrentDirection().move(rover.getX(), rover.getY());
                if (grid.isObstacle(nextPos[0], nextPos[1])) {
                    obstacleDetected = true;
                    break;
                }
            }
            command.execute(rover);
        }
    }

    public String statusReport() {
        return rover.statusReport(obstacleDetected);
    }
}
