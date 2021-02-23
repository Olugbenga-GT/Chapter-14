import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle;
    @BeforeEach
    void setUp() {
        rectangle = new Rectangle();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testToCalculatePerimeterOfRectangle(){
        rectangle.setLength(10);
        rectangle.setWidth(15);
        assertEquals(150, rectangle.calculatePerimeter());
    }

}