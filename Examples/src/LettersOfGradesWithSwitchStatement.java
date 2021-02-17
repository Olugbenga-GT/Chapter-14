import java.util.Scanner;

public class LettersOfGradesWithSwitchStatement {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int total = 0, gradeCounter = 0, countOfA = 0, countOfB = 0, countOfC = 0,
            countOfD = 0, countOfE = 0, countOfF = 0;

        System.out.printf("%s%n %s%n %s%n %S%n",
                          "Enter the score of students from 0 - 100",
                          "To terminate input:",
                          "On Mac & Linux, press <ctrl> + D and enter",
                          "On Window, press <ctrl> + z and enter");


        System.out.println("Input grades");
        while(input.hasNext()){
            System.out.println("Input your grade");
            int grade = input.nextInt();
            if(grade > 100){ System.out.println("Invalid score, please input 1 - 100"); }
            else {
                total += grade;
                ++gradeCounter;

                switch (grade / 10) {
                    case 9:
                    case 10: // Scores between 100 and 80
                        ++countOfA;
                        break;
                    case 8:  // Scores between 80 - 70
                        ++countOfB;
                        break;
                    case 7: //Score between 70 - 60
                        ++countOfC;
                        break;
                    case 6:     //Scores between 60 - 50
                        ++countOfD;
                        break;
                    case 5: //Scores between 60 - 50
                        ++countOfE;
                        break;
                    case 4: //Score between 49 - 0
                        ++countOfF;
                        break;
                }
            }

        }
        System.out.printf("%n Grade Report:  %n");
        if(gradeCounter != 0 ){
            double average = (double) total / gradeCounter;
            System.out.printf("Total of the %d grade entered is %d%n", gradeCounter, total);
            System.out.printf("The class average is %.2f", average);
            System.out.printf("%n%s%n", "Number of Student who received what grade: ");
            System.out.printf("A: %d%n B: %d%n C: %d%n D:  %d%n E: %d%n F: %d%n", countOfA, countOfB, countOfC, countOfD, countOfE, countOfF);
        }
        else {
            System.out.println("No grades were entered!");
        }

    }
}
