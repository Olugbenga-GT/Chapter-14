import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionWithZero {
    public static  int quotient (int numerator, int denominator)
        throws ArithmeticException{
        return  numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        do{
            try{
                System.out.println("Please,enter an integer numerator");
                int numerator = scanner.nextInt();
                System.out.println("Please, enter an integer denominator");
                int denominator = scanner.nextInt();

                int result = quotient(numerator , denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator , result);
                continueLoop = false;
            }
            catch (InputMismatchException error){
                System.err.printf("%nException: %s%n", error);
                scanner.nextLine();
                System.out.printf("You must enter integers, Please try again. %n%n");
            }
            catch(ArithmeticException error){
                System.out.printf("%nException: %s%n", error);
                System.out.printf("%n zero is an invalid denominator, please try again%n ");
            }
        }while (continueLoop);
    }
}
