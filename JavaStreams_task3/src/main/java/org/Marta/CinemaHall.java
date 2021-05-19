package org.Marta;

public class CinemaHall {
    private String name;
    private TypeOfCinemaHall typeOfHall;

    public CinemaHall(String name, TypeOfCinemaHall typeOfHall) {
        this.name = name;
        this.typeOfHall = typeOfHall;
    }

    public String getName() {
        return name;
    }

    public TypeOfCinemaHall getTypeOfHall() {
        return typeOfHall;
    }
}
