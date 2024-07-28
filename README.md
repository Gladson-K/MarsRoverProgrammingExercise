# Mars Rover Programming Exercise
 
This project is a simulation of a Mars Rover navigating a grid-based terrain. The rover has the ability to move forward, turn left, and turn right while avoiding obstacles and staying within the grid boundaries. The implementation follows object-oriented programming principles, design patterns, and eliminates the use of if-else conditional constructs.

# Grid Initialization: 
Establish the grid size.

# Rover Initialization: 
Define the rover's initial position and direction (N, S, E, W).

# Command Execution: 
Execute a sequence of commands (Move, Turn Left, Turn Right).

# Obstacle Detection: 
The rover halts if it encounters an obstacle.

# Status Report: 
Provides the final position, direction, and obstacle status of the rover.

# Key Concepts:

  # Command Pattern:
      Encapsulates Move, Turn Left, and Turn Right commands for flexibility.
  
  # Composite Pattern:
      Represents the grid and obstacles.
  
  # Encapsulation, Inheritance, Polymorphism:
      Utilizes OOP principles for clean and maintainable code.

# Class Descriptions:

# Rover: 
Represents the rover with its position and direction. Methods include move(), turnLeft(), turnRight(), getDirection(), and statusReport().

# Direction: 
An interface for direction classes (North, South, East, West) with methods like move(), turnLeft(), turnRight(), and getDirection().

# Command: 
An interface for commands with the execute() method. Includes implementations like MoveCommand, TurnLeftCommand, and TurnRightCommand.

# CommandFactory: 
Factory class to generate an array of Command objects from input strings.

# Grid: 
Represents the grid.
  # isObstacle(int x, int y):
    Checks if a given position has an obstacle.
  
  # addObstacle(int x, int y):
    Adds an obstacle at a given position.
  
# MarsRover
Handles the execution of commands on the rover and provides the final status report.

# MainProject
Main class to run the simulation. It reads inputs for grid size, starting position, commands, and obstacles, and then executes the commands.
