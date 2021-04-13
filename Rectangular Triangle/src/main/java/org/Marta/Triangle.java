package org.Marta;

import java.util.Arrays;

public class Triangle {
    public static boolean isRectangular(int sideA, int sideB, int sideC) {
        int[] sides = new int[] {sideA, sideB, sideC};
        Arrays.sort(sides);
        return sides[2] * sides[2] == sides[0] * sides[0] + sides[1] * sides[1];
    }
}
