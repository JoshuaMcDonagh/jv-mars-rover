package parsing;

import datatypes.CompassDirection;
import datatypes.RoverPosition;
import input.parsing.RoverPositionParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverPositionParserTest {

    @Test
    @DisplayName("Should convert input string into RoverPosition with correct X, Y values.")
    void parseNormalInput() {
        RoverPositionParser parser = new RoverPositionParser();
        RoverPosition result;
        String input = "5 5 N";
        int expectedX = 5;
        int expectedY = 5;
        CompassDirection expectedDirection = CompassDirection.N;

        result = parser.parse(input);

        assertEquals(expectedX, result.getX());
        assertEquals(expectedY, result.getY());
        assertEquals(expectedDirection, result.getDirectionFacing());
    }

    @Test
    @DisplayName("Should convert input string into RoverPosition with correct X, Y values.")
    void parseDifferingXAndYInput() {
        RoverPositionParser parser = new RoverPositionParser();
        RoverPosition result;
        String input = "3 4 N";
        int expectedX = 3;
        int expectedY = 4;
        CompassDirection expectedDirection = CompassDirection.N;

        result = parser.parse(input);

        assertEquals(expectedX, result.getX());
        assertEquals(expectedY, result.getY());
        assertEquals(expectedDirection, result.getDirectionFacing());
    }

    @Test
    @DisplayName("Should return RoverPosition of default size.")
    void parseNegativeInput() {
        RoverPositionParser parser = new RoverPositionParser();
        RoverPosition result;
        String input = "-5 -5 N";
        int expectedX = 0;
        int expectedY = 0;
        CompassDirection expectedDirection = CompassDirection.N;

        result = parser.parse(input);

        assertEquals(expectedX, result.getX());
        assertEquals(expectedY, result.getY());
        assertEquals(expectedDirection, result.getDirectionFacing());
    }

    @Test
    @DisplayName("Should return RoverPosition of default size.")
    void parseBothZeroAsInput() {
        RoverPositionParser parser = new RoverPositionParser();
        RoverPosition result;
        String input = "0 0 N";
        int expectedX = 0;
        int expectedY = 0;
        CompassDirection expectedDirection = CompassDirection.N;

        result = parser.parse(input);

        assertEquals(expectedX, result.getX());
        assertEquals(expectedY, result.getY());
        assertEquals(expectedDirection, result.getDirectionFacing());
    }

    @Test
    @DisplayName("Should return RoverPosition with X and Y both set to the single valid input.")
    void parseSingleNegativeAsInput() {
        RoverPositionParser parser = new RoverPositionParser();
        RoverPosition result;
        String input = "-1 7 N";
        int expectedX = 7;
        int expectedY = 7;
        CompassDirection expectedDirection = CompassDirection.N;

        result = parser.parse(input);

        assertEquals(expectedX, result.getX());
        assertEquals(expectedY, result.getY());
        assertEquals(expectedDirection, result.getDirectionFacing());
    }

    @Test
    @DisplayName("Should return RoverPosition with direction set North")
    void parseNorthInput() {
        RoverPositionParser parser = new RoverPositionParser();
        RoverPosition result;
        String input = "1 1 N";
        int expectedX = 1;
        int expectedY = 1;
        CompassDirection expectedDirection = CompassDirection.N;

        result = parser.parse(input);

        assertEquals(expectedX, result.getX());
        assertEquals(expectedY, result.getY());
        assertEquals(expectedDirection, result.getDirectionFacing());
    }

    @Test
    @DisplayName("Should return RoverPosition with direction set East.")
    void parseEastInput() {
        RoverPositionParser parser = new RoverPositionParser();
        RoverPosition result;
        String input = "1 1 E";
        int expectedX = 1;
        int expectedY = 1;
        CompassDirection expectedDirection = CompassDirection.E;

        result = parser.parse(input);

        assertEquals(expectedX, result.getX());
        assertEquals(expectedY, result.getY());
        assertEquals(expectedDirection, result.getDirectionFacing());
    }

    @Test
    @DisplayName("Should return RoverPosition with direction set South")
    void parseSouthInput() {
        RoverPositionParser parser = new RoverPositionParser();
        RoverPosition result;
        String input = "1 1 S";
        int expectedX = 1;
        int expectedY = 1;
        CompassDirection expectedDirection = CompassDirection.S;

        result = parser.parse(input);

        assertEquals(expectedX, result.getX());
        assertEquals(expectedY, result.getY());
        assertEquals(expectedDirection, result.getDirectionFacing());
    }

    @Test
    @DisplayName("Should return RoverPosition with direction set West")
    void parseWestInput() {
        RoverPositionParser parser = new RoverPositionParser();
        RoverPosition result;
        String input = "1 1 W";
        int expectedX = 1;
        int expectedY = 1;
        CompassDirection expectedDirection = CompassDirection.W;

        result = parser.parse(input);

        assertEquals(expectedX, result.getX());
        assertEquals(expectedY, result.getY());
        assertEquals(expectedDirection, result.getDirectionFacing());
    }
}