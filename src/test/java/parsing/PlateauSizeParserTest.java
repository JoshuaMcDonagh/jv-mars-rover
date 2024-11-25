package parsing;

import entities.environment.PlateauSize;
import input.parsing.PlateauSizeParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlateauSizeParserTest {

    @Test
    @DisplayName("Should convert input string into PlateauSize with correct X, Y values.")
    void parseNormalInput() {
        PlateauSizeParser parser = new PlateauSizeParser();
        PlateauSize result;
        String input = "5 5";
        int expectedX = 5;
        int expectedY = 5;

        result = parser.parse(input);

        assertEquals(expectedX, result.x());
        assertEquals(expectedY, result.y());
    }

    @Test
    @DisplayName("Should convert input string into PlateauSize with correct X, Y values.")
    void parseDifferingXAndYInput() {
        PlateauSizeParser parser = new PlateauSizeParser();
        PlateauSize result;
        String input = "3 6";
        int expectedX = 3;
        int expectedY = 6;

        result = parser.parse(input);

        assertEquals(expectedX, result.x());
        assertEquals(expectedY, result.y());
    }

    @Test
    @DisplayName("Should return PlateauSize of default size.")
    void parseNegativeInput() {
        PlateauSizeParser parser = new PlateauSizeParser();
        PlateauSize result;
        String input = "-5 -5";
        int expectedX = 5;
        int expectedY = 5;

        result = parser.parse(input);

        assertEquals(expectedX, result.x());
        assertEquals(expectedY, result.y());
    }

    @Test
    @DisplayName("Should return PlateauSize of default size.")
    void parseBothZeroAsInput() {
        PlateauSizeParser parser = new PlateauSizeParser();
        PlateauSize result;
        String input = "0 0";
        int expectedX = 5;
        int expectedY = 5;

        result = parser.parse(input);

        assertEquals(expectedX, result.x());
        assertEquals(expectedY, result.y());
    }

    @Test
    @DisplayName("Should return PlateauSize with X and Y both set to the single valid input.")
    void parseSingleZeroAsInput() {
        PlateauSizeParser parser = new PlateauSizeParser();
        PlateauSize result;
        String input = "0 7";
        int expectedX = 7;
        int expectedY = 7;

        result = parser.parse(input);

        assertEquals(expectedX, result.x());
        assertEquals(expectedY, result.y());
    }
}