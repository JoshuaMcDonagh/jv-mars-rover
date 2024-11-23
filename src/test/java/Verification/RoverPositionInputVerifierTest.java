package Verification;

import input.Verification.RoverPositionInputVerifier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverPositionInputVerifierTest {

    // Valid Input
    @Test
    @DisplayName("Should return true due to valid 5 5 N input.")
    void verifyTwoDigitsNorth() {
        var roverPositionInputVerifier = new RoverPositionInputVerifier();
        String input = "5 5 N";

        assertTrue(roverPositionInputVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return true due to valid 5 5 n input.")
    void verifyTwoDigitsNorthLowerCase() {
        var roverPositionInputVerifier = new RoverPositionInputVerifier();
        String input = "5 5 n";

        assertTrue(roverPositionInputVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return true due to valid 5 5 E input.")
    void verifyTwoDigitsEast() {
        var roverPositionInputVerifier = new RoverPositionInputVerifier();
        String input = "5 5 E";

        assertTrue(roverPositionInputVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return true due to valid 5 5 e input.")
    void verifyTwoDigitsEastLowerCase() {
        var roverPositionInputVerifier = new RoverPositionInputVerifier();
        String input = "5 5 e";

        assertTrue(roverPositionInputVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return true due to valid 5 5 S input.")
    void verifyTwoDigitsSouth() {
        var roverPositionInputVerifier = new RoverPositionInputVerifier();
        String input = "5 5 S";

        assertTrue(roverPositionInputVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return true due to valid 5 5 s input.")
    void verifyTwoDigitsSouthLowerCase() {
        var roverPositionInputVerifier = new RoverPositionInputVerifier();
        String input = "5 5 s";

        assertTrue(roverPositionInputVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return true due to valid 5 5 W input.")
    void verifyTwoDigitsWest() {
        var roverPositionInputVerifier = new RoverPositionInputVerifier();
        String input = "5 5 W";

        assertTrue(roverPositionInputVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return true due to valid 5 5 w input.")
    void verifyTwoDigitsWestLowerCase() {
        var roverPositionInputVerifier = new RoverPositionInputVerifier();
        String input = "5 5 w";

        assertTrue(roverPositionInputVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return true due to valid 999 999 N input.")
    void verifyLargeNumbers() {
        var roverPositionInputVerifier = new RoverPositionInputVerifier();
        String input = "999 999 N";

        assertTrue(roverPositionInputVerifier.verify(input));
    }

    // Invalid Input
    @Test
    @DisplayName("Should return false due to  5 5 E N input.")
    void verifyTwoDigitsEastNorth() {
        var roverPositionInputVerifier = new RoverPositionInputVerifier();
        String input = "5 5 E N";

        assertFalse(roverPositionInputVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return false due to 5 5 @ input.")
    void verifyTwoDigitsCharacter() {
        var roverPositionInputVerifier = new RoverPositionInputVerifier();
        String input = "5 5 @";

        assertFalse(roverPositionInputVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return false due to 5 5 input.")
    void verifyTwoDigitsMissingDirection() {
        var roverPositionInputVerifier = new RoverPositionInputVerifier();
        String input = "5 5";

        assertFalse(roverPositionInputVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return false due to 55N input.")
    void verifyNoSpace() {
        var roverPositionInputVerifier = new RoverPositionInputVerifier();
        String input = "55N";

        assertFalse(roverPositionInputVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return false due to 55N input.")
    void verifyJoinedDigits() {
        var roverPositionInputVerifier = new RoverPositionInputVerifier();
        String input = "55 N";

        assertFalse(roverPositionInputVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return false due to 5 5N input.")
    void verifyDigitJoinedWithNorth() {
        var roverPositionInputVerifier = new RoverPositionInputVerifier();
        String input = "5 5N";

        assertFalse(roverPositionInputVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return false due to no input.")
    void verifyNoInput() {
        var roverPositionInputVerifier = new RoverPositionInputVerifier();
        String input = "";

        assertFalse(roverPositionInputVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return false due to null input.")
    void verifyNullInput() {
        var roverPositionInputVerifier = new RoverPositionInputVerifier();
        String input = null;

        assertFalse(roverPositionInputVerifier.verify(input));
    }
}