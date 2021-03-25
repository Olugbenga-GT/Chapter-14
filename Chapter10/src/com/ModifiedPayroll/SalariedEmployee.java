package com.ModifiedPayroll;

public class SalariedEmployee extends ModifiedEmployee{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDay, Date hireDay, Date payDay) {
        super(firstName, lastName, socialSecurityNumber, birthDay, hireDay, payDay);
        if(weeklySalary < 0.0){throw new IllegalArgumentException("This money too small");}
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary < 0.0){throw new IllegalArgumentException("This money too small");}
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return  String.format("salaried employee: %s%n%s: $%,.2f",
                super.toString(), weeklySalary, getWeeklySalary());
    }
}
