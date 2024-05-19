import inputLayer.CompassDirection;
import inputLayer.parser.InitializationInputParser;
import inputLayer.parser.InputParser;
import missionLogic.MissionControl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntegrationTest {

    @Test
    void integrationTest() {
        //Arrange
        MissionControl missionControl = new MissionControl("Mars 2024");

        String[] input = {"5 5", "1 2 N", "LMLMLMLMM", "3 3 E", "MMRMMRMRRM"}; //Take input
        InitializationInputParser initializationInputParser = new InitializationInputParser(input);
        InputParser inputParser = initializationInputParser.inputParser;

        missionControl.initializePlateau(initializationInputParser.parseLineOne());
        missionControl.launchRover("Alpha", initializationInputParser.parseLineTwo());
        missionControl.launchRover("Beta", inputParser.positionParser(input[3]));

        int expectedRoverOneX = 1;
        int expectedRoverOneY = 3;
        CompassDirection expectedRoverOneFacing = CompassDirection.N;

        int expectedRoverTwoX = 5;
        int expectedRoverTwoY = 1;
        CompassDirection expectedRoverTwoFacing = CompassDirection.E;

        //Act
        missionControl.instructRover("Alpha", input[2]);
        int actualRoverOneX = missionControl.launchedRovers.get("Alpha").position.getX();
        int actualRoverOneY = missionControl.launchedRovers.get("Alpha").position.getY();
        CompassDirection actualRoverOneFacing = missionControl.launchedRovers.get("Alpha").position.getFacing();

        missionControl.instructRover("Beta", input[4]);
        int actualRoverTwoX = missionControl.launchedRovers.get("Beta").position.getX();
        int actualRoverTwoY = missionControl.launchedRovers.get("Beta").position.getY();
        CompassDirection actualRoverTwoFacing = missionControl.launchedRovers.get("Beta").position.getFacing();

        //Assert
        assertEquals(expectedRoverOneX, actualRoverOneX);
        assertEquals(expectedRoverOneY, actualRoverOneY);
        assertEquals(expectedRoverOneFacing, actualRoverOneFacing);
        assertEquals(expectedRoverTwoX, actualRoverTwoX);
        assertEquals(expectedRoverTwoY, actualRoverTwoY);
        assertEquals(expectedRoverTwoFacing, actualRoverTwoFacing);

    }
}
