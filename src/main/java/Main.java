import inputLayer.parser.InitializationInputParser;
import inputLayer.parser.InputParser;
import missionLogic.MissionControl;

public class Main {
    public static void main(String[] args) {

        //Starting program
        //Initializations
        MissionControl missionControl = new MissionControl("Mars 2024");

        String[] input = {"5 5", "1 2 N", "LMLMLMLMM", "3 3 E", "MMRMMRMRRM"}; //Take input
        InitializationInputParser initializationInputParser = new InitializationInputParser(input);
        InputParser inputParser = initializationInputParser.inputParser;

        //Creating plateau
        missionControl.initializePlateau(initializationInputParser.parseLineOne());
        //Launching first rover
        missionControl.launchRover("Alpha", initializationInputParser.parseLineTwo());

        //Instructing first rover
        for (int i = 0; i < input[2].length(); i++) {
            String instruction = Character.toString(input[2].charAt(i));
            System.out.println(
                    missionControl
                            .instructRover("Alpha", inputParser.rotateInstructionParser(instruction))
                            .toString());
        }
    }
}
