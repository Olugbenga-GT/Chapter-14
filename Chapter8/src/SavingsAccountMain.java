import java.util.Scanner;

public class SavingsAccountMain {
    public static void main(String[] args) {
        int counter = 1;
        SavingsAccount joel = new SavingsAccount();
        SavingsAccount imran = new SavingsAccount();
        SavingsAccount.setAnnualInterestRate(4);


        Scanner input = new Scanner(System.in);
        System.out.println("Joel, enter your current balance");
        double joeBalance = input.nextDouble();
        joel.setBalance(joeBalance);

        System.out.println("imran, enter your current balance");
        double imranBalance = input.nextDouble();
        imran.setBalance(imranBalance);
        System.out.printf("Joel and imran, your current balance is $%f and $%f respectively%n." +
                           "Your balance for the next 12 months %n at a rate of %f percent will be: %n ",
                           joel.getSavingsBalance(), imran.getSavingsBalance(), SavingsAccount.getAnnualInterestRate());


        System.out.printf("%5s %17s  %20s %n", "Month" , "Joe's balance", "Imran's balance");
        for(counter = 0; counter <= 13; counter++){
            if(counter > 12){SavingsAccount.setAnnualInterestRate(5);}
            System.out.printf("%5d %17f %20f %n", counter, joel.getSavingsBalance(), imran.getSavingsBalance());

            joel.updateSavingsBalance();
            imran.updateSavingsBalance();
        }

    }
}
