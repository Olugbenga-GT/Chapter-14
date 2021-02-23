import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle2 = new Rectangle();
        try {
            rectangle2.calculatePerimeter();
        }
        catch (IllegalArgumentException error){
            System.out.printf("%s", error.getMessage());
        }

        rectangle2.setWidth(15.0);
        rectangle2.setLength(20.0);
        System.out.printf("The perimeter of your rectangle is %.2f", rectangle2.calculatePerimeter());


//        try {myTime.setTime(99, 78, 75);}
//        catch (IllegalArgumentException error){
//            System.out.printf("Exception: %s%n", error.getMessage());
//        }

    }
}
