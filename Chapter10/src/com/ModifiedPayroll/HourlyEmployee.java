package com.ModifiedPayroll;

public class HourlyEmployee extends ModifiedEmployee {
    private  double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDay, Date hireDay, Date payDay) {
        super(firstName, lastName, socialSecurityNumber, birthDay, hireDay, payDay);
        if(wage < 0.0){throw new IllegalArgumentException("My money must pass $0.0 0");}
        if(hours < 0.0 || hours > 168.0){throw new IllegalArgumentException("My money must pass $0.0 0");}
        this.wage = wage;
        this.hours= hours;

    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage < 0.0){throw new IllegalArgumentException("My money must pass $0.0 0");}
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if(hours < 0.0 || hours > 168.0)
        {throw new IllegalArgumentException("My money must pass $0.0 0");}
        this.hours = hours;
    }

    @Override
    public double earnings() {
        if(getHours() <= 40 ){
            return getHours() * getWage();
        }
        else{
            return 40 * getWage() + (getHours() - 40) * 1.5 ;
        }
    }

    @Override
    public String toString() {
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
                super.toString(), "hourly wage", getWage(),
                "hours worked", getHours());
    }
}
