package parsing;

import datatypes.Instruction;

import java.util.LinkedList;
import java.util.Queue;

// NOTE: InstructionParser will only take String or null input.
//       Data validation should be handled with appropriate
//       verifier before data is passed in.
//
//       Verified string will return an instruction queue.

public class InstructionParser extends Parser <Queue<Instruction>> {

    @Override
    public Queue<Instruction> parse(String input) {
        Queue<Instruction> outputQueue = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'L':
                    outputQueue.add(Instruction.L);
                    break;
                case 'R':
                    outputQueue.add(Instruction.R);
                    break;
                case 'M':
                    outputQueue.add(Instruction.M);
                    break;
                default:
                    break;
            }
        }

        return outputQueue;
    }

}
