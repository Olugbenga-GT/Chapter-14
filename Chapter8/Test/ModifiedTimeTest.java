import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedTimeTest {
    ModifiedTime time;
    @BeforeEach
    void setUp() {
        time = new ModifiedTime(24, 12, 12);
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatVariablesCanBeCreated(){
        time.setSeconds(21);
        assertEquals(21, time.getSeconds());
        time.setMinutes(14);
        time.setHours(14);
        assertEquals(02, time.getHours());
        assertEquals(02, time.getMinutes());
    }

}