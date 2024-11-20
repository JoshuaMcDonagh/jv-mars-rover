package Verification;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlateauSizeInputVerifierTest {

    // Valid input
    @Test
    @DisplayName("Should return true due to correct input.")
    void verifyInputTwoSingleDigits() {
        PlateauSizeInputVerifier plateauSizeVerifier = new PlateauSizeInputVerifier();
        String input = "5 5";
        boolean result;

        result = plateauSizeVerifier.verify(input);

        assertTrue(result);
    }

    @Test
    @DisplayName("Should return true due to correct input.")
    void verifyInputTwoMultiDigit() {
        PlateauSizeInputVerifier plateauSizeVerifier = new PlateauSizeInputVerifier();
        String input = "27 15";
        boolean result;

        result = plateauSizeVerifier.verify(input);

        assertTrue(result);
    }

    @Test
    @DisplayName("Should return true due to correct input.")
    void verifyInputLargeNumbers() {
        PlateauSizeInputVerifier plateauSizeVerifier = new PlateauSizeInputVerifier();
        String input = "999999999999 9999999999999";
        boolean result;

        result = plateauSizeVerifier.verify(input);

        assertTrue(result);
    }

    // Invalid input
    @Test
    @DisplayName("Should return false due to missing digit.")
    void verifyMissingDigit() {
        PlateauSizeInputVerifier plateauSizeVerifier = new PlateauSizeInputVerifier();
        String input = "2";
        boolean result;

        result = plateauSizeVerifier.verify(input);

        assertFalse(result);
    }

    @Test
    @DisplayName("Should return false due to non digit.")
    void verifyInputNonDigit() {
        PlateauSizeInputVerifier plateauSizeVerifier = new PlateauSizeInputVerifier();
        String input = "d v";
        boolean result;

        result = plateauSizeVerifier.verify(input);

        assertFalse(result);
    }

    @Test
    @DisplayName("Should return false due to mixed non digit.")
    void verifyInputMixedNonDigit() {
        PlateauSizeInputVerifier plateauSizeVerifier = new PlateauSizeInputVerifier();
        String input = "fdsd 5 5 vfds";
        boolean result;

        result = plateauSizeVerifier.verify(input);

        assertFalse(result);
    }

    @Test
    @DisplayName("Should return false due to use of punctuation.")
    void verifyInputPunctuation() {
        PlateauSizeInputVerifier plateauSizeVerifier = new PlateauSizeInputVerifier();
        String input = "! ?";
        boolean result;

        result = plateauSizeVerifier.verify(input);

        assertFalse(result);
    }

    @Test
    @DisplayName("Should return false due to no whitespace to separate numbers.")
    void verifyInputNoWhitespace() {
        PlateauSizeInputVerifier plateauSizeVerifier = new PlateauSizeInputVerifier();
        String input = "55";
        boolean result;

        result = plateauSizeVerifier.verify(input);

        assertFalse(result);
    }

    @Test
    @DisplayName("Should return false due to no whitespace to separate numbers.")
    void verifyInputPunctuationInsteadOfWhitespace() {
        PlateauSizeInputVerifier plateauSizeVerifier = new PlateauSizeInputVerifier();
        String input = "5-5";
        boolean result;

        result = plateauSizeVerifier.verify(input);

        assertFalse(result);
    }

    @Test
    @DisplayName("Should return false due to empty input.")
    void verifyEmptyInput() {
        PlateauSizeInputVerifier plateauSizeVerifier = new PlateauSizeInputVerifier();
        String input = "";
        boolean result;

        result = plateauSizeVerifier.verify(input);

        assertFalse(result);
    }

    @Test
    @DisplayName("Should return false due to null input.")
    void verifyNullInput() {
        PlateauSizeInputVerifier plateauSizeVerifier = new PlateauSizeInputVerifier();
        String input = null;
        boolean result;

        result = plateauSizeVerifier.verify(input);

        assertFalse(result);
    }
}