package org.Marta;

public class Car implements VehicleWithEngine {
    private boolean engineStarted;

    @Override
    public void startEngine() {
        if (!engineStarted) {
            engineStarted = true;
        }
    }

    @Override
    public void stopEngine() {
        if (engineStarted) {
            engineStarted = false;
        }
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }

    public void setEngineStarted(boolean engineStarted) {
        this.engineStarted = engineStarted;
    }

    @Override
    public void turnLeft() {
        System.out.println("Turn on the left turn signal");
    }

    @Override
    public void turnRight() {
        System.out.println("Turn on the right turn signal");
    }
}
