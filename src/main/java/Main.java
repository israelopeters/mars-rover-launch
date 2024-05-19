import inputLayer.Position;
import inputLayer.parser.InitializationInputParser;
import inputLayer.parser.InputParser;
import missionLogic.MissionControl;

public class Main {
    public static void main(String[] args) throws Exception {

        //Starting program
        //Initializations
        MissionControl missionControl = new MissionControl("Mars 2024");

        String[] input = {"5 5", "1 2 N", "LMLMLMLMM", "3 3 E", "MMRMMRMRRM"}; //Take input
        InitializationInputParser initializationInputParser = new InitializationInputParser(input);
        InputParser inputParser = initializationInputParser.inputParser;

        //Creating plateau
        missionControl.initializePlateau(initializationInputParser.parseLineOne());

        //Launching two rovers
        missionControl.launchRover("Alpha", initializationInputParser.parseLineTwo());
        missionControl.launchRover("Beta", inputParser.positionParser(input[3]));

        //Instructing first rover
        missionControl.instructRover("Alpha", input[2]);

        //Instructing second rover
        missionControl.instructRover("Beta", input[4]);



    }
}
