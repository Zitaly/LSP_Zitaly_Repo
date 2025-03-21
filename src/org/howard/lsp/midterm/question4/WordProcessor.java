package org.howard.lsp.midterm.question4;
import java.util.*;

public class WordProcessor {
    private String sentence; // Stores sentence to be processed.

    // Constructor
    public WordProcessor (String sentence) {
        this.sentence = sentence;
    }

    // Method to find all longest words in the sentence
    public List<String> findLongestWords() {
        List<String> longwords = new ArrayList<String>();
        if (sentence.isEmpty()) {
            return longwords;
        }
        else {
            String longest = "";
            int largest = 0;
            String[] words = sentence.split(" "); // https://www.w3schools.com/java/ref_string_split.asp
            for (String i : words) {
                if (i.length() > largest) {
                    largest = i.length();
                    longest = i;
                }
            }
            for (String i : words) {
                if (i.length() == largest) {
                    longwords.add(i);
                }
            }
            return longwords;
        }


    }

}
