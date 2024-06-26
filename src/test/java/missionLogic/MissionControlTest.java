package missionLogic;

import inputLayer.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MissionControlTest {

    @Test
    void initializePlateauTest() {
        //Arrange
        MissionControl missionControl = new MissionControl("Mars Mission 2130");
        missionControl.initializePlateau(new PlateauSize(4,7));

        int expectedX = 4;
        int expectedY = 7;

        //Act
        int actualX = missionControl.plateau.getPlateauSize().getX();
        int actualY = missionControl.plateau.getPlateauSize().getY();

        //Assert
        assertEquals(expectedX, actualX);
        assertEquals(expectedY, actualY);
    }

    @Test
    void launchRoverTest () {
        //Arrange
        MissionControl missionControl = new MissionControl("Mars Mission 2130");
        missionControl.initializePlateau(new PlateauSize(4,7));
        int expected = 0;

        //Act
        missionControl.launchRover("Alpha", new Position(0,0, CompassDirection.N));
        int actual = missionControl.launchedRovers.get("Alpha").position.getX();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void instructRover() {
        //Arrange
        MissionControl missionControl = new MissionControl("Mars Mission 2130");
        missionControl.initializePlateau(new PlateauSize(6,6));
        missionControl.launchRover("Alpha", new Position(0,0, CompassDirection.N));

        Rover testRover = missionControl.launchedRovers.get("Alpha");
        CompassDirection expected = CompassDirection.W;

        //Act
        missionControl.instructRover(testRover.getName(), RotateInstruction.L); //add option for move()
        CompassDirection actual = testRover.position.getFacing();

        //Assert
        assertEquals(expected, actual);

    }

}
