package entities.vehicles;

import datatypes.CompassDirection;
import datatypes.Instruction;
import datatypes.RoverPosition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static datatypes.Instruction.*;
import static org.junit.jupiter.api.Assertions.*;

class RoverControlUnitTest {

    @Test
    @DisplayName("Should add new instructions to the RoverControlUnit instruction queue.")
    void addToInstructionQueueValid() {
        RoverControlUnit rcu = new RoverControlUnit(new Rover());
        RoverPosition currentRoverPosition = new RoverPosition(0,0, CompassDirection.N);
        RoverPosition expectedRoverPosition = new RoverPosition(0,1,CompassDirection.N);

        Queue<Instruction> testInstructions = new LinkedList<Instruction>(List.of(M)); // Queue to add
        rcu.addToInstructionQueue(testInstructions); // Adding queue to rcu queue

        RoverPosition calculatedRoverPosition = rcu.calculateDestination();

        assertAll(
                // Single 'M'
                () -> assertEquals(expectedRoverPosition.getX(), calculatedRoverPosition.getX()),
                () -> assertEquals(expectedRoverPosition.getY(), calculatedRoverPosition.getY()),
                () -> assertEquals(expectedRoverPosition.getDirectionFacing(), calculatedRoverPosition.getDirectionFacing())
        );
    }

    @Test
    @DisplayName("Should not add to queue due to empty input.")
    void addToInstructionQueueEmpty() {
        RoverControlUnit rcu = new RoverControlUnit(new Rover());
        RoverPosition currentRoverPosition = new RoverPosition(0,0, CompassDirection.N);
        RoverPosition expectedRoverPosition = new RoverPosition(0,0,CompassDirection.N);

        Queue<Instruction> testInstructions = new LinkedList<Instruction>(); // Queue to add (Empty)
        rcu.addToInstructionQueue(testInstructions); // Adding queue to rcu queue

        RoverPosition calculatedRoverPosition = rcu.calculateDestination();

        assertAll(
                // Single 'M'
                () -> assertEquals(expectedRoverPosition.getX(), calculatedRoverPosition.getX()),
                () -> assertEquals(expectedRoverPosition.getY(), calculatedRoverPosition.getY()),
                () -> assertEquals(expectedRoverPosition.getDirectionFacing(), calculatedRoverPosition.getDirectionFacing())
        );
    }

    // Move
    @Test
    @DisplayName("Should calculate new rover position correctly based on single input.")
    void calculateDestinationSingleMoveY() {
        RoverControlUnit rcu = new RoverControlUnit(new Rover());
        RoverPosition currentRoverPosition = new RoverPosition(0,0, CompassDirection.N);
        RoverPosition expectedRoverPosition = new RoverPosition(0,1,CompassDirection.N);
        Queue<Instruction> testInstructions = new LinkedList<Instruction>(List.of(M));
        rcu.addToInstructionQueue(testInstructions);

        RoverPosition calculatedRoverPosition = rcu.calculateDestination();

        assertAll(
                // Single 'M'
                () -> assertEquals(expectedRoverPosition.getX(), calculatedRoverPosition.getX()),
                () -> assertEquals(expectedRoverPosition.getY(), calculatedRoverPosition.getY()),
                () -> assertEquals(expectedRoverPosition.getDirectionFacing(), calculatedRoverPosition.getDirectionFacing())
        );
    }

    @Test
    @DisplayName("Should calculate new rover position correctly based on multiple moves.")
    void calculateDestinationMultiMoveY() {
        RoverControlUnit rcu = new RoverControlUnit(new Rover());
        RoverPosition currentRoverPosition = new RoverPosition(0,0, CompassDirection.N);
        RoverPosition expectedRoverPosition = new RoverPosition(0,5,CompassDirection.N);
        Queue<Instruction> testInstructions = new LinkedList<Instruction>(List.of(M,M,M,M,M));
        rcu.addToInstructionQueue(testInstructions);

        RoverPosition calculatedRoverPosition = rcu.calculateDestination();

        assertAll(
                // Multi 5x 'M'
                () -> assertEquals(expectedRoverPosition.getX(), calculatedRoverPosition.getX()),
                () -> assertEquals(expectedRoverPosition.getY(), calculatedRoverPosition.getY()),
                () -> assertEquals(expectedRoverPosition.getDirectionFacing(), calculatedRoverPosition.getDirectionFacing())
        );
    }

