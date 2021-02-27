public class CommissionEmployee extends Object {

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private  double commissionRate;
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                              double grossSales, double commissionRate) {
        if(grossSales < 0.0){throw new IllegalArgumentException("Gross sales suppose pass 0 na!");}
        if(commissionRate <= 0.0 || commissionRate >= 1.0){throw  new IllegalArgumentException("The commission gas dey between 0 and 1 na, boss");}

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
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

    public  void setGrossSales(double grossSales){
        if(commissionRate <= 0.0 || commissionRate >= 1.0){throw  new IllegalArgumentException("The commission gas dey between 0 and 1 na, boss");}
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

    public  double earnings (){
        return  grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,"gross sales", grossSales,
                "commission rate", commissionRate);
    }
}