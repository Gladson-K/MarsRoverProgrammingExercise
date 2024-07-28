package com.exercise.marsrover;

class MoveCommand implements Command {
    public void execute(Rover rover) {
        rover.move();
    }
}