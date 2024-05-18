package inputLayer.parser;

import inputLayer.Plateau;
import inputLayer.PlateauSize;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InitializationInputParserTest {

    @Test
    void parseLineOne() {
        //Arrange
        InitializationInputParser initializationInputParser = new InitializationInputParser(new String[]{"5 6"});
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
    }

    @Test
    void parseLineThree() {
    }
}