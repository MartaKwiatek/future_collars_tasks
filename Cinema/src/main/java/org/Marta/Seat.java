package org.Marta;

public class Seat {
    private final int number;
    private final int row;
    private boolean isAvailable;

    public Seat(int number, int row, boolean isAvailable) {
        this.number = number;
        this.row = row;
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "number=" + number +
                ", row=" + row +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
