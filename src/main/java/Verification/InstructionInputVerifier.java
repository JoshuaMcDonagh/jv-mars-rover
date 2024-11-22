package Verification;

import java.util.regex.Pattern;

public class InstructionInputVerifier extends Verifier {
    public InstructionInputVerifier() {
        this.verificationPattern = Pattern.compile("^[mrlMRL]*$"); // Checks only instructions are present
    }
}
