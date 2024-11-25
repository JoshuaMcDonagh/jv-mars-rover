package datatypes;

import java.util.List;

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

    // Update values
    public void updateDirectionRight() {
        List<CompassDirection> compassDirectionsArray = CompassDirection.toArray();
        int currentIndex = compassDirectionsArray.indexOf(directionFacing);

        if (currentIndex == compassDirectionsArray.size()-1) {
            currentIndex = 0;
        } else {
            currentIndex ++;
        }

        directionFacing = compassDirectionsArray.get(currentIndex);
    }

    public void updateDirectionLeft() {
        List<CompassDirection> compassDirectionsArray = directionFacing.toArray();
        int currentIndex = compassDirectionsArray.indexOf(directionFacing);

        if (currentIndex == 0) {
            currentIndex = compassDirectionsArray.size()-1;
        } else {
            currentIndex --;
        }

        directionFacing = compassDirectionsArray.get(currentIndex);
    }

    public void updateXY() {
        switch (directionFacing) {
            case N:
                y++;
                break;
            case E:
                x++;
                break;
            case S:
                y--;
                break;
            case W:
                x--;
                break;
            default:
                break;
        }
    }
}
