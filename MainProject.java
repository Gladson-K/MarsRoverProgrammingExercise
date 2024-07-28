package com.exercise.marsrover;


import java.util.Scanner;

public class MainProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read and parse grid size
        System.out.println("Grid Size: ");
        String gridsize = sc.nextLine();
        gridsize = gridsize.replace("(", "").replace(")", "");
        String[] gridpart = gridsize.split("x");
        int rows = Integer.parseInt(gridpart[0].trim());
        int columns = Integer.parseInt(gridpart[1].trim());
        Grid grid = new Grid(rows, columns);

        // Read and parse starting position
        System.out.println("\nStarting Position: ");
        String startposition = sc.nextLine().trim();
        startposition = startposition.replace("(", "").replace(")", "");
        String[] position = startposition.split(",");
        int xaxis = Integer.parseInt(position[0].trim());
        int yaxis = Integer.parseInt(position[1].trim());
        char direction = position[2].trim().charAt(0);

        Rover rover = switch (direction) {
            case 'N' -> new Rover(xaxis, yaxis, new North());
            case 'E' -> new Rover(xaxis, yaxis, new East());
            case 'W' -> new Rover(xaxis, yaxis, new West());
            case 'S' -> new Rover(xaxis, yaxis, new South());
            default -> {
                System.out.println("Invalid direction provided!");
                System.exit(1);
                yield null; // This line will never be executed but is needed to satisfy the switch expression
            }
        };

        // Read and parse commands
        System.out.println("\nCommands: ");
        String exes = sc.nextLine();
        exes = exes.replace("[", "").replace("]", "").replace("'", "").replace(" ", "");
        String[] execution = exes.split(",");
        Command[] execute_command = CommandFactory.createCommands(execution);

        // Read and parse obstacles
        System.out.println("\nObstacles: ");
        String obstacles = sc.nextLine();
        obstacles = obstacles.replace("(", "").replace(")", "").replace("[", "").replace("]", "");
        String[] coordinates = obstacles.split(",");
        for (int i = 0; i < coordinates.length; i += 2) {
            int coord_x = Integer.parseInt(coordinates[i].trim());
            int coord_y = Integer.parseInt(coordinates[i + 1].trim());
            grid.addObstacle(coord_x, coord_y);
        }

        // Execute commands
        MarsRover marsRover = new MarsRover(grid, rover);
        marsRover.executeCommands(execute_command);

        // Output status report
        System.out.println(marsRover.statusReport());
    }
}
