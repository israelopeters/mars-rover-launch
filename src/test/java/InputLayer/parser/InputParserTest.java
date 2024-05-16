package InputLayer.parser;

import InputLayer.Instruction;
import InputLayer.PlateauSize;
import InputLayer.Position;
import org.junit.jupiter.api.Test;

import java.sql.Array;

import static org.junit.jupiter.api.Assertions.*;

class InputParserTest {

    @Test
    void getPlateauSize(){
        //Arrange
        InputParser testParser = new InputParser(new PlateauSize(2,6));

        //Act
        int testParserPlateauSizeX = testParser.getPlateauSize().getX();
        int testParserPlateauSizeY = testParser.getPlateauSize().getY();
        int[] actualArray = {testParserPlateauSizeX, testParserPlateauSizeY};
        int[] expectedArray = {2,6};


        //Assert
        //assertArrayEquals(null, actualArray);
        assertArrayEquals(expectedArray, actualArray);
    }


    @Test
    void getInstruction() {


    }

    @Test
    void getPosition() {
    }

    @Test
    void getCompassDirection() {
    }
}