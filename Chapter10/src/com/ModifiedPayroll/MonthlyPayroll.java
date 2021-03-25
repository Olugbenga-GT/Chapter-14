package com.ModifiedPayroll;

import Payroll_Management.BPCEmployee;

public class MonthlyPayroll {
    public static void main(String[] args) {

        CommissionedEmployee commissionedEmployee = new CommissionedEmployee
                ("Olawunmi", "Akinosho", "SCV006", new Date(1, 15, 1988), new Date(12, 1, 2018), new Date(1, 4, 2021));
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee
                ("Lanre", "Abayomi", "SCV0014", new Date(7, 11, 2000), new Date(3, 9, 2021), new Date(1, 4, 2021), 6000, 0.05, 90000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee
                ("Aisha", "Zubair", "SCV0045", new Date(6, 11, 1994), new Date(11, 3, 2020), new Date(6, 4, 2021));
        SalariedEmployee salariedEmployee = new SalariedEmployee
                ("Chibuzo", "Gabriel", "SCV419", new Date(4, 6, 1992), new Date(10, 22, 2019), new Date(4, 4, 2021));


        ModifiedEmployee[] employees = new ModifiedEmployee[4];
        employees[0] = commissionedEmployee;
        employees[1] = basePlusCommissionEmployee;
        employees[2] = hourlyEmployee;
        employees[3] = salariedEmployee;

        for (ModifiedEmployee employee : employees) {
            if (employee.getBirthDay().getMonth() == (employee.getPayDay().getMonth()) {
                BasePlusCommissionEmployee baseSalaryWorker = (BasePlusCommissionEmployee) employee;
                baseSalaryWorker.setBaseSalary( 100 + baseSalaryWorker.getBaseSalary());

                System.out.printf("We celebrate your birthday with you with a bonus of $%,.2f, Congrats!", baseSalaryWorker.getBaseSalary());
            }
            System.out.printf("earned $%,.2f%n %n", employee.earnings());
        }
    }
}


