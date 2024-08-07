import inputLayer.parser.InputParser;
import missionLogic.MissionControl;
import missionLogic.Rover;
import userInterface.UserInterface;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        //Starting program
        UserInterface.initializeUserInterface();
        Scanner scanner = new Scanner(System.in);

        //Initializations
        //1: Mission control
        UserInterface.initializeMissionControl();
        String missionControlName = scanner.nextLine();
        MissionControl missionControl = new MissionControl(missionControlName);
        InputParser inputParser = new InputParser();

        //2: Plateau
        UserInterface.initializePlateau();
        String plateauSize = scanner.nextLine();
        missionControl.initializePlateau(inputParser.plateauSizeParser(plateauSize));

        //Launching rover(s)
        UserInterface.launchRover();
        boolean isLaunch = true;

        while (isLaunch) {
            UserInterface.enterRoverName();
            String roverName = scanner.nextLine();

            UserInterface.enterRoverPosition();
            String roverPosition = scanner.nextLine();
            missionControl.launchRover(roverName, inputParser.positionParser(roverPosition));

            UserInterface.launchAnotherRoverPrompt();
            String launchAnotherRover = scanner.nextLine();
            if (!launchAnotherRover.equalsIgnoreCase("Y")) {
                isLaunch = false;
            }
        }

        //Instructing launched rover(s)
        boolean isInstruct = true;
        UserInterface.instructRoverWelcome();

        while (isInstruct) {
            UserInterface.instructRoverEnterName();
            String roverName = scanner.nextLine();

            UserInterface.instructRoverEnterInstructions();
            String roverInstruction = scanner.nextLine();

            System.out.println(
                    missionControl.instructRover(roverName, roverInstruction)
            );

            UserInterface.instructRoverAgainPrompt();
            String instructRoverAgain = scanner.nextLine();

            while (instructRoverAgain.equalsIgnoreCase("Y")) {
                UserInterface.instructRoverEnterInstructions();
                String roverInstructionAgain = scanner.nextLine();
                System.out.println(
                        missionControl.instructRover(roverName, roverInstructionAgain)
                );

                UserInterface.instructRoverAgainPrompt();
                String reInstructAgain = scanner.nextLine();
                if (!reInstructAgain.equalsIgnoreCase("Y")) {
                    instructRoverAgain = "N";
                }
            }
            isInstruct = false;
        }

        UserInterface.retireRover();

    }
}
