/*      5Bar Chart Printing Program: One interesting application of computers is to display
        graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
        number that’s read, your program should display the same number of adjacent asterisks. For example,
        if your program reads the number 7, it should display *******. Display the bars of asterisks after
        you read all five numbers. */

/*Pseudocode:
1. Collect and save Five numbers between 1 & 30;
2. Check if the numbers are valid;
3.
*  */

import java.util.Scanner;

public class Five_One_Six {
    public static void main(String[] args) {
        Scanner takeNumbers = new Scanner(System.in);

        System.out.println("Please Input your number:");
        int firstNumber =  takeNumbers.nextInt();
        System.out.println("Please Input your number:");
        int secondNumber =  takeNumbers.nextInt();
        System.out.println("Please Input your number:");
        int thirdNumber =  takeNumbers.nextInt();
        System.out.println("Please Input your number:");
        int fourthNumber =  takeNumbers.nextInt();
        System.out.println("Please Input your number:");
        int fifthNumber =  takeNumbers.nextInt();

        Five_One_Six chart = new Five_One_Six();
        chart.displayAsterisk(firstNumber);
        chart.displayAsterisk(secondNumber);
        chart.displayAsterisk(thirdNumber);
        chart.displayAsterisk(fourthNumber);
        chart.displayAsterisk(fifthNumber);
    }
    public void displayAsterisk(int numbers){
        int i;
        if(numbers >= 0 && numbers <=30){
            for(i = 1; i<= numbers; i++){
                System.out.print("*");
            }
            System.out.println();
        } else{
            System.out.println("You have entered an invalid number, please input a number from between 1 and 30.");
        }
    }
}
