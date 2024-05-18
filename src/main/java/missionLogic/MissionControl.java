package missionLogic;

import inputLayer.Plateau;
import inputLayer.PlateauSize;
import inputLayer.Position;
import inputLayer.RotateInstruction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

public class MissionControl {
    String name;
    Plateau plateau;
    public Map<String, Rover> launchedRovers = new HashMap<>();

    public MissionControl(String name) {
        this.name = name;
    }

    public void initializePlateau(PlateauSize plateauSize) {
        this.plateau = new Plateau(plateauSize);
    }

    public void launchRover(String name, Position position) {
        Rover rover = new Rover(name, position);
        launchedRovers.put(name, rover);
    }

    public Position instructRover(String roverName, RotateInstruction rotateInstruction) {
        return launchedRovers.get(roverName).rotate(rotateInstruction);
    }

    public Position instructRover(String roverName, String instruction) throws InputMismatchException {
        if (instruction.equals("M")) {
            return launchedRovers.get(roverName).move();
        } else {
            throw new InputMismatchException("Enter a valid instruction");
        }
    }
}
