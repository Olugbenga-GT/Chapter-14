

import java.security.SecureRandom;

public class SentenceCreation {
    private String[] article = {"the", "a", "one", "some","any"};
    private String[] noun= {"boy", "girl", "dog", "town", "car"};
    private String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
    private String[] preposition = {"to", "from", "over", "under", "on"};




    public void setArticles(String[] article) {
        this.article = article;

    }

    public String[] getNouns() {
        return noun;
    }

    public void setNouns(String[] noun) {
        this.noun = noun;
    }

    public String[] getVerbs() {
        return verb;
    }

    public void setVerbs(String[] verb) {
        this.verb = verb;
    }

    public String[] getPrepositions() {
        return preposition;
    }

    public void setPrepositions(String[] preposition) {
        this.preposition = preposition;
    }

    public String[] getArticle() {
        return article;
    }


    public String getSentence() {
    StringBuilder sentence = new StringBuilder();
    SecureRandom randomNumber = new SecureRandom();
    int word;
    String space = " ";
    String choiceNoun, choiceVerb, choiceArticle, choicePreposition;

    word = randomNumber.nextInt(5);
    choiceArticle = article[word];
    char firstLetter = choiceArticle.charAt(0);
    firstLetter = Character.toUpperCase(firstLetter);
    choiceArticle = choiceArticle.replace(choiceArticle.charAt(0), firstLetter);

    sentence.append(choiceArticle);
    sentence.append(space);

    word = randomNumber.nextInt(5);
    choiceNoun = noun[word];
    sentence.append(choiceNoun);
    sentence.append(space);

    word = randomNumber.nextInt(5);
    choiceVerb = verb[word];
    sentence.append(choiceVerb);
    sentence.append(space);

    word = randomNumber.nextInt(5);
    choicePreposition = preposition[word];
    sentence.append(choicePreposition);
    sentence.append(space);

    word = randomNumber.nextInt(5);
    choiceArticle = article[word];
    sentence.append(choiceArticle);
    sentence.append(space);

    word = randomNumber.nextInt(5);
    choiceNoun = noun[word];
    sentence.append(choiceNoun);
    sentence.append(".");
    sentence.toString();
    return sentence.toString();
    }
}
