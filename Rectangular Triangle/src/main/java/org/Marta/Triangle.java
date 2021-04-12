package org.Marta;

import java.util.Arrays;

public class Triangle {
    public static boolean isRectangular(int[] sides) {
        Arrays.sort(sides);
        return sides[2] * sides[2] == sides[0] * sides[0] + sides[1] * sides[1];
    }
}
