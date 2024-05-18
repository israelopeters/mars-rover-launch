package inputLayer.parser;

import inputLayer.Plateau;
import inputLayer.PlateauSize;
import inputLayer.Position;
import inputLayer.parser.InputParser;
import missionLogic.Rover;

public class InitializationInputParser {

    public String[] initializationInput;
    public StringBuilder plateauSizeInputLineOne = new StringBuilder();
    public StringBuilder plateauSizeInputLineTwo = new StringBuilder();
    public String plateauSizeInputLineThree;
    public Rover rover;
    public InputParser inputParser =  new InputParser();

    public InitializationInputParser(String[] initializationInput) {
        this.initializationInput = initializationInput;
    }

    //Parse Line One
    public Plateau parseLineOne() {
        plateauSizeInputLineOne.append(initializationInput[0].split("\s")[0])
                .append(initializationInput[0].split("\s")[1]);

        PlateauSize plateauSize = inputParser.plateauSizeParser(plateauSizeInputLineOne.toString());
        return new Plateau(plateauSize);
    }

    //Parse Line Two
    public Position parseLineTwo() {
        String[] inputLineTwoArray = initializationInput[1].split("\s");
        for (int i = 0; i < inputLineTwoArray.length; i++) {
            plateauSizeInputLineTwo.append(inputLineTwoArray[i]);
        }
        return inputParser.positionParser(plateauSizeInputLineTwo.toString());
    }

}
