package InputLayer.parser;

import InputLayer.CompassDirection;
import InputLayer.Instruction;
import InputLayer.PlateauSize;
import InputLayer.Position;

public class InputParser {
    private Instruction instruction;
    private Position position;
    private CompassDirection compassDirection;
    private final PlateauSize plateauSize;

    private InputParser(InputParserBuilder inputParserBuilder) {
        this.instruction = instruction;
        this.position = inputParserBuilder.position;
        this.compassDirection = inputParserBuilder.compassDirection;
        this.plateauSize = inputParserBuilder.plateauSize;
    }

    public class InputParserBuilder {
        public Instruction instruction;
        public Position position;
        public CompassDirection compassDirection;
        public PlateauSize plateauSize;

        public InputParserBuilder(PlateauSize plateauSize) {
            this.plateauSize = plateauSize;
        }

        public InputParserBuilder instruction(Instruction instruction) {
            this.instruction = instruction;
            return this;
        }

        public InputParserBuilder position(Position position) {
            this.position = position;
            return this;
        }

        public InputParserBuilder compassDirection(CompassDirection compassDirection) {
            this.compassDirection = compassDirection;
            return this;
        }

        public InputParser build() {
            return new InputParser(this);
        }

    }

    public Instruction getInstruction() {
        return instruction;
    }

    public Position getPosition() {
        return position;
    }

    public CompassDirection getCompassDirection() {
        return compassDirection;
    }

    public void setInstruction(Instruction instruction) {
        this.instruction = instruction;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setCompassDirection(CompassDirection compassDirection) {
        this.compassDirection = compassDirection;
    }
}
