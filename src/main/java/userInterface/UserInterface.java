package userInterface;

public class UserInterface {


    public static void initializeUserInterface() {
        System.out.println("\nWelcome to Mars Rover Launch\n-----------------");
    }

    public static void initializeMissionControl() {
        System.out.println("\nInitializing Mission Control Center...\n");
        System.out.print("What is the name of this Mission Control Center? ");
    }

    public static void initializePlateau() {
        System.out.print("\nPlease enter the plateau size for this mission." +
                "\nSeperate the x and y values with a space, as in: x y" +
                "\ne.g., 32 55 \nNow enter plateau size: ");
    }

    public static void launchRover() {
        System.out.println("\nLet's launch your rover(s)!");
    }

    public static void enterRoverName() {
        System.out.print("\nPlease enter rover name: ");
    }

    public static void enterRoverPosition() {
        System.out.print("\nPlease enter rover position (e.g., 1 2 N): ");
    }

    public static void launchAnotherRoverPrompt() {System.out.print("\nWould you like to launch another rover? ");}

    public static void instructRoverWelcome() {
        System.out.println("Follow these steps to instruct a rover:");
    }

    public static void instructRoverEnterName() {
        System.out.print("Enter rover name: ");
    }

    public static void instructRoverEnterInstructions() {
        System.out.println("L: rotate left \nR: rotate right \nM: move forward one step in same direction " +
                "\nEnter multiple instrucitions without space (e.g., LMMLR)");
        System.out.print("\nEnter instruction(s): ");
    }

    public static void instructRoverAgainPrompt() {
        System.out.println("\nWould you like to instruct rover again? " +
                "\nY: yes \nN: no, stop here");
        //Can only instruct one rover per time
    }

}
