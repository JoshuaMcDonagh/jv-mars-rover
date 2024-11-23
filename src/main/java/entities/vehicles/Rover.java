package entities.vehicles;

import datatypes.EntityIDPrefix;
import entities.Entity;

import static datatypes.EntityIDPrefix.*;

public class Rover extends Entity {
    private static int roverCount = 0;

    public Rover() {
        roverCount ++;
        setEntityID(RV, roverCount);
    }
}
