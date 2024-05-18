package inputLayer.parser;

import inputLayer.CompassDirection;
import inputLayer.RotateInstruction;
import inputLayer.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputParserTest {

    @Test
    void PlateauSize(){
        //Arrange
        InputParser testParser1 = new InputParser();
        InputParser testParser2 = new InputParser();

        //Act and Assert
        assertEquals(5, testParser2.plateauSizeParser("56").getX());
        assertEquals(6, testParser2.plateauSizeParser("56").getY());
    }


    @Test
    void Instruction() {
        //Arrange
        InputParser testParser = new InputParser();

        //Act
        RotateInstruction testL = testParser.rotateInstructionParser("L");
        RotateInstruction testR = testParser.rotateInstructionParser("R");

        //Assert
        assertEquals(RotateInstruction.L, testL);
        assertEquals(RotateInstruction.R, testR);
        assertEquals(null, testParser.rotateInstructionParser("A"));
    }

    @Test
    void Position() {
        //Arrange
        InputParser testParser = new InputParser();

        //Act
        Position a = testParser.positionParser("23N");
        Position b = testParser.positionParser("00F");

        //Assert
        assertEquals(2, a.getX());
        assertEquals(3, a.getY());
        assertEquals(CompassDirection.N, a.getFacing());
        assertEquals(0, b.getX());
        assertEquals(0, b.getY());
        assertEquals(null, b.getFacing());
    }

    @Test
    void CompassDirection() {
    }
}