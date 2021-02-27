public class CommissionsEmployee extends Employee{
    private double salesCommission;
    private double grossSales;

    public CommissionsEmployee(String firstName, String lastName, String socialSecurityNumber, double salesCommission, double grossSales) {
        super(firstName, lastName, socialSecurityNumber);

        if(grossSales < 0){
            throw new IllegalArgumentException("Gross sales has to be greater than 1");
        }

        if(salesCommission <= 0 || salesCommission >= 1){
            throw  new IllegalArgumentException("Commission must be between and 1 and 0");
        }

        this.grossSales = grossSales;
        this.salesCommission = salesCommission;
    }

    public double getSalesCommission() {
        return salesCommission;
    }

    public void setSalesCommission(double salesCommission) {
        if(salesCommission <= 0 || salesCommission >= 1){throw  new IllegalArgumentException("Commission must be between and 1 and 0");}
        this.salesCommission = salesCommission;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales < 0){throw new IllegalArgumentException("Gross sales has to be greater than 1");}
        this.grossSales = grossSales;
    }

    public double earnings(){
        return salesCommission * grossSales;
    }


    @Override
    public String toString() {
         return String.format("Dear %s %s %n %s%n %s%n",  "Welcome to Damal Corporations.", "Tour Reg number is %s%n", "your gross sales is %.2f at %.2f",
                super.getFirstName(), super.getLastName(), super.getSocialSecurityNumber(), grossSales, salesCommission );
    }

}
