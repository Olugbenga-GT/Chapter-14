import java.io.FileNotFoundException;
import java.util.Formatter;

public class CreateTextFile {

    private static Formatter output;

    public static void opeNewFile() {
        try {
            output = new Formatter("clients.txt");
        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1); // terminate the program
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); // terminate the program
        }
    }
}
