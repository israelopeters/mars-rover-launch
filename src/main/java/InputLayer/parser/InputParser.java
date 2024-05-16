package InputLayer.parser;

import InputLayer.CompassDirection;
import InputLayer.Instruction;
import InputLayer.PlateauSize;
import InputLayer.Position;

public class InputParser {
    public Instruction instruction;
    public  Position position;
    public CompassDirection compassDirection;
    private PlateauSize plateauSize;

    public InputParser(PlateauSize plateauSize) {
        this.plateauSize = plateauSize;
    }

    public InputParser(Position position) {
        this.position = position;
    }

    public InputParser(Instruction instruction) {
        this.instruction = instruction;
    }

    public InputParser(CompassDirection compassDirection) {
        this.compassDirection = compassDirection;
    }

    public PlateauSize getPlateauSize() {
        return plateauSize;
    }

}
