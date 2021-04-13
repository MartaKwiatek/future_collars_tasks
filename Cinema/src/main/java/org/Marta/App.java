package org.Marta;

public class App 
{
    public static void main( String[] args )
    {
        Director director = new Director("Marta", "Kwiatek");
        Movie movie = new Movie("Titanic", director, 120, 1999);
        System.out.println(movie);
    }
}
