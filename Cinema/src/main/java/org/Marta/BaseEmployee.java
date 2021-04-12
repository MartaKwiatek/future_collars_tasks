package org.Marta;

import java.util.Calendar;

public abstract class BaseEmployee {
    private String name;
    private String surname;
    private final int yearOfEmployment;
    private final double salary;
    protected final static double DEFAULT_SALARY = 3000.0;

    public BaseEmployee(String name, String surname, int yearOfEmployment) {
        this(name, surname, yearOfEmployment, DEFAULT_SALARY);
    }

    public BaseEmployee(String name, String surname, int yearOfEmployment, double salary) {
        this.name = name;
        this.surname = surname;
        this.yearOfEmployment = yearOfEmployment;
        this.salary = salary;
    }

    public double getBaseSalary() {
        return salary;
    }

    public int getYearsOfWork() {
        return Calendar.getInstance().get(Calendar.YEAR) - yearOfEmployment;
    }

    public abstract double calculateMonthlySalary();

    @Override
    public String toString() {
        return "BaseEmployee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", yearOfEmployment=" + yearOfEmployment +
                '}';
    }
}
