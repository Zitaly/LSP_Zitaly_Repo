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
        if (o.getClass() == this.getClass()) {
            IntegerSet b = (IntegerSet) o;
            for (int i : b.set) {
                if (set.contains(i) == false) {
                    return false;
                }
            }
            return true;
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

    // Rmove item or does nothing if not present
    public void remove(int item) {
        while (set.contains(item)) {
            set.remove(set.indexOf(item)); // https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
            
        }
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
        List<Integer> temp = new ArrayList<Integer>();
        temp = intSetb.set;
        temp.removeAll(set); // Source: https://docs.oracle.com/javase/8/docs/api/java/util/Set.html
        set = temp;
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
