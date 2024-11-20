package Verification;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InstructionInputVerifier extends Verifier {

    @Override
    public boolean verify(String input) {
        if (input == null) {return false;} // Handles null input.

        Pattern numericDirectionPattern = Pattern.compile("^[mrlMRL]*$"); // Checks for mrlMRL use only without white space
        Matcher matcher = numericDirectionPattern.matcher(input);

        return matcher.find(); // True or False depending on match with regex.
    }
}
