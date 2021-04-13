package org.Marta;

public class TicketSeller extends BaseEmployee {
    public TicketSeller(String name, String surname, int yearOfEmployment) {
        super(name, surname, yearOfEmployment);
    }

    public TicketSeller(String name, String surname, int yearOfEmployment, double salary) {
        super(name, surname, yearOfEmployment, salary);
    }

    public double calculateMonthlySalary() {
        return super.getBaseSalary();
    }
}
