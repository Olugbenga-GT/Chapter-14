public class BaseCommissionEmployeeTest {
    public static void main(String[] args) {

            BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Gbenga", "Alao-Simeons",
                "SCV5019", 509562.98,0.14, 500000);
        System.out.println("Obtain Gbenga's details by get Methods");

        System.out.printf("%n%s %n%s", "Employee's first name is: " , employee.getFirstName());
        System.out.printf("%n%s %n%s", "Employee's last name is: " , employee.getLastName());
        System.out.printf("%n%s %n%s", employee.getFirstName() +"'s  SSN is: " , employee.getSocialSecurityNumber());
        System.out.printf("%n%s %n%.2f", employee.getFirstName() +"'s gross sale for the month in review is: " , employee.getGrossSales());
        System.out.printf("%n%s %n%.2f", employee.getFirstName() +"'s commission rate is " , employee.getCommissionRate());

        employee.setGrossSales(5000);
        employee.setCommissionRate(.1);
        employee.setBaseSalary(650000);

        System.out.printf("%n%s:%n%n %s%n", "Updated employee information obtained by toString", employee.toString());

    }
}
