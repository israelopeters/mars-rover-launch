package inputLayer.parser;

import inputLayer.Plateau;
import inputLayer.PlateauSize;
import inputLayer.parser.InputParser;

public class InitializationInputParser {

    public String[] initializationInput;
    public StringBuilder plateauSizeInputLineOne = new StringBuilder();
    public StringBuilder plateauSizeInputLineTwo = new StringBuilder();
    public String plateauSizeInputLineThree;
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

}
