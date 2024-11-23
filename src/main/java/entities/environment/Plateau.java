package entities.environment;

// Uses singleton pattern to avoid more than one plateau
// existing at one time.

import entities.Entity;

public class Plateau{
    private static PlateauSize size;
    private static Plateau instance;
    private static Entity[][][] plateauGrid;

    private Plateau(PlateauSize plateauSize) {
        size = plateauSize;
    }

    public Plateau createPlateau(PlateauSize plateauSize) {
        if(instance == null) {
            instance = new Plateau(plateauSize);
        }
        return instance;
    }

    public PlateauSize getSize() {
        return size;
    }

    public static Entity[][][] getPlateauGrid() {
        return plateauGrid;
    }
}
