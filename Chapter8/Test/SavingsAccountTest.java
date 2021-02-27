import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void testToCalculateMonthlyInterest() {
        SavingsAccount saver1 = new SavingsAccount();
        saver1.setBalance(3500.00);
        SavingsAccount.setAnnualInterestRate(4.0);
        assertEquals(11.67, saver1.calculateMonthlyInterest());

        saver1.setBalance(20000.00);
        SavingsAccount.setAnnualInterestRate(4.0);
        assertEquals(66.67, saver1.calculateMonthlyInterest());
    }

//
    @Test
    void testToAddMonthlyInterestToBalance(){
        SavingsAccount saver1 = new SavingsAccount();
        saver1.setBalance(3500.00);
        SavingsAccount.setAnnualInterestRate(4.0);
        assertEquals(3511.67, saver1.updateSavingsBalance());
    }
}