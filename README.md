# Pacman Game in Java

A simple Pacman game implementation using Java Swing.

## Features

- **Classic Gameplay**: Navigate Pacman through the maze to eat all the food pellets.
- **Ghosts**: Avoid the four ghosts (Blue, Orange, Pink, Red) that roam the map.
- **Scoring**: Earn points for every food pellet eaten.
- **Lives**: You start with 3 lives. Colliding with a ghost costs a life.
- **Game Over & Restart**: The game ends when you run out of lives. Press any key to restart.

## How to Run

1.  Ensure you have Java installed.
2.  Compile the Java files:
    ```bash
    javac App.java PacMan.java
    ```
3.  Run the game:
    ```bash
    java App
    ```

## Controls

- **Arrow Keys**: Move Pacman (Up, Down, Left, Right).

## Project Structure

- `App.java`: The main entry point, sets up the JFrame.
- `PacMan.java`: Contains the game logic, rendering, and event handling.
- `*.png`: Image assets for Pacman, ghosts, walls, and food.

## Credits

Based on a tutorial for creating Pacman in Java.
