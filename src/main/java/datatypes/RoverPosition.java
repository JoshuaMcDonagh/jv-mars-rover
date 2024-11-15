package datatypes;

import vehicles.Rover;

public class RoverPosition {
    private int x;
    private int y;
    private CompassDirection directionFacing;

    // Default Values
    public static final int DEFAULT_X = 0;
    public static final int DEFAULT_Y = 0;
    public static final CompassDirection DEFAULT_DIRECTION_FACING = CompassDirection.N;

    // Constructor
    public RoverPosition(int x, int y, CompassDirection direction) {
        this.x = x;
        this.y = y;
        this.directionFacing = direction;
    }

    // Getters
    public int getX() { return x; }

    public int getY() { return y; }

    public CompassDirection getDirectionFacing() { return directionFacing; }
}
