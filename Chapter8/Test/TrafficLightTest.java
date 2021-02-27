import java.util.Scanner;

public class TrafficLightTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How long have you been waiting for..");
        int time = input.nextInt();

        if( time <= 5) {
            System.out.printf("You've waited some %d minutes, the light will be %s %nHold on a bit", TrafficLight.RED.getDuration(), TrafficLight.RED);
        }
        else if (time < 11) {
            System.out.printf("You've waited some %d minutes, the light will be %s. %nGet ready to move", TrafficLight.YELLOW.getDuration(), TrafficLight.YELLOW);
        }
        else if(time < 16) {
            System.out.printf("You've waited some %d minutes, the light will be %s. You move in %d seconds", time, TrafficLight.GREEN, TrafficLight.GREEN.getDuration() - time);
        }
        else{
            System.out.println("You cant wait for more than 15 seconds.");
        }
    }
}