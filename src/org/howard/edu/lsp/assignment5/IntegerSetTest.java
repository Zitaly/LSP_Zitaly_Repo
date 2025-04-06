package org.howard.edu.lsp.assignment5;

import org.junit.jupiter.api.*;

import static org.junit.Assert.*;

import java.util.*;

public class IntegerSetTest {
    private IntegerSet integerset1;
    private IntegerSet integerset2;

    @BeforeEach
    public void setUp(){
        ArrayList<Integer> set1 = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> set2 = new ArrayList<>(Arrays.asList(4,5,6));
        integerset1 = new IntegerSet(set1);
        integerset2 = new IntegerSet(set2);
    }

    @Test
    @DisplayName("Test Clear")
    public void testClear() {
        IntegerSet emptyset = new IntegerSet(); // Empty set. Can't compare equals
        integerset1.clear();
        integerset2.clear();
        assertEquals(emptyset, integerset1);
        assertEquals(emptyset, integerset2);
    }

    @Test
    @DisplayName("Test Length")
    public void testLength() {
        
    }

    @Test
    @DisplayName("Test Equals")
    public void testEquals() {
        
    }

    @Test
    @DisplayName("Test Contains")
    public void testContains() {
        
    }

    @Test
    @DisplayName("Test Largest")
    public void testLargest() {
        
    }

    @Test
    @DisplayName("Test Smallest")
    public void testSmallest() {

    }

    @Test
    @DisplayName("Test Add")
    public void testAdd() {
        
    }

    @Test
    @DisplayName("Test Remove")
    public void testRemove() {
        
    }

    @Test
    @DisplayName("Test Union")
    public void testUnion() {
        
    }

    @Test
    @DisplayName("Test Intersect")
    public void testIntersect() {
        
    }

    @Test
    @DisplayName("Test Difference")
    public void testDiff() {

    }

    @Test
    @DisplayName("Test Complement")
    public void testComplement() {
        
    }

    @Test
    @DisplayName("Test Is Empty")
    public void testIsEmpty() {
        
    }

    @Test
    @DisplayName("Test To String")
    public void testToString() {
        
    }
}
