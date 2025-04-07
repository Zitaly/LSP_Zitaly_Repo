package org.howard.edu.lsp.assignment6;
import org.junit.jupiter.api.*;

import static org.junit.Assert.*;

import java.util.*;

public class IntegerSetTest {
    private IntegerSet integerset1;
    private IntegerSet integerset2;
    private IntegerSet emptyset;

    @BeforeEach
    public void setUp(){
        ArrayList<Integer> set1 = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> set2 = new ArrayList<>(Arrays.asList(4,5,6));
        integerset1 = new IntegerSet(set1);
        integerset2 = new IntegerSet(set2);
        emptyset = new IntegerSet();
    }

    @Test
    @DisplayName("Test Clear")
    public void testClear() {
        integerset1.clear();
        integerset2.clear();
        assertEquals(emptyset, integerset1);
        assertEquals(emptyset, integerset2);
    }

    @Test
    @DisplayName("Test Length")
    public void testLength() {
        assertEquals(3, integerset1.length());
        assertNotEquals(4, integerset2.length());
        assertEquals(0, emptyset.length());
    }

    @Test
    @DisplayName("Test Equals")
    public void testEquals() {
        assertEquals(false, integerset1.equals(integerset2));
        assertNotEquals(true, integerset1.equals(integerset2));
        
    }

    @Test
    @DisplayName("Test Contains")
    public void testContains() {
        assertTrue(integerset1.contains(1));
        assertFalse(integerset2.contains(0));
        
    }

    @Test
    @DisplayName("Test Largest")
    public void testLargest() throws Exception {
        assertEquals(3, integerset1.largest());
        assertNotEquals(4, integerset2.largest());
        assertEquals(0, emptyset.largest());
    }

    @Test
    @DisplayName("Test Smallest")
    public void testSmallest() throws Exception {
        assertEquals(1, integerset1.smallest());
        assertNotEquals(6, integerset2.smallest());
        assertEquals(0, emptyset.smallest());
    }

    @Test
    @DisplayName("Test Add")
    public void testAdd() {
        integerset1.add((4));
        integerset2.add(7);
        // assertArrayEquals not working...
        // assertEquals with contains? relies on contains working...
        ArrayList<Integer> set1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> set2 = new ArrayList<>(Arrays.asList(4,5,6));
        IntegerSet intset1 = new IntegerSet(set1);
        IntegerSet intset2 = new IntegerSet(set2);
        assertEquals(intset1, integerset1);
        assertNotEquals(intset2, integerset2);
    }

    @Test
    @DisplayName("Test Remove")
    public void testRemove() {
        integerset1.remove(3);
        integerset2.remove(6);
        ArrayList<Integer> set1 = new ArrayList<>(Arrays.asList(1,2));
        ArrayList<Integer> set2 = new ArrayList<>(Arrays.asList(4,5,6));
        IntegerSet intset1 = new IntegerSet(set1);
        IntegerSet intset2 = new IntegerSet(set2);
        assertEquals(intset1, integerset1);
        assertNotEquals(intset2, integerset2);
    }

    @Test
    @DisplayName("Test Union")
    public void testUnion() {
        ArrayList<Integer> set1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        IntegerSet u = new IntegerSet(set1);
        integerset1.union(integerset2);
        assertEquals(u, integerset1);
    }

    @Test
    @DisplayName("Test Intersect")
    public void testIntersect() {
        ArrayList<Integer> set1 = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> set2 = new ArrayList<>(Arrays.asList(1,6,7));
        IntegerSet i = new IntegerSet(set1);
        IntegerSet newset2 = new IntegerSet(set2);
        integerset1.intersect(newset2);
        assertEquals(i, integerset1);
        
    }

    @Test
    @DisplayName("Test Difference")
    public void testDiff() {
        ArrayList<Integer> set1 = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> set2 = new ArrayList<>(Arrays.asList(2,3));
        IntegerSet d = new IntegerSet(set1);
        IntegerSet newset2 = new IntegerSet(set2);
        integerset1.diff(d);
        assertEquals(newset2, integerset1);
    }

    @Test
    @DisplayName("Test Complement")
    public void testComplement() {
        ArrayList<Integer> set1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        IntegerSet comp = new IntegerSet(set1);
        ArrayList<Integer> correct = new ArrayList<>(Arrays.asList(4,5,6));
        IntegerSet c = new IntegerSet(correct);
        integerset1.complement(comp);
        assertEquals(c, integerset1);
        
    }

    @Test
    @DisplayName("Test Is Empty")
    public void testIsEmpty() {
        IntegerSet emptyset = new IntegerSet();
        assertTrue(emptyset.isEmpty());
        assertFalse(integerset1.isEmpty());
    }

    @Test
    @DisplayName("Test To String")
    public void testToString() {
        String set1 = "[1, 2, 3]";
        assertEquals(set1, integerset1.toString());
        
    }
}
