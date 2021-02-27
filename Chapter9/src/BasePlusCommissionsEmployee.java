public class BasePlusCommissionsEmployee extends CommissionsEmployee {
    private double baseSalary;

    public BasePlusCommissionsEmployee(String firstName, String lastName, String socialSecurityNumber,
                                       double salesCommission, double grossSales, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, salesCommission, grossSales);
        if (baseSalary < 0.0) { throw new IllegalArgumentException("Base salary must be >= 0.0");}
        this.baseSalary  = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) { throw new IllegalArgumentException("Base salary must be >= 0.0"); }
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }
}