    @Test
    @DisplayName("Should calculate new rover position correctly based on single input.")
    void calculateDestinationSingleMoveX() {
        RoverControlUnit rcu = new RoverControlUnit(new Rover());
        RoverPosition currentRoverPosition = new RoverPosition(0,0, CompassDirection.N);
        RoverPosition expectedRoverPosition = new RoverPosition(0,1,CompassDirection.N);
        Queue<Instruction> testInstructions = new LinkedList<Instruction>(List.of(M));
        rcu.addToInstructionQueue(testInstructions);

        RoverPosition calculatedRoverPosition = rcu.calculateDestination();

        assertAll(
                // Single 'M'
                () -> assertEquals(expectedRoverPosition.getX(), calculatedRoverPosition.getX()),
                () -> assertEquals(expectedRoverPosition.getY(), calculatedRoverPosition.getY()),
                () -> assertEquals(expectedRoverPosition.getDirectionFacing(), calculatedRoverPosition.getDirectionFacing())
        );
    }

    @Test
    @DisplayName("Should calculate new rover position correctly based on multiple moves.")
    void calculateDestinationMultiMoveX() {
        RoverControlUnit rcu = new RoverControlUnit(new Rover());
        RoverPosition currentRoverPosition = new RoverPosition(0,0, CompassDirection.N);
        RoverPosition expectedRoverPosition = new RoverPosition(5,0,CompassDirection.E);
        Queue<Instruction> testInstructions = new LinkedList<Instruction>(List.of(R,M,M,M,M,M));
        rcu.addToInstructionQueue(testInstructions);

        RoverPosition calculatedRoverPosition = rcu.calculateDestination();

        assertAll(
                // Multi 5x 'M'
                () -> assertEquals(expectedRoverPosition.getX(), calculatedRoverPosition.getX()),
                () -> assertEquals(expectedRoverPosition.getY(), calculatedRoverPosition.getY()),
                () -> assertEquals(expectedRoverPosition.getDirectionFacing(), calculatedRoverPosition.getDirectionFacing())
        );
    }

    // North turning
    @Test
    @DisplayName("Should calculate new rover position based on s single rotate.")
    void calculateDestinationNorthTurnLeft() {
        RoverControlUnit rcu = new RoverControlUnit(new Rover());
        RoverPosition currentRoverPosition = new RoverPosition(0,0, CompassDirection.N);
        RoverPosition expectedRoverPosition = new RoverPosition(0,0,CompassDirection.W);
        Queue<Instruction> testInstructions = new LinkedList<Instruction>(List.of(L));
        rcu.addToInstructionQueue(testInstructions);

        RoverPosition calculatedRoverPosition = rcu.calculateDestination();

        assertAll(
                // Single 'L'
                () -> assertEquals(expectedRoverPosition.getX(), calculatedRoverPosition.getX()),
                () -> assertEquals(expectedRoverPosition.getY(), calculatedRoverPosition.getY()),
                () -> assertEquals(expectedRoverPosition.getDirectionFacing(), calculatedRoverPosition.getDirectionFacing())
        );
    }

    @Test
    @DisplayName("Should calculate new rover position based on s single rotate.")
    void calculateDestinationNorthTurnRight() {
        RoverControlUnit rcu = new RoverControlUnit(new Rover());
        RoverPosition currentRoverPosition = new RoverPosition(0,0, CompassDirection.N);
        RoverPosition expectedRoverPosition = new RoverPosition(0,0,CompassDirection.E);
        Queue<Instruction> testInstructions = new LinkedList<Instruction>(List.of(R));
        rcu.addToInstructionQueue(testInstructions);

        RoverPosition calculatedRoverPosition = rcu.calculateDestination();

        assertAll(
                // Single 'R'
                () -> assertEquals(expectedRoverPosition.getX(), calculatedRoverPosition.getX()),
                () -> assertEquals(expectedRoverPosition.getY(), calculatedRoverPosition.getY()),
                () -> assertEquals(expectedRoverPosition.getDirectionFacing(), calculatedRoverPosition.getDirectionFacing())
        );
    }

