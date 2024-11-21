package Verification;

import java.util.regex.Pattern;

public class RoverPositionInputVerifier extends Verifier {
    public RoverPositionInputVerifier() {
        this.verificationPattern = Pattern.compile("^\\d+ \\d+ [neswNESW]$");
    }
}
