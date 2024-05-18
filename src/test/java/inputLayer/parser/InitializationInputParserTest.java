package inputLayer.parser;

import inputLayer.CompassDirection;
import inputLayer.Plateau;
import inputLayer.PlateauSize;
import org.junit.jupiter.api.Test;

import java.lang.module.Configuration;

import static org.junit.jupiter.api.Assertions.*;

class InitializationInputParserTest {

    @Test
    void parseLineOne() {
        //Arrange
        InitializationInputParser initializationInputParser = new InitializationInputParser(new String[] {"5 6"});
        int expectedX = 5;
        int expectedY = 6;

        //Act
        int actualX = initializationInputParser.parseLineOne().getPlateauSize().getX();
        int actualY = initializationInputParser.parseLineOne().getPlateauSize().getY();

        //Assert
        assertEquals(expectedX, actualX);
        assertEquals(expectedY, actualY);
    }

    @Test
    void parseLineTwo() {
        //Arrange
        InitializationInputParser initializationInputParser = new InitializationInputParser(new String[] {"5 6", "1 2 N"});
        int expectedX = 1;
        int expectedY = 2;
        CompassDirection expectedFacing = CompassDirection.N;

        //Act
        int actualX = initializationInputParser.parseLineTwo().getX();
        int actualY = initializationInputParser.parseLineTwo().getY();
        CompassDirection actualFacing = initializationInputParser.parseLineTwo().getFacing();

        //Assert
        assertEquals(expectedX, actualX);
        assertEquals(expectedY, actualY);
        assertEquals(expectedFacing, actualFacing);
    }

}