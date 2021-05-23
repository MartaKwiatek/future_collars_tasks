package org.Marta;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<CinemaHall> cinemaHalls = Arrays.asList(
                new CinemaHall("A", TypeOfCinemaHall.TWO_D),
                new CinemaHall("B", TypeOfCinemaHall.FOUR_D),
                new CinemaHall("C", TypeOfCinemaHall.THREE_D),
                new CinemaHall("D", TypeOfCinemaHall.TWO_D),
                new CinemaHall("E", TypeOfCinemaHall.THREE_D),
                new CinemaHall("F", TypeOfCinemaHall.TWO_D),
                new CinemaHall("G", TypeOfCinemaHall.THREE_D),
                new CinemaHall("H", TypeOfCinemaHall.TWO_D),
                new CinemaHall("I", TypeOfCinemaHall.FOUR_D),
                new CinemaHall("J", TypeOfCinemaHall.TWO_D)
        );

        Map<TypeOfCinemaHall, List<CinemaHall>> hallsPerType = cinemaHalls.stream()
                .collect(Collectors.groupingBy(CinemaHall::getTypeOfHall));

        long halls_2D = hallsPerType.get(TypeOfCinemaHall.TWO_D).size();
        System.out.println("Number of 2D halls: " + halls_2D);

        long halls_3D = hallsPerType.get(TypeOfCinemaHall.THREE_D).size();
        System.out.println("Number of 3D halls: " + halls_3D);

        long halls_4D = hallsPerType.get(TypeOfCinemaHall.FOUR_D).size();
        System.out.println("Number of 4D halls: " + halls_4D);
    }
}
