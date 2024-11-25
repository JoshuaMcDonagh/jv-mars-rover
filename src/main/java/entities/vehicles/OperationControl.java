package entities.vehicles;

import datatypes.RoverPosition;
import entities.environment.Plateau;
import entities.environment.PlateauSize;

import javax.management.openmbean.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;

// Singleton class to avoid creation of more than one and to allow access
// by multiple rovers.

public class OperationControl {
    private Map<String, RoverPosition> operationalRoverPositions = new HashMap<>();
    private static OperationControl instance;
    private final PlateauSize plateauSize = Plateau.getSize();

    private OperationControl() {}

    public static OperationControl setUp() {
        if(instance == null) {
            return new OperationControl();
        }
        return instance;
    }

    public void updateRoverPosition(String roverID, RoverPosition position) {
        operationalRoverPositions.put(roverID, position);
    }

    public RoverPosition getCurrentRoverPosition(String requestingRoverID) throws InvalidKeyException {
        // Returns correct rover position.
        if(operationalRoverPositions.containsKey(requestingRoverID)) {
            return operationalRoverPositions.get(requestingRoverID);
        } else {
            throw new InvalidKeyException();
        }
    }

    public boolean validateRoverDestinationRequest(RoverPosition position) {
        // Validate co-ordinate is in bounds and has no other entities within.
        boolean isInBounds =
                position.getX() <= plateauSize.x() &&
                position.getY() <= plateauSize.y() &&
                position.getX() >= 0 &&
                position.getY() >= 0;

        boolean isFreeSpace = !operationalRoverPositions.containsValue(position);

        return isInBounds && isFreeSpace;
    }

}
