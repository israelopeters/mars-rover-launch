import inputLayer.CompassDirection;
import inputLayer.Position;
import inputLayer.RotateInstruction;
import missionLogic.Rover;

public class Main {
    public static void main(String[] args) {

        Rover testRover = new Rover("Alpha", new Position(1,1, CompassDirection.N));
        Rover testRover2 = new Rover("Alpha2", new Position(1,1, CompassDirection.N));

        System.out.println(testRover.getName());
        System.out.println(testRover.position.getFacing());
        System.out.println(testRover.rotate(RotateInstruction.L).getFacing());
        System.out.println(testRover.rotate(RotateInstruction.L).getFacing());
        System.out.println(testRover.rotate(RotateInstruction.L).getFacing());
        System.out.println(testRover.rotate(RotateInstruction.L).getFacing());
        System.out.println("\n");

        System.out.println(testRover2.getName());
        System.out.println(testRover2.position.getFacing());
        System.out.println(testRover2.rotate(RotateInstruction.R).getFacing());
        System.out.println(testRover2.rotate(RotateInstruction.R).getFacing());
        System.out.println(testRover2.rotate(RotateInstruction.R).getFacing());
        System.out.println(testRover2.rotate(RotateInstruction.R).getFacing());

    }
}
