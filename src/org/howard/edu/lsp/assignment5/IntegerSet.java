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
        // FILL OUT
    }

    // RETURNS SET LENGTH
    public int length() {

        // FILL OUT
        return 5; // Placeholder
    }

    /*
     * TRUE IF 2 SETS ARE EQUAL
     * EQUAL MEANS THEY CONTAIN SAME VALUES IN ANY ORDER
     * OVERRIDES EQUAL METHOD FROM OBJECT CLASS
     */
    public boolean equals(Object o) {
        // FILL OUT
        return false;
    }

    // RETURNS TRUE IF SET CONTAINS VALUES.
    public boolean contains(int value) {
        // FILL OUT
        return false;
    }

    // Returns Largest
    public int largest() {
        // Fill out
        return 5;
    }

    //Returns smallest
    public int smallest() {
        // Fill out
        return 5;
    }

    // Adds item or does nothing if already present
    public void add(int item) {
        // Fill out
    }

    //Remove item or does nothing if not present
    public void remove(int item) {
        //Fill out
    }

    //Set union
    public void union(IntegerSet intSetb) {
        // Fill out
    }

    // Set intersect, all elements in s1 and s2
    public void intersect(IntegerSet intSetb) {
        // Fill out
    }

    // Set difference (s1-s2)
    public void diff(IntegerSet intSetb) {
        // Fill out
    }

    // set complement (All elements not in s1)
    public void complement(IntegerSet intSetb) {
        // Fill out
    }

    // Check empty.
    public boolean isEmpty() {
        // Fill out
        return true;
    }

    // Return String Rep
    public String toString() {
        // Fill out
        return "S";
    }




}
