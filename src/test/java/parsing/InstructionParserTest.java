package parsing;

import datatypes.Instruction;
import input.parsing.InstructionParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class InstructionParserTest {

    @Test
    @DisplayName("Should convert input string into queue containing only Instruction L.")
    void parseSingleLeftInput() {
        InstructionParser parser = new InstructionParser();
        Queue<Instruction> result;
        String input = "L";
        Queue<Instruction> expectedResult = new LinkedList<>();
        expectedResult.add(Instruction.L);

        result = parser.parse(input);

        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Should convert input string into queue containing only Instruction R.")
    void parseSingleRightInput() {
        InstructionParser parser = new InstructionParser();
        Queue<Instruction> result;
        String input = "R";
        Queue<Instruction> expectedResult = new LinkedList<>();
        expectedResult.add(Instruction.R);

        result = parser.parse(input);

        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Should convert input string into queue containing only Instruction M.")
    void parseSingleMoveInput() {
        InstructionParser parser = new InstructionParser();
        Queue<Instruction> result;
        String input = "M";
        Queue<Instruction> expectedResult = new LinkedList<>();
        expectedResult.add(Instruction.M);

        result = parser.parse(input);

        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Should convert input string into queue containing ten Instruction L.")
    void parseMultiLeftInput() {
        InstructionParser parser = new InstructionParser();
        Queue<Instruction> result;
        String input = "LLLLLLLLLL";
        Queue<Instruction> expectedResult = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            expectedResult.add(Instruction.L);
        }

        result = parser.parse(input);

        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Should convert input string into queue containing ten Instruction R.")
    void parseMultiRightInput() {
        InstructionParser parser = new InstructionParser();
        Queue<Instruction> result;
        String input = "RRRRRRRRRR";
        Queue<Instruction> expectedResult = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            expectedResult.add(Instruction.R);
        }

        result = parser.parse(input);

        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Should convert input string into queue containing ten Instruction M.")
    void parseMultiMoveInput() {
        InstructionParser parser = new InstructionParser();
        Queue<Instruction> result;
        String input = "MMMMMMMMMM";
        Queue<Instruction> expectedResult = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            expectedResult.add(Instruction.M);
        }

        result = parser.parse(input);

        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Should convert input string into queue containing instruction in order LRMLRM.")
    void parseMixedInput() {
        InstructionParser parser = new InstructionParser();
        Queue<Instruction> result;
        String input = "LRMLRM";
        Queue<Instruction> expectedResult = new LinkedList<>();
        for (int i = 0; i < 2; i++) {
            expectedResult.add(Instruction.L);
            expectedResult.add(Instruction.R);
            expectedResult.add(Instruction.M);
        }

        result = parser.parse(input);

        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Should return empty queue due to Null input.")
    void parseNullInput() {
        InstructionParser parser = new InstructionParser();
        Queue<Instruction> result;
        String input = null;
        Queue<Instruction> expectedResult = new LinkedList<>(); // Expected empty queue

        result = parser.parse(input);

        assertEquals(expectedResult, result);
    }

}