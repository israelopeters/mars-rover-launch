import inputLayer.Position;
import inputLayer.parser.InitializationInputParser;
import inputLayer.parser.InputParser;
import missionLogic.MissionControl;
import userInterface.UserInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        //Starting program
        UserInterface.initializeUserInterface();
        Scanner scanner = new Scanner(System.in);

        //Initializations
        UserInterface.initializeMissionControl();
        String missionControlName = scanner.nextLine();
        MissionControl missionControl = new MissionControl(missionControlName);
        InputParser inputParser = new InputParser();

        UserInterface.initializePlateau();
        String plateauSize = scanner.nextLine();
        missionControl.initializePlateau(inputParser.plateauSizeParser(plateauSize));

        String[] input = {"5 5", "1 2 N", "LMLMLMLMM", "3 3 E", "MMRMMRMRRM"}; //Take input
        InitializationInputParser initializationInputParser = new InitializationInputParser(input);

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