    // East turning
    @Test
    @DisplayName("Should calculate new rover position based on s single rotate.")
    void calculateDestinationEastTurnLeft() {
        RoverControlUnit rcu = new RoverControlUnit(new Rover());
        RoverPosition currentRoverPosition = new RoverPosition(0,0, CompassDirection.E);
        RoverPosition expectedRoverPosition = new RoverPosition(0,0,CompassDirection.N);
        Queue<Instruction> testInstructions = new LinkedList<Instruction>(List.of(L));
        rcu.addToInstructionQueue(testInstructions);

        RoverPosition calculatedRoverPosition = rcu.calculateDestination();

        assertAll(
                // Single 'L'
                () -> assertEquals(expectedRoverPosition.getX(), calculatedRoverPosition.getX()),
                () -> assertEquals(expectedRoverPosition.getY(), calculatedRoverPosition.getY()),
                () -> assertEquals(expectedRoverPosition.getDirectionFacing(), calculatedRoverPosition.getDirectionFacing())
        );
    }

    @Test
    @DisplayName("Should calculate new rover position based on s single rotate.")
    void calculateDestinationEastTurnRight() {
        RoverControlUnit rcu = new RoverControlUnit(new Rover());
        RoverPosition currentRoverPosition = new RoverPosition(0,0, CompassDirection.E);
        RoverPosition expectedRoverPosition = new RoverPosition(0,0,CompassDirection.S);
        Queue<Instruction> testInstructions = new LinkedList<Instruction>(List.of(R));
        rcu.addToInstructionQueue(testInstructions);

        RoverPosition calculatedRoverPosition = rcu.calculateDestination();

        assertAll(
                // Single 'R'
                () -> assertEquals(expectedRoverPosition.getX(), calculatedRoverPosition.getX()),
                () -> assertEquals(expectedRoverPosition.getY(), calculatedRoverPosition.getY()),
                () -> assertEquals(expectedRoverPosition.getDirectionFacing(), calculatedRoverPosition.getDirectionFacing())
        );
    }

    // South turning
    @Test
    @DisplayName("Should calculate new rover position based on s single rotate.")
    void calculateDestinationSouthTurnLeft() {
        RoverControlUnit rcu = new RoverControlUnit(new Rover());
        RoverPosition currentRoverPosition = new RoverPosition(0,0, CompassDirection.S);
        RoverPosition expectedRoverPosition = new RoverPosition(0,0,CompassDirection.E);
        Queue<Instruction> testInstructions = new LinkedList<Instruction>(List.of(L));
        rcu.addToInstructionQueue(testInstructions);


        RoverPosition calculatedRoverPosition = rcu.calculateDestination();

        assertAll(
                // Single 'L'
                () -> assertEquals(expectedRoverPosition.getX(), calculatedRoverPosition.getX()),
                () -> assertEquals(expectedRoverPosition.getY(), calculatedRoverPosition.getY()),
                () -> assertEquals(expectedRoverPosition.getDirectionFacing(), calculatedRoverPosition.getDirectionFacing())
        );
    }

    @Test
    @DisplayName("Should calculate new rover position based on s single rotate.")
    void calculateDestinationSouthTurnRight() {
        RoverControlUnit rcu = new RoverControlUnit(new Rover());
        RoverPosition currentRoverPosition = new RoverPosition(0,0, CompassDirection.S);
        RoverPosition expectedRoverPosition = new RoverPosition(0,0,CompassDirection.W);
        Queue<Instruction> testInstructions = new LinkedList<Instruction>(List.of(R));
        rcu.addToInstructionQueue(testInstructions);

        RoverPosition calculatedRoverPosition = rcu.calculateDestination();

        assertAll(
                // Single 'R'
                () -> assertEquals(expectedRoverPosition.getX(), calculatedRoverPosition.getX()),
                () -> assertEquals(expectedRoverPosition.getY(), calculatedRoverPosition.getY()),
                () -> assertEquals(expectedRoverPosition.getDirectionFacing(), calculatedRoverPosition.getDirectionFacing())
        );
    }

