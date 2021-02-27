import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PigLatinTest {
    PigLatin piggy ;
    @BeforeEach
    void setUp() {
        piggy = new PigLatin();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testToPrintLatinWord(){
       assertNotNull(piggy.printLatinWord());
    }
}