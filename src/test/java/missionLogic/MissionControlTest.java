package missionLogic;

import inputLayer.Plateau;
import inputLayer.PlateauSize;
import inputLayer.Position;
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



}
