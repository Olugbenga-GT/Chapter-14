
public class TimeTest{
    public static void main(String[] args) {
        Time time = new Time();

        displayTime("After time object is created", time);
        System.out.println();

        // Changes time and output updated time
        time.setTime(13,24,17);
        displayTime("After calling setTime", time);
        System.out.println();

        //Attempt to set time with invalid values
        try{
            time.setTime(108,64,87);
        }
        catch (IllegalArgumentException error) {
            System.out.printf("Exception: %s%n", error.getMessage());
        }
        // DiEsplay time after setting an invalid time value
        displayTime("After calling setTime with invalid time values", time);
    }

    private static void displayTime(String header, Time myTime){
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header,
                myTime.toUniversalString(), myTime.toString());
    }
}