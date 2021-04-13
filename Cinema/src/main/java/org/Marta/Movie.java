package org.Marta;

public class Movie {
    private final String title;
    private final Director director;
    private final int durationInMinutes;
    private final int yearOfProduction;

    public Movie(String title, Director director, int durationInMinutes, int yearOfProduction) {
        this.title = title;
        this.director = director;
        this.durationInMinutes = durationInMinutes;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director=" + director +
                ", durationInMinutes=" + durationInMinutes +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
