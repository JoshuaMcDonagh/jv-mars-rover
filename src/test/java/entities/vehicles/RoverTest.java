package entities.vehicles;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {

    // RoverID Testing
    @Test
    @DisplayName("Should return correctly generated roverID.")
    void roverIDOneInstance() {
        Rover rover = new Rover();
        String expected = "RV1";

        assertEquals(expected, rover.getEntityID());
    }

    @Test
    @DisplayName("Should return correctly generated roverID, incrementing by one with each new instance.")
    void roverIDMultiInstance() {
        Rover[] rovers = {new Rover(), new Rover(), new Rover(), new Rover(), new Rover()};
        String[] expected = {"RV1", "RV2", "RV3", "RV4", "RV5"};

        for(int i = 0; i < rovers.length; i++) {
            assertEquals(expected[i], rovers[i].getEntityID());
        }
    }

    //
}