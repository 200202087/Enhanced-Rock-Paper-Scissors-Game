# Enhanced Rock-Paper-Scissors Game

## Table of Contents

1. [Project Overview](#project-overview)
2. [Features](#features)
3. [Class Structure](#class-structure)
4. [How to Run the Game](#how-to-run-the-game)
6. [Acknowledgements](#acknowledgements)
8. [Codes](#codes)

## Project Overview

This project is an advanced version of the classic Rock-Paper-Scissors game, implemented using Java and Object-Oriented Programming (OOP) principles. The game introduces new elements and rules to add complexity and excitement to the traditional game.

## Features

1. **Multiple Game Elements**:
    - Besides the standard rock, paper, and scissors, the game includes additional elements like "Special Paper" and "Ultimate Scissors".
   
2. **Dynamic Scoring System**:
    - Points are awarded based on the outcome of each round with special conditions for wins, losses, and ties.
   
3. **Durability Mechanism**:
    - Each game element has a durability attribute that influences the outcome of interactions between different elements.
   
4. **Multiple Players**:
    - The game supports multiple players, including AI opponents, making it more challenging and fun.
   
5. **Status Update and Effect Calculation**:
    - Each interaction updates the status and durability of the game elements, and specific methods calculate the effects of these interactions.

## Class Structure

The game is structured using multiple classes to represent different components and functionalities.

### Main Class: `oyun.java`

- **Main Game Loop**: The primary control flow of the game, handling player choices and game outcomes.
- **Game Modes**: Supports different game modes, including player vs. player, player vs. AI, and AI vs. AI.
- **Scoring and Result Announcement**: Manages the scoring system and announces the results based on the scores.

### Supporting Classes and Methods

- **Game Elements**:
    - `rock`, `paper`, `scissors`, `specialPaper`, `ultimateScissors`: Represent the different elements in the game with attributes like durability and methods to calculate effects.
   
- **Effect Calculation Methods**:
    - `etkihes()`: Calculates the effect of an interaction between two game elements.
    - `durumgun()`: Updates the status of a game element based on the outcome of an interaction.
   
- **Player Classes**:
    - `Player`: Represents a player in the game, with attributes for score and methods to make choices.
    - `AIPlayer`: Extends `Player` to include AI-specific behaviors and decision-making processes.

## How to Run the Game

1. **Prerequisites**:
    - Java Development Kit (JDK) installed on your system.
    - An IDE or text editor to view and edit the code.

2. **Compilation**:
    - Compile the Java files using the following command:
      ```sh
      javac oyun.java
      ```

3. **Execution**:
    - Run the compiled Java program:
      ```sh
      java oyun
      ```

4. **Gameplay**:
    - Follow the on-screen instructions to play the game. Choose the game mode, make your moves, and see the results based on the advanced rules and scoring system.


## Acknowledgments

This project was developed as part of a university course on Object-Oriented Programming. Special thanks to the course instructors and classmates for their support and feedback.

## Codes

You can review the project codes [here](/src/prolab2).
