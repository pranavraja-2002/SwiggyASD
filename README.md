# Magical Arena

## Description
This is a simple Java implementation of a magical arena game where two players battle until one player's health reaches zero.

## How to Run
1. Clone the repository.
2. Compile the code:
    ```
    javac Player.java Arena.java
    ```
3. Run the game:
    ```
    java Arena
    ```

## Unit Tests
To run the unit tests, use the following commands:

1. Compile the tests:
    ```
    javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar PlayerTest.java ArenaTest.java
    ```
2. Run the tests:
    ```
    java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore PlayerTest ArenaTest
    ```

## Commit History
This project includes a local git history with frequent and relevant commit messages.
