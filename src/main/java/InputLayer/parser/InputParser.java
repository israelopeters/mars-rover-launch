package InputLayer.parser;

import InputLayer.CompassDirection;
import InputLayer.Instruction;
import InputLayer.PlateauSize;
import InputLayer.Position;

public class InputParser {
    public  Position position;
    private PlateauSize plateauSize;

    public InputParser() {
    }

    public Position positionParser(String position) {
        this.position.setX(position.charAt(0));
        this.position.setY(position.charAt(1));
        switch (position.indexOf(1)) {
            case 'N' -> this.position.setFacing(CompassDirection.N);
            case 'E' -> this.position.setFacing(CompassDirection.E);
            case 'W' -> this.position.setFacing(CompassDirection.W);
            case 'S' -> this.position.setFacing(CompassDirection.S);
        }
        return this.position;
    }

    public Instruction instructionParser(String instructions) { //Expecting a single string per time
            switch (instructions) {
                case "L" -> {return Instruction.L;}
                case "R" -> {return Instruction.R;}
                case "M" -> {return Instruction.M;}
                default -> {return null;}
            }
    }

    public CompassDirection compassDirectionParser(String compassDirection) { //Expecting a single string per time
        switch (compassDirection) {
            case "N" -> {return CompassDirection.N;}
            case "E" -> {return CompassDirection.E;}
            case "W" -> {return CompassDirection.W;}
            case "S" -> {return CompassDirection.S;}
            default -> {return null;}
        }
    }

    public PlateauSize plateauSizeParser(String plateauSize) {
        char[] tempVar = {plateauSize.charAt(0), plateauSize.charAt(1)};
        int x = Integer.parseInt(String.valueOf(tempVar[0]));
        int y = Integer.parseInt(String.valueOf(tempVar[1]));
        this.plateauSize = new PlateauSize(x, y);
        return this.plateauSize;
    }

    public PlateauSize getPlateauSize() {
        return plateauSize;
    }

}
