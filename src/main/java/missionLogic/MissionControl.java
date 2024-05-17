package missionLogic;

import inputLayer.Plateau;
import inputLayer.PlateauSize;

import java.util.ArrayList;

public class MissionControl {
    String name;
    Plateau plateau;
    ArrayList<Rover> launchedRovers;
    ArrayList<Rover> retiredRovers;

    public MissionControl(String name) {
        this.name = name;
    }

    public void initializePlateau(PlateauSize plateauSize) {
        this.plateau = new Plateau(plateauSize);
    }
}
