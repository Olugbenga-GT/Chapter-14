import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;

import static org.junit.jupiter.api.Assertions.*;

class CreateTextFileTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testToCreateFile(){
        try {
       Formatter fileFormat = new Formatter("client.txt");
       String output = "C:\\Users\\user\\Desktop\\invoice\\";
       Path filePath = Paths.get(output);
       assertNotNull(filePath);
       assertTrue(Files.exists(filePath));
        }
        catch ( FileNotFoundException error){
            error.printStackTrace();
        }
    }

    @Test void createFile(){

    }
}
