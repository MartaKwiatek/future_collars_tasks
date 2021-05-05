package org.Marta;

public class Training {
    private int lengthInMinutes;
    private int kCalBurned;
    private int avgPulse;

    public Training(int lengthInMinutes, int kCalBurned, int avgHeartRate) {
        this.lengthInMinutes = lengthInMinutes;
        this.kCalBurned = kCalBurned;
        this.avgPulse = avgHeartRate;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public int getkCalBurned() {
        return kCalBurned;
    }

    public int getAvgPulse() {
        return avgPulse;
    }
}
