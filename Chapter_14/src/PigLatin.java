/*114.7 (Pig Latin) Write an application that encodes English-language phrases into pig Latin. Pig
Latin is a form of coded language. There are many different ways to form pig Latin phrases. For
simplicity, use the following algorithm:
To form a pig Latin phrase from an English-language phrase, tokenize the phrase into words
with String method split. To translate each English word into a pig Latin word, place the first
letter of the English word at the end of the word and add the letters “ay.” Thus, the word “jump”
becomes “umpjay,” the word “the” becomes “hetay,” and the word “computer” becomes “omputercay.”
Blanks between words remain as blanks. Assume the following: The English phrase consists of
words separated by blanks, there are no punctuation marks and all words have two or more letters.
Method printLatinWord should display each word. Each token is passed to method printLatin-
Word to print the pig Latin word. Enable*/

import java.util.Scanner;
import java.util.StringTokenizer;


public class PigLatin {
    public String printLatinWord() {
        System.out.println("Please enter a sentence");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[] words = sentence.split(" ");
        StringBuilder builder = new StringBuilder();

        for (String word: words){
            char firstLetter = word.charAt(0);
            builder.setCharAt(word.length()-1, firstLetter);
            builder.deleteCharAt(0);
            builder.append("ay");
        }
        return builder.toString();
    }
}