    // West turning
    @Test
    @DisplayName("Should calculate new rover position based on s single rotate.")
    void calculateDestinationWestTurnLeft() {
        RoverControlUnit rcu = new RoverControlUnit(new Rover());
        RoverPosition currentRoverPosition = new RoverPosition(0,0, CompassDirection.W);
        RoverPosition expectedRoverPosition = new RoverPosition(0,0,CompassDirection.S);
        Queue<Instruction> testInstructions = new LinkedList<Instruction>(List.of(L));
        rcu.addToInstructionQueue(testInstructions);

        RoverPosition calculatedRoverPosition = rcu.calculateDestination();

        assertAll(
                // Single 'L'
                () -> assertEquals(expectedRoverPosition.getX(), calculatedRoverPosition.getX()),
                () -> assertEquals(expectedRoverPosition.getY(), calculatedRoverPosition.getY()),
                () -> assertEquals(expectedRoverPosition.getDirectionFacing(), calculatedRoverPosition.getDirectionFacing())
        );
    }

    @Test
    @DisplayName("Should calculate new rover position based on s single rotate.")
    void calculateDestinationWestTurnRight() {
        RoverControlUnit rcu = new RoverControlUnit(new Rover());
        RoverPosition currentRoverPosition = new RoverPosition(0,0, CompassDirection.W);
        RoverPosition expectedRoverPosition = new RoverPosition(0,0,CompassDirection.N);
        Queue<Instruction> testInstructions = new LinkedList<Instruction>(List.of(R));
        rcu.addToInstructionQueue(testInstructions);

        RoverPosition calculatedRoverPosition = rcu.calculateDestination();

        assertAll(
                // Single 'R'
                () -> assertEquals(expectedRoverPosition.getX(), calculatedRoverPosition.getX()),
                () -> assertEquals(expectedRoverPosition.getY(), calculatedRoverPosition.getY()),
                () -> assertEquals(expectedRoverPosition.getDirectionFacing(), calculatedRoverPosition.getDirectionFacing())
        );
    }

    // Multiple Instructions
    @Test
    @DisplayName("Should calculate new rover position correctly based on multi input.")
    void calculateDestinationMultiInstruction() {
        RoverControlUnit rcu = new RoverControlUnit(new Rover());
        RoverPosition currentRoverPosition = new RoverPosition(0,0, CompassDirection.N);
        RoverPosition expectedRoverPosition = new RoverPosition(3,1,CompassDirection.N);
        Queue<Instruction> testInstructions = new LinkedList<Instruction>(List.of(R,M,M,M,L,M));
        rcu.addToInstructionQueue(testInstructions);

        RoverPosition calculatedRoverPosition = rcu.calculateDestination();

        assertAll(
                // Multi 'R,M,M,M,L,M'
                () -> assertEquals(expectedRoverPosition.getX(), calculatedRoverPosition.getX()),
                () -> assertEquals(expectedRoverPosition.getY(), calculatedRoverPosition.getY()),
                () -> assertEquals(expectedRoverPosition.getDirectionFacing(), calculatedRoverPosition.getDirectionFacing())
        );
    }

    // Null
    @Test
    @DisplayName("Should return current position due to empty instruction queue.")
    void calculateDestinationNullInput() {
        RoverControlUnit rcu = new RoverControlUnit(new Rover());
        RoverPosition currentRoverPosition = new RoverPosition(0,0, CompassDirection.N);
        RoverPosition expectedRoverPosition = new RoverPosition(0,0,CompassDirection.N);

        RoverPosition calculatedRoverPosition = rcu.calculateDestination();

        assertAll(
                // Multi 'R,M,M,M,L,M'
                () -> assertEquals(expectedRoverPosition.getX(), calculatedRoverPosition.getX()),
                () -> assertEquals(expectedRoverPosition.getY(), calculatedRoverPosition.getY()),
                () -> assertEquals(expectedRoverPosition.getDirectionFacing(), calculatedRoverPosition.getDirectionFacing())
        );
    }

}