package entities.environment;

import java.util.Objects;

public record PlateauSize(int x, int y) {
    public static final int DEFAULT_X = 5;
    public static final int DEFAULT_Y = 5;
}
