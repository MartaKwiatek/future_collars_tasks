package org.Marta;

public class Manager extends BaseEmployee {

    private double bonus;
    private final static double DEFAULT_SALARY = 5000.0;
    private final static double DEFAULT_BONUS = 500.0;

    public Manager(String name, String surname, int yearOfEmployment) {
        this(name, surname, yearOfEmployment, DEFAULT_SALARY, DEFAULT_BONUS);
    }

    public Manager (String name, String surname, int yearOfEmployment, double salary) {
        this(name, surname, yearOfEmployment, salary, DEFAULT_BONUS);
    }

    public Manager (String name, String surname, double bonus, int yearOfEmployment) {
        this(name, surname, yearOfEmployment, DEFAULT_SALARY, bonus);
    }

    public Manager(String name, String surname, int yearOfEmployment, double salary, double bonus) {
        super(name, surname, yearOfEmployment, salary);
        this.bonus = bonus;
    }

    public double calculateMonthlySalary() {
        return super.getBaseSalary() + this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
