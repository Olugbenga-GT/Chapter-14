import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceCreationTest {
    SentenceCreation createSentence;
    @BeforeEach
    void setUp() {
        createSentence = new SentenceCreation();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
     void testToGetArticles(){
        String[] article = {"a", "the"};
        createSentence.setArticles(article);
        assertArrayEquals(article, createSentence.getArticle());

        String[] noun = {"Cow, goat"};
        createSentence.setNouns(noun);
        assertArrayEquals(noun, createSentence.getNouns());

        String[] verb = {"Cow, goat"};
        createSentence.setVerbs(verb);
        assertArrayEquals(noun, createSentence.getVerbs());

        String[] preposition = {"Cow, goat"};
        createSentence.setPrepositions(preposition);
        assertArrayEquals(noun, createSentence.getPrepositions());
    }

    @Test
    void testToGetArrayArticles(){
        assertNotNull(createSentence.getArticle());
        assertEquals(5, createSentence.getNouns().length);
    }

    @Test
    void testThatSentencesCanBeCreated(){
        createSentence.getSentence();
        assertNotNull(createSentence.getSentence());
        for(int i = 0; i < 20; i++) {
            System.out.printf("%s %n", createSentence.getSentence());
        }
    }
}