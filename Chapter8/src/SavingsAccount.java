/*
* 8.6 (Savings Account Class) Create class SavingsAccount. Use a static variable annualInterestRate
to store the annual interest rate for all account holders. Each object of the class contains a
private instance variable savingsBalance indicating the amount the saver currently has on deposit.
Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying the
savingsBalance by annualInterestRate divided by 12—this interest should be added to savings-
Balance. Provide a static method modifyInterestRate that sets the annualInterestRate to a new
value. Write a program to test class SavingsAccount. Instantiate two savingsAccount objects,
saver1 and saver2, with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate
to 4%, then calculate the monthly interest for each of 12 months and print the new balances for
both savers. Next, set the annualInterestRate to 5%, calculate the next month’s interest and print
the new balances for both savers.*/

public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public void setBalance(double savingsBalance) {
        if(annualInterestRate < 0){
        throw new IllegalArgumentException("Your interest rate can't be negative");}
        this.savingsBalance = savingsBalance;

    }

    public double getSavingsBalance(){
        return Double.parseDouble(String.format("%.2f", savingsBalance));
    }

    public double calculateMonthlyInterest() {
        double monthlyInterest =  (savingsBalance * SavingsAccount.annualInterestRate/ 100 ) / 12;
        monthlyInterest = Double.parseDouble(String.format("%.2f", monthlyInterest));
        return monthlyInterest;
    }

    public double updateSavingsBalance() {
        savingsBalance = getSavingsBalance() + (getSavingsBalance() * SavingsAccount.annualInterestRate /100 ) / 12;
        savingsBalance = Double.parseDouble(String.format("%.2f", savingsBalance));

        return savingsBalance;
    }
}
