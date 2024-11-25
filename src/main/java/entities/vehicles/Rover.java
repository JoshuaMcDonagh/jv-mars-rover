package entities.vehicles;

import datatypes.RoverPosition;
import entities.Entity;
import entities.environment.Plateau;

import static datatypes.EntityIDPrefix.*;

public class Rover extends Entity {
    private static int roverCount = 0;
    RoverControlUnit activeControlUnit;

    public Rover() {
        roverCount ++;
        setEntityID(RV, roverCount);
        activeControlUnit = new RoverControlUnit(this);
    }

    public void move(RoverPosition updatedPosition, RoverPosition originalPosition) {
        // Moves the position of the rover in the plateauGrid
        Plateau plateau = Plateau.createPlateau();

        plateau.updateEntityPosition(this, updatedPosition, originalPosition);
    }
}
