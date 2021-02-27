import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please input your first string");
        String firstString = input.nextLine();

        System.out.println("Please input your second string");
        String secondString = input.nextLine();

        int compare = firstString.compareTo(secondString);

        System.out.printf("Your first string is: %s%n", firstString);
        System.out.printf("Your second string is: %s%n", secondString);
        System.out.printf("The difference between your string is: %d", compare);

        if(compare == 0){
            System.out.println("First string is equal to second string");
        }
        else if(compare > 0){
            System.out.println("first string is greater than second string");
        }
        else{
            System.out.println("first string is less than second string");
        }
    }
}
