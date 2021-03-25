package com.ModifiedPayroll;

public class CommissionedEmployee extends ModifiedEmployee {
    private double grossSales;
    private  double commissionRate;

    public CommissionedEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDay, Date hireDay, Date payDay) {
        super(firstName, lastName, socialSecurityNumber, birthDay, hireDay, payDay);
        if(grossSales < 0){throw  new IllegalArgumentException("Your gross sales has to eb greater than 0");}
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public  void setGrossSales(double grossSales){
        if(grossSales < 0){throw  new IllegalArgumentException("Your gross sales has to eb greater than 0");}
        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");}
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public  double earnings (){
        return  getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
                "commission employee", super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }
}
