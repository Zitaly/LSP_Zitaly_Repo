package org.howard.edu.lsp.midterm.question3;
import java.util.*;
public class VotingMachine {
    private Map<String, Integer> candidates = new HashMap<>(); // https://docs.oracle.com/javase/8/docs/api/?java/util/Collections.html

    public VotingMachine (){
    }

    // Adds candidates to ballot
    public void addCandidate(String c) {
        candidates.put(c, 0); // https://docs.oracle.com/javase/8/docs/api/?java/util/Collections.html
    }

    // Casts vote for candidate. Fails if candidate not present.
    public Boolean castVote(String c) {
        if (candidates.get(c) == null) {
            return false;
        }
        int old = candidates.get(c); // https://docs.oracle.com/javase/8/docs/api/?java/util/Collections.html
        candidates.replace(c, old, old + 1); // https://docs.oracle.com/javase/8/docs/api/?java/util/Collections.html
        return true;
    }

    // Finds candidate with most votes and declares them as winner.
    public String getWinner() {
        String winner = "";
        int largest = 0;
        for (String i : candidates.keySet()) {
            if (candidates.get(i) > largest) {
                largest = candidates.get(i);
                winner = i;
            }
        } // https://docs.oracle.com/javase/8/docs/api/?java/util/Collections.html For keysets.
        return winner;
    }
    
}
