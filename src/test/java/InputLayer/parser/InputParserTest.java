package InputLayer.parser;

import InputLayer.Instruction;
import InputLayer.PlateauSize;
import InputLayer.Position;
import org.junit.jupiter.api.Test;

import java.sql.Array;

import static org.junit.jupiter.api.Assertions.*;

class InputParserTest {

    @Test
    void PlateauSize(){
        //Arrange
        InputParser testParser1 = new InputParser();
        InputParser testParser2 = new InputParser();

        //Act and Assert
        assertEquals(null, testParser1.getPlateauSize());
        assertEquals(5, testParser2.plateauSizeParser("56").getX());
        assertEquals(6, testParser2.plateauSizeParser("56").getY());
    }


    @Test
    void getInstruction() {
        //Arrange
        InputParser testParser = new InputParser();

        //Act



    }

    @Test
    void getPosition() {
    }

    @Test
    void getCompassDirection() {
    }
}