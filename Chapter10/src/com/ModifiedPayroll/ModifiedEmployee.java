package com.ModifiedPayroll;
/* (Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9 to include private
instance variable birthDate in class Employee. Use class Date of Fig. 8.7 to represent an employee’s
birthday. Add get methods to class Date. Assume that payroll is processed once per month.
Create an array of Employee variables to store references to the various employee objects. In a loop,
calculate the payroll for each Employee (polymorphically), and add a $100.00 bonus to the person’s
payroll amount if the current month is the one in which the Employee’s birthday occurs.*/

public abstract class ModifiedEmployee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private Date birthDay;
    private Date hireDay;
    private Date payDay;

    public ModifiedEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDay, Date hireDay, Date payDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDay = birthDay;
        this.hireDay = hireDay;

    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public  Date getHireDay(){
        return  hireDay;
    }

    public Date getPayDay() {
        return payDay;
    }

    public  abstract double earnings();

    @Override
    public String toString() {
        return String.format("Dear %s %s%nYour social security number is: %s%nYour hire date is %s ... and your %n birthday is %s",
                            getFirstName() , getLastName(), getSocialSecurityNumber(), getHireDay(), getBirthDay());
    }

}
