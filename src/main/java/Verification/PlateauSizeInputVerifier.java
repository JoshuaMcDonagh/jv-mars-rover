package Verification;

import java.util.regex.Pattern;

public class PlateauSizeInputVerifier extends Verifier {
    public PlateauSizeInputVerifier() {
        this.verificationPattern = Pattern.compile("^\\d+ \\d+$");
    }
}
