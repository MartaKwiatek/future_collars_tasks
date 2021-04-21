package org.Marta;

public class Bicycle implements Vehicle {

    @Override
    public void turnLeft() {
        System.out.println("stick out your left arm and point left");
    }

    @Override
    public void turnRight() {
        System.out.println("stick out your right arm and point right");
    }
}
