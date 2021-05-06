package org.Marta;

public class TrainingEvaluator {
    private Training training;
    private static final double LENGTH_WEIGHT = 1.0;
    private static final double KCAL_WEIGHT = 2.0;
    private static final double PULSE_WEIGHT = 3.0;

    public TrainingEvaluator(Training training) {
        this.training = training;
    }

    public int rateForLength() {
        if (training == null || training.getLengthInMinutes() <= 0 || training.getLengthInMinutes() > 720) {
            throw new IllegalLength("The length of training should be in the range of 1 - 720 minutes");
        } else if (training.getLengthInMinutes() < 30) {
            return 1;
        } else if (training.getLengthInMinutes() <= 60) {
            return 2;
        } else {
            return 3;
        }
    }

    public int rateForKCal() {
        if (training == null || training.getkCalBurned() <= 0 || training.getkCalBurned() > 3000) {
            throw new IllegalKCal("calories burned should be in the range of 1 - 3000");
        }
        else if (training.getkCalBurned() <= 300) {
            return 1;
        }
        else if (training.getkCalBurned() < 400) {
            return 2;
        }
        else {
            return 3;
        }
    }

    public int rateForPulse() {
        if (training == null || training.getAvgPulse() < 30 || training.getAvgPulse() > 250) {
            throw new IllegalPulse("Hmmm, so you are dead xD");
        }
        else if (training.getAvgPulse() < 160) {
            return 3;
        }
        else if (training.getAvgPulse() <= 175) {
            return 2;
        }
        else {
            return 1;
        }
    }

    public TrainingEfficiency evaluateTraining() {
        double weightedAvg = rateForLength() * LENGTH_WEIGHT + rateForKCal() * KCAL_WEIGHT + rateForPulse() * PULSE_WEIGHT;
        return weightedAvg < 1.2 ? TrainingEfficiency.LOW : (weightedAvg < 2) ? TrainingEfficiency.MEDIUM :
                (weightedAvg < 3) ? TrainingEfficiency.HIGH : TrainingEfficiency.PERFECT;
    }
}
