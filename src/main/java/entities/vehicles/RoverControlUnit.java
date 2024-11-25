package entities.vehicles;

import datatypes.Instruction;
import datatypes.RoverPosition;

import java.util.LinkedList;
import java.util.Queue;

public class RoverControlUnit {
    private Queue<Instruction> instructionQueue = new LinkedList<>();
    private OperationControl operationControl;
    private Rover hostRover;

    public RoverControlUnit(Rover hostRover) {
        operationControl = OperationControl.setUp();
        this.hostRover = hostRover;
    }

    private RoverPosition requestLocation() {
        // Gathers current location of this rover from operation control
        return operationControl.getCurrentRoverPosition(hostRover.getEntityID());
    }

    public void requestMove(RoverPosition updatedPosition) {
        // Check operation control to see if calculated location is valid
        // due to plateau size and other objects.
        boolean isMoveApproved = operationControl.validateRoverDestinationRequest(updatedPosition);
    }

    public RoverPosition calculateDestination() {
        // Takes current position and calculates new position depending on instructions.
        Instruction currentInstruction;
        RoverPosition currentPosition = requestLocation();

        while(!instructionQueue.isEmpty()){
            currentInstruction = instructionQueue.poll();

            switch (currentInstruction) {
                case M:
                    currentPosition.updateXY();
                    break;
                case L:
                    currentPosition.updateDirectionLeft();
                    break;
                case R:
                    currentPosition.updateDirectionRight();
                    break;
                default:
                    break;
            }
        }
        return currentPosition;
    }

    public void addToInstructionQueue(Queue<Instruction> updatedInstructions) {
        // Loads instruction queue with new values.
        if(!updatedInstructions.isEmpty()) {
            instructionQueue.addAll(updatedInstructions);
        } else {
            System.out.println("Input queue contains no instructions.");
        }
    }
}
