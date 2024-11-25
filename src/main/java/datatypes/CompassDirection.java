package datatypes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public enum CompassDirection {
    N, // North
    E, // East
    S, // South
    W;  // West

    public static List<CompassDirection> toArray() {
        return Arrays.asList(CompassDirection.values());
    }
}
