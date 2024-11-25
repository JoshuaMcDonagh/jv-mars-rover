package Verification;

import input.Verification.InstructionInputVerifier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructionInputVerifierTest {

    private InstructionInputVerifier instructionInputVerifier = new InstructionInputVerifier();

    // Valid input
    @Test
    @DisplayName("Should return true due to input M.")
    void verifyMove() {
        String input = "M";

        assertTrue(instructionInputVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return true due to input m.")
    void verifyMoveLower() {
        String input = "m";

        assertTrue(instructionInputVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return true due to input R.")
    void verifyRight() {
        String input = "R";

        assertTrue(instructionInputVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return true due to input r.")
    void verifyRightLower() {
        String input = "r";

        assertTrue(instructionInputVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return true due to input L.")
    void verifyLeft() {
        String input = "L";

        assertTrue(instructionInputVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return true due to input l.")
    void verifyLeftLower() {
        String input = "l";

        assertTrue(instructionInputVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return true due to input RLM.")
    void verifyMixed() {
        String input = "RLM";

        assertTrue(instructionInputVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return true due to input rlm.")
    void verifyMixedLower() {
        String input = "rlm";

        assertTrue(instructionInputVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return true due to input lmMRmLmr.")
    void verifyMixedDifferingCases() {
        String input = "lmMRmLmr";

        assertTrue(instructionInputVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return true due to blank input.")
    void verifyNoInput() {
        String input = "";

        assertTrue(instructionInputVerifier.verify(input));
    }

    // Invalid Input
    @Test
    @DisplayName("Should return false due to input !.?@.")
    void verifyCharacterInput() {
        String input = "!.?@.";

        assertFalse(instructionInputVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return false due to input xyhe65swb.")
    void verifyWrongCharacterInput() {
        String input = "xyhe65swb";

        assertFalse(instructionInputVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return false due to input LMM R M LMLM RM RM.")
    void verifyWhiteSpaceInput() {
        String input = "LMM R M LMLM RM RM";

        assertFalse(instructionInputVerifier.verify(input));
    }

    @Test
    @DisplayName("Should return false due to null input")
    void verifyNullInput() {
        String input = null;

        assertFalse(instructionInputVerifier.verify(input));
    }
}