package entities.environment;

// Uses singleton pattern to avoid more than one plateau
// existing at one time.

import datatypes.RoverPosition;
import entities.Entity;

public class Plateau{
    private static PlateauSize size;
    private static Plateau instance;
    private static Entity[][][] plateauGrid;

    private Plateau(PlateauSize plateauSize) {
        size = plateauSize;
    }

    public static Plateau createPlateau(PlateauSize plateauSize) {
        if(instance == null) {
            instance = new Plateau(plateauSize);
        }
        return instance;
    }

    public static Plateau createPlateau() {
        if(instance == null) {
            System.out.println("Plateau has not been created.");
        }
        return instance;
    }

    public PlateauSize getSize() {
        return size;
    }

    public void updateEntityPosition(Entity entity, RoverPosition position, RoverPosition originalPosition) {
            plateauGrid[position.getX()] [position.getY()] [0] = entity;
            plateauGrid[originalPosition.getX()] [originalPosition.getY()] [0] = null;
    }
}
