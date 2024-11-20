package Verification;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructionInputVerifierTest {

    // Valid input
    @Test
    @DisplayName("Should return true due to input M.")
    void verifyMove() {
        PlateauSizeInputVerifier plateauSizeVerifier = new PlateauSizeInputVerifier();
        String input = "M";

        assertTrue(plateauSizeVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return true due to input m.")
    void verifyMoveLower() {
        PlateauSizeInputVerifier plateauSizeVerifier = new PlateauSizeInputVerifier();
        String input = "m";

        assertTrue(plateauSizeVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return true due to input R.")
    void verifyRight() {
        PlateauSizeInputVerifier plateauSizeVerifier = new PlateauSizeInputVerifier();
        String input = "R";

        assertTrue(plateauSizeVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return true due to input r.")
    void verifyRightLower() {
        PlateauSizeInputVerifier plateauSizeVerifier = new PlateauSizeInputVerifier();
        String input = "r";

        assertTrue(plateauSizeVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return true due to input L.")
    void verifyLeft() {
        PlateauSizeInputVerifier plateauSizeVerifier = new PlateauSizeInputVerifier();
        String input = "L";

        assertTrue(plateauSizeVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return true due to input l.")
    void verifyLeftLower() {
        PlateauSizeInputVerifier plateauSizeVerifier = new PlateauSizeInputVerifier();
        String input = "l";

        assertTrue(plateauSizeVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return true due to input RLM.")
    void verifyMixed() {
        PlateauSizeInputVerifier plateauSizeVerifier = new PlateauSizeInputVerifier();
        String input = "RLM";

        assertTrue(plateauSizeVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return true due to input rlm.")
    void verifyMixedLower() {
        PlateauSizeInputVerifier plateauSizeVerifier = new PlateauSizeInputVerifier();
        String input = "rlm";

        assertTrue(plateauSizeVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return true due to input lmMRmLmr.")
    void verifyMixedDifferingCases() {
        PlateauSizeInputVerifier plateauSizeVerifier = new PlateauSizeInputVerifier();
        String input = "lmMRmLmr";

        assertTrue(plateauSizeVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return true due to blank input.")
    void verifyNoInput() {
        PlateauSizeInputVerifier plateauSizeVerifier = new PlateauSizeInputVerifier();
        String input = "";

        assertTrue(plateauSizeVerifier.verify(input));
    }

    // Invalid Input
    @Test
    @DisplayName("Should return false due to input !.?@.")
    void verifyCharacterInput() {
        PlateauSizeInputVerifier plateauSizeVerifier = new PlateauSizeInputVerifier();
        String input = "!.?@.";

        assertFalse(plateauSizeVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return false due to input xyhe65swb.")
    void verifyWrongCharacterInput() {
        PlateauSizeInputVerifier plateauSizeVerifier = new PlateauSizeInputVerifier();
        String input = "xyhe65swb";

        assertFalse(plateauSizeVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return false due to input LMM R M LMLM RM RM.")
    void verifyWhiteSpaceInput() {
        PlateauSizeInputVerifier plateauSizeVerifier = new PlateauSizeInputVerifier();
        String input = "LMM R M LMLM RM RM";

        assertFalse(plateauSizeVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return false due to null input")
    void verifyNullInput() {
        PlateauSizeInputVerifier plateauSizeVerifier = new PlateauSizeInputVerifier();
        String input = null;

        assertFalse(plateauSizeVerifier.verify(input));
    }




}