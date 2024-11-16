package parsing;

import datatypes.CompassDirection;
import datatypes.RoverPosition;

// NOTE: Rover position parser will only take String input.
//       Data validation should be handled with appropriate
//       verifier before data is passed in.
//
//       Verified string will return a RoverPosition with stated values.

public class RoverPositionParser extends Parser <RoverPosition> {

    @Override
    public RoverPosition parse(String input) {
        String[] positionValueString = input.split(" ");
        int x = Integer.parseInt(positionValueString[0]);
        int y = Integer.parseInt(positionValueString[1]);
        CompassDirection direction;

        // Final handling of invalid input before object creation.
        //TODO: Potential for this to move into the verification methods.
        // Interface could be used to add parseVerify() methods to
        // suitable verifier classes.

        // Handles X and Y
        if (x < 0 && y < 0) {
            x = RoverPosition.DEFAULT_X;
            y = RoverPosition.DEFAULT_Y;
            System.out.println("Invalid co-ordinates. Default values used.\n");
        } else if (x < 0) {
            x = y;
            System.out.println("Invalid X coordinate. Y has been used for both.\n");
        } else if (y < 0) {
            y = x;
            System.out.println("Invalid Y coordinate. X has been used for both.\n");
        }

        // Handles direction
        switch (positionValueString[2]) {
            case "N":
                direction = CompassDirection.N;
                break;
            case "E":
                direction = CompassDirection.E;
                break;
            case "S":
                direction = CompassDirection.S;
                break;
            case "W":
                direction = CompassDirection.W;
                break;
            default:
                direction = RoverPosition.DEFAULT_DIRECTION_FACING;
                System.out.println("Invalid direction. Default value used.");
                break;
        }

        return new RoverPosition(x, y, direction);
    }
}
