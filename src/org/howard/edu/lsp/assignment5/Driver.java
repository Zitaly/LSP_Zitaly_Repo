/*
 * Name: Xavier Green
 */
package org.howard.edu.lsp.assignment5;

import java.util.*;

public class Driver {
    public static void main(String[] args) {
        // Initialize sets
        IntegerSet set1 = new IntegerSet();
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        IntegerSet set2 = new IntegerSet(a);
        // Add to set
        set1.add(0);
        set1.add(4);
        set1.add(5);
        set1.add(0);
        
        // Print set
        System.out.println("Set 1 is:" + set1);
        System.out.println("Set 2 is:" + set2);
        
        // Get length
        System.out.println("Set 1 length:" + set1.length());
        System.out.println("Set 2 length:" + set2.length());
        
        // Get largest
        System.out.println("Largest in Set1:" + set1.largest());
        System.out.println("Largest in Set2:" + set2.largest());

        // Get smallest
        System.out.println("Smallest in Set1:" + set1.smallest());
        System.out.println("Smallest in Set2:" + set2.smallest());

        // Remove from set
        set1.remove(0);
        set1.remove(10);
        System.out.println("Set 1 after removal of 0 is:" + set1);
        System.out.println("Set 2 after removal of 10 is:" + set2);

        // Set union
        set1.union(set2);
        System.out.println("Union of set1 and set2:" + set1);
    
        // Clear set
        set1.clear();
        System.out.println("Set1 after clearing:" + set1);

        // Set empty
        System.out.println("Is set1 empty:" + set1.isEmpty());
        System.out.println("Is set2 empty:" + set2.isEmpty());

        // Set intersection
        set1.add(0);
        set1.add(4);
        set1.add(5);
        set1.add(1);
        System.out.println("New set1: " + set1);
        set1.intersect(set2);
        System.out.println("Intersection of set1 and set2:" + set1);

        // Set difference
        set1.add(0);
        set1.add(4);
        set1.add(5);
        set1.add(1);
        System.out.println("New set1: " + set1);
        set1.diff(set2);
        System.out.println("Set1 - Set2 is:" + set1);
        
        // Set complement
        IntegerSet universalset = new IntegerSet();
        universalset.add(0);
        universalset.add(1);
        universalset.add(2);
        universalset.add(3);
        universalset.add(4);
        universalset.add(5);
        universalset.add(6);
        universalset.add(7);
        universalset.add(8);
        universalset.add(9);
        universalset.add(10);
        System.out.println("Universal Set: " + universalset);
        set1.complement(universalset);
        System.out.println("Complement of set1:" + set1);

        // Set equals ################# Wrong
        // Note: Equals, by its function, tests contains.
        System.out.println("Is set1 and set2 equal:" + set1.equals(set2));

        // Set contains
        System.out.println("Does set1 contain 2:" + set1.contains(2));
        System.out.println("Does set2 contain 100:" + set2.contains(100));
    }
}
