package missionLogic;

import inputLayer.Plateau;
import inputLayer.PlateauSize;
import inputLayer.Position;
import inputLayer.RotateInstruction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MissionControl {
    String name;
    Plateau plateau;
    Map<String, Rover> launchedRovers = new HashMap<>();
    ArrayList<Rover> retiredRovers;

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
        return launchedRovers.get(name).rotate(rotateInstruction);
    }
}
