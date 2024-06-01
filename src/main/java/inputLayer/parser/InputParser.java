package inputLayer.parser;

import inputLayer.CompassDirection;
import inputLayer.RotateInstruction;
import inputLayer.PlateauSize;
import inputLayer.Position;

import java.util.Arrays;

public class InputParser {
    public  Position position;

    public InputParser() {
    }

    public Position positionParser(String position) {
        String[] tempVar;
        if (position.contains(" ")) {
            tempVar = position.split(" ");
        } else {
            tempVar = position.split("");
        }

        int x = Integer.parseInt(tempVar[0]);
        int y = Integer.parseInt(tempVar[1]);
        this.position = new Position(x, y, null);

        switch (tempVar[2]) {
            case "N" -> this.position.setFacing(CompassDirection.N);
            case "E"-> this.position.setFacing(CompassDirection.E);
            case "W" -> this.position.setFacing(CompassDirection.W);
            case "S" -> this.position.setFacing(CompassDirection.S);
        }
        return this.position;
    }

    public RotateInstruction rotateInstructionParser(String instruction) { //Expecting a single string per time
            switch (instruction) {
                case "L" -> {return RotateInstruction.L;}
                case "R" -> {return RotateInstruction.R;}
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
        String[] tempArray =  plateauSize.split("\s");
        int x = Integer.parseInt(String.valueOf(tempArray[0]));
        int y = Integer.parseInt(String.valueOf(tempArray[1]));

        return new PlateauSize(x, y);
    }

}
