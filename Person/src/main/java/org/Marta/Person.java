package org.Marta;

import java.util.Objects;

public class Person {
    private final String name;
    private final String surname;
    private final long pesel;

    public Person(String name, String surname, long pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getPesel() {
        return pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return pesel == person.pesel && name.equals(person.name) && surname.equals(person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, pesel);
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + pesel;
    }
}
