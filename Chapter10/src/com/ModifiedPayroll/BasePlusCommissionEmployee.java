package com.ModifiedPayroll;

public class BasePlusCommissionEmployee extends CommissionedEmployee {
    private double baseSalary;


    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDay, Date hireDay, Date payDay, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, birthDay, hireDay, payDay);
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Base salary has to be greater than 0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary){
        if(baseSalary < 0){throw new IllegalArgumentException("Base salary has to be greater than 0"); }
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary() * getCommissionRate();
    }

    @Override
    public String toString() {
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    }
}

