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
        for (int i = 0; i < input[2].length(); i++) {
            String instruction = Character.toString(input[2].charAt(i));

            if (instruction.equals("M")) {
                missionControl.instructRover("Alpha", "M");
            } else {
                missionControl.instructRover("Alpha", inputParser.rotateInstructionParser(instruction));
            }

            if (i == (input[2].length()) - 1) {
                System.out.println(missionControl
                        .launchedRovers
                        .get("Alpha")
                        .position
                        .toString());
            }
        }

        //Instructing second rover
        for (int i = 0; i < input[3].length(); i++) {
            String instruction = Character.toString(input[3].charAt(i));

            if (instruction.equals("M")) {
                missionControl.instructRover("Beta", "M");
            } else {
                missionControl.instructRover("Beta", inputParser.rotateInstructionParser(instruction));
            }

            if (i == (input[2].length()) - 1) {
                System.out.println(missionControl
                        .launchedRovers
                        .get("Beta")
                        .position
                        .toString());
            }
        }


    }
}
