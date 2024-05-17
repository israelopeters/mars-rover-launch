package missionLogic;

import inputLayer.CompassDirection;
import inputLayer.Position;
import inputLayer.RotateInstruction;
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
        Rover testRover = new Rover("Alpha", new Position(1,1,CompassDirection.N));
        CompassDirection expectedEast = new Position(1,1,CompassDirection.E).getFacing();
        CompassDirection expectedWest = new Position(1,1,CompassDirection.W).getFacing();
        CompassDirection expectedSouth = new Position(1,1,CompassDirection.S).getFacing();
        CompassDirection expectedNorth = new Position(1,1,CompassDirection.N).getFacing();

        //Act
        CompassDirection actualEast = testRover.rotate(RotateInstruction.R).getFacing();
        CompassDirection actualSouth = testRover.rotate(RotateInstruction.R).getFacing();
        CompassDirection actualWest = testRover.rotate(RotateInstruction.R).getFacing();
        CompassDirection actualNorth = testRover.rotate(RotateInstruction.R).getFacing();

        //Assert
        assertEquals(expectedEast, actualEast);
        assertEquals(expectedWest, actualWest);
        assertEquals(expectedSouth, actualSouth);
        assertEquals(expectedNorth, actualNorth);

    }

}
