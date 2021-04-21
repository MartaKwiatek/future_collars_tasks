package org.Marta;

public interface VehicleWithEngine extends Vehicle {
    void startEngine();
    void stopEngine();
    boolean isEngineStarted();
    void setEngineStarted(boolean engineStarted);
}
