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
                "\ne.g., 32 55");
    }
}
