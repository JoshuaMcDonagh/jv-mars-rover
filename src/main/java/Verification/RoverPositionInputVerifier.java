package Verification;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RoverPositionInputVerifier extends Verifier {

    @Override
    public boolean verify(String input) {
        if (input == null) {return false;} // Handles null input.

        Pattern numericDirectionPattern = Pattern.compile("^\\d+ \\d+ [neswNESW]$"); // Checks for numberSPACEnumberSPACEdirection
        Matcher matcher = numericDirectionPattern.matcher(input);

        return matcher.find(); // True or False depending on match with regex.
    }
}
