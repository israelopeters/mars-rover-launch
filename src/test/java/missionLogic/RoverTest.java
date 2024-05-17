package missionLogic;

import inputLayer.CompassDirection;
import inputLayer.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoverTest {

    @Test
    void move_facing_North() {
        //Arrange
        Rover testRover = new Rover("Alpha", new Position(0,0,CompassDirection.N));
        Position expected = new Position(0,1, CompassDirection.E);

        //Act
        Position actual = testRover.move();

        //Assert
        assertEquals(expected.getX(), actual.getX());
        assertEquals(expected.getY(), actual.getY());

    }

    @Test
    void move_facing_East() {
        //Arrange
        Rover testRover = new Rover("Alpha", new Position(0,0,CompassDirection.E));
        Position expected = new Position(1,0, CompassDirection.E);

        //Act
        Position actual = testRover.move();

        //Assert
        assertEquals(expected.getX(), actual.getX());
        assertEquals(expected.getY(), actual.getY());

    }

    @Test
    void move_facing_West() {
        //Arrange
        Rover testRover = new Rover("Alpha", new Position(1,1,CompassDirection.W));
        Position expected = new Position(0,1, CompassDirection.W);

        //Act
        Position actual = testRover.move();

        //Assert
        assertEquals(expected.getX(), actual.getX());
        assertEquals(expected.getY(), actual.getY());

    }

    @Test
    void move_facing_South() {
        //Arrange
        Rover testRover = new Rover("Alpha", new Position(1,1,CompassDirection.S));
        Position expected = new Position(1,0, CompassDirection.S);

        //Act
        Position actual = testRover.move();

        //Assert
        assertEquals(expected.getX(), actual.getX());
        assertEquals(expected.getY(), actual.getY());

    }

    @Test
    void rotate() {
        //Arrange
        Rover testRover = new Rover("Alpha", new Position(1,1,CompassDirection.S));

        //Act


        //Assert

    }

}
