/*
 * Name: Xavier Green
 */
package org.howard.edu.lsp.assignment5;
import java.util.List;
import java.util.ArrayList; // Change to * if needed.

public class IntegerSet {
    private List<Integer> set = new ArrayList<Integer>();

    // DEFAULT CONSTRUCTOR
    public IntegerSet(){

    }

    // ALREADY INITIALIZED CONSTRUCTOR
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    // CLEARS INTERNAL REPRESENTATION OF SET
    public void clear() {
        set.clear();
    }

    // RETURNS SET LENGTH
    public int length() {
        return set.size();
    }

    /*
     * TRUE IF 2 SETS ARE EQUAL
     * EQUAL MEANS THEY CONTAIN SAME VALUES IN ANY ORDER
     * OVERRIDES EQUAL METHOD FROM OBJECT CLASS
     */
    public boolean equals(Object o) {
        // FILL OUT
        // Try and fail? Treat o as if it is an integerset
            
        // I could also use .equals.
        // Check class of o. If not IntegerSet, return False?
        // If true, can we cast it as IntegerSet? Try that. Then do the rest.
        if (o.getClass() == this.getClass()) {
            IntegerSet b = (IntegerSet) o;
            return set.containsAll(b.set); // Placeholder. check docs of this code. Can object be tied to set?
        }
        else {
            return false;
        }
        
    }

    // RETURNS TRUE IF SET CONTAINS VALUES.
    public boolean contains(int value) {
        return set.contains(value);
    }

    // Returns Largest
    public int largest() {
        int large = set.get(0); 
        for (int i : set) {
            if ( i > large) {
                large = i;
            }
        }

        return large;
    }

    //Returns smallest
    public int smallest() {
        int small = set.get(0);
        for (int i : set) {
            if (i < small) {
                small = i;
            }
        }
        return small;
    }

    // Adds item or does nothing if already present
    public void add(int item) {
        set.add(item);
    }

    //Remove item or does nothing if not present
    public void remove(int item) {
        set.remove(item);
    }

    //Set union
    public void union(IntegerSet intSetb) {
        set.addAll(intSetb.set);
    }

    // Set intersect, all elements in s1 and s2
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set); // Source: https://docs.oracle.com/javase/8/docs/api/java/util/Set.html
    }

    // Set difference (s1-s2)
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set); // Source: https://docs.oracle.com/javase/8/docs/api/java/util/Set.html
    }

    // set complement (All elements not in s1)
    public void complement(IntegerSet intSetb) {
        intSetb.set.removeAll(set); // Source: https://docs.oracle.com/javase/8/docs/api/java/util/Set.html
    }

    // Check empty.
    public boolean isEmpty() {
        return set.isEmpty();
    }

    // Return String Rep
    public String toString() {
        String setstring = set.toString();
        return setstring;
    }




}
