package org.Marta;

public class App {
    public static void main( String[] args ) {
        Person person1 = new Person("Marta", "Kwiatek", 89100300000L);
        Person person2 = new Person("Marta", "Kwiatek", 90032800000L);
        Person person3 = new Person("Marta", "Kwiatek", 89100300000L);

        System.out.println(person1 + " == " + person2 + " " + person1.equals(person2));
        System.out.println(person2 + " == " + person3 + " " + person2.equals(person3));
        System.out.println(person1 + " == " + person3 + " " + person1.equals(person3));

    }
}
