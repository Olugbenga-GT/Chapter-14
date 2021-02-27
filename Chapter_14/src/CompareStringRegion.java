/*14.4 (Comparing Portions of Strings) Write an application that uses String method region-
Matches to compare two strings input by the user. The application should input the number of characters
to be compared and the starting index of the comparison. The application should state
whether the strings are equal. Ignore the case of the characters when performing the comparison.*/

import java.util.Scanner;
public class CompareStringRegion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please input your first string");
        String firstString = input.nextLine();

        System.out.println("Please input your second string");
        String secondString = input.nextLine();

        int compare = firstString.compareToIgnoreCase(secondString);

        System.out.printf("Your first string is: %s%n", firstString);
        System.out.printf("Your second string is: %s%n", secondString);
        System.out.printf("The difference between your string is: %d%n", compare);

        if(compare == 0){
            System.out.println("First string is equal to second string");
        }
        else if(compare > 0){
            System.out.println("first string is greater than second string");
        }
        else{
            System.out.println("first string is less than second string");
        }

        boolean doesRegionMatch = firstString.regionMatches(0, secondString,0, 10);
        System.out.printf("%s", doesRegionMatch);

       if (doesRegionMatch){
           System.out.println("Your region matches");
       }
       else {
           System.out.println("Your region does not match");
       }
    }
}
