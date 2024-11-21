package Verification;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    Generic verification method. To create further verifiers add
    assign required pattern to verificationPattern via constructor.
*/

public abstract class Verifier {
    protected Pattern verificationPattern;

    public boolean verify(String input) {
        if (input == null) {return false;} // Handles null input.

        Matcher matcher = verificationPattern.matcher(input);

        return matcher.find(); // True or False depending on match with regex.
    }
}
