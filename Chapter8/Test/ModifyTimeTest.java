import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifyTimeTest {
    ModifyTime modify;
    @BeforeEach
    void setUp() {
        modify = new ModifyTime();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testToCheckTimeWithSeconds(){
        modify.setTime(22, 56,16);
        modify.toString();
        assertEquals(19712, modify.getTimeInSeconds());
    }
}