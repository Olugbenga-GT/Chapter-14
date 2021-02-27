import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    Employee employee ;
    CommissionsEmployee ce ;
    BasePlusCommissionsEmployee bce;
    @BeforeEach
    void setUp() {
        employee = new Employee("Me", " Ma", "mi6");
        ce = new CommissionsEmployee("yi", "ya", "0h23", 0.25,450.23);
        bce = new BasePlusCommissionsEmployee("Ying", "Yeng", "14rva", .57, 780, 59000);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatEmployeeVariablesCanBeCreated(){
        employee.setFirstName("Malik");
        assertEquals("Malik", employee.getFirstName());

        employee.setLastName("Odin");
        assertEquals("Odin", employee.getLastName());

        employee.setSocialSecurityNumber("SCV006");
        assertEquals("SCV006", employee.getSocialSecurityNumber());
    }

    @Test
    void testThatWelcomeMessageCanBeGenerated(){
        employee.setFirstName("Adegoroye");
        employee.setLastName("Olatoni");
        employee.setFirstName("SCV1057");
        String welcome =  String.format("Dear %s %s %n %s%n %s%n",  "Welcome to Damal Corporations.", "Tour Reg number is %s",
                employee.getFirstName(), employee.getLastName(), employee.getSocialSecurityNumber());
        assertEquals(welcome, employee.toString());
    }

    @Test
    void testThatSubClassCanBeCreated(){
        ce.setGrossSales(10.67);
        assertEquals(10.67, ce.getGrossSales());
    }

    @Test
    void testToCalculateEarnings(){
        ce.setGrossSales(1000.0);
        ce.setSalesCommission(0.1);
        assertEquals(100, ce.earnings());
    }

    @Test
    void testToCalculateBasePlusCommissionsEarnings(){
        bce.setGrossSales(1000.0);
        bce.setSalesCommission(0.1);
        bce.setBaseSalary(10000);
        assertEquals(10100, bce.earnings());
    }


}