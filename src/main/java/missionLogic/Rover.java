package missionLogic;

import inputLayer.CompassDirection;
import inputLayer.Position;
import inputLayer.RotateInstruction;

public class Rover {
    private final String name;
    public Position position;

    public Rover(String name, Position position) {
        this.position = position;
        this.name = name;
    }

    public Position move() {
        switch (position.getFacing()) {
            case N -> this.position.setY(position.getY() + 1);
            case E -> this.position.setX(position.getX() + 1);
            case W -> this.position.setX(position.getX() - 1);
            case S -> this.position.setY(position.getY() - 1);
        }
        return position;
    };

    public Position rotate(RotateInstruction rotateInstruction) {
        switch (position.getFacing()) {
            case N -> {position.setFacing(
                    rotateInstruction == RotateInstruction.L ? CompassDirection.W : CompassDirection.E);
                return position;}
            case E -> {position.setFacing(
                    rotateInstruction == RotateInstruction.L ? CompassDirection.N : CompassDirection.S);
                return position;}
            case W -> {position.setFacing(
                    rotateInstruction == RotateInstruction.L ? CompassDirection.S : CompassDirection.N);
                return position;}
            case S -> {position.setFacing(
                    rotateInstruction == RotateInstruction.L ? CompassDirection.E : CompassDirection.W);
                return position;}
            default -> {return null;}
        }
    }

    public String getName() {
        return name;
    }
}
