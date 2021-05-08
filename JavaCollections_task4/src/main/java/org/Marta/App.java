package org.Marta;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>();
        persons.add(new Person("Janusz", "Kowalski", 1989, 180, 90.2));
        persons.add(new Person("Agnieszka", "Nowak", 1990, 163, 55.8));
        persons.add(new Person("Ewelina", "Blabla", 1985, 175, 63.6));
        persons.add(new Person("Antonio", "Facaldo", 2018, 92, 13.0));
        persons.add(new Person("Jaroslaw", "Kaczynski", 1918, 120, 115.69));

        System.out.println("Default sort (from youngest to oldest): ");
        for (Person person : persons) {
            System.out.println(person.toString());
        }

        Set<Person> persons2 = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getHeight(), o2.getHeight());
            }
        });
        persons2.addAll(persons);

        System.out.println("\n\nSort by height ascending: ");
        for (Person person : persons2) {
            System.out.println(person.toString());
        }

        Set<Person> persons3 = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Double.compare(o2.getWeight(), o1.getWeight());
            }
        });
        persons3.addAll(persons);
        System.out.println("\n\nSort by weight descending: ");
        for (Person person : persons3) {
            System.out.println(person.toString());
        }
    }
}
