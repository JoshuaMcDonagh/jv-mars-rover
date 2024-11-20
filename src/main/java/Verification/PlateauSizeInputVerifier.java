package Verification;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlateauSizeInputVerifier extends Verifier {

    @Override
    public boolean verify(String input) {
        if (input == null) {return false;} // Handles null input.

        Pattern numericPattern = Pattern.compile("^\\d+ \\d+$"); // Checks for numberSPACEnumber
        Matcher matcher = numericPattern.matcher(input);

        return matcher.find(); // True or False depending on regex.
    }
}
