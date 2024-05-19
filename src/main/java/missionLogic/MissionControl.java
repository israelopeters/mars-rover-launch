package missionLogic;

import inputLayer.*;
import inputLayer.parser.InputParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

public class MissionControl {
    String name;
    Plateau plateau;
    public Map<String, Rover> launchedRovers = new HashMap<>();
    InputParser inputParser = new InputParser();

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

        for (int i = 0; i < instruction.length(); i++) {
            String instructionChar = Character.toString(instruction.charAt(i));

            if (instructionChar.equals("M")) {
                launchedRovers.get(roverName).move();
            } else if (instructionChar.equals("L") || instructionChar.equals("R")) {
                launchedRovers.get(roverName).rotate(inputParser.rotateInstructionParser(instructionChar));
            } else {
                throw new InputMismatchException("Enter a valid instruction");
            }

            if (i == (instruction.length()) - 1) {
                System.out.println(launchedRovers
                        .get(roverName)
                        .position
                        .toString());
            }
        }
        return launchedRovers.get(roverName).position;
    }
}
