package entities.vehicles;

import datatypes.RoverPosition;

import java.util.HashMap;
import java.util.Map;

// Singleton class to avoid creation of more than one and to allow access
// by multiple rovers.

public class OperationControl {
    private Map<String, RoverPosition> operationalRoverPositions= new HashMap<>();
    private static OperationControl instance;

    private OperationControl() {}

    public static OperationControl setUp() {
        if(instance == null) {
            return new OperationControl();
        }
        return instance;
    }

    public void addRover(String roverID, RoverPosition position) {
        // Add rover for position tracking
    }

    private void updatePosition(RoverPosition position) {
        // Update Rover position
    }

    public RoverPosition getCurrentRoverPosition(String requestingRoverID) {
        // Returns correct rover position.
        return null;
    }

    public boolean validateRoverDestinationRequest(RoverPosition position) {
        // Validate co-ordinate is in bounds and has no other entities within.
        return true;
    }

}
