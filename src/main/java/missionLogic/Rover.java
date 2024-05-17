package missionLogic;

import inputLayer.CompassDirection;
import inputLayer.Instruction;
import inputLayer.PlateauSize;
import inputLayer.Position;

public class Rover {
    String name;
    Position position;

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
}
