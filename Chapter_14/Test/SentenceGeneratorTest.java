import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceGeneratorTest {

    SentenceGenerator generator;

    @BeforeEach
    void setUp() {
        generator = new SentenceGenerator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testToGetArticleArray(){
        assertNotNull(generator.getArticles());
        assertEquals(5, generator.getArticles().length);
    }

    @Test
    void testThatSentenceCanBeGenerated(){
        for(int counter = 0; counter < 20; counter++) {
            String sentence = generator.getSentence();
            assertNotNull(sentence);
            assertFalse(sentence.isEmpty());
            System.out.println(sentence);
        }
    }
}