package org.howard.edu.lspfinal.question1;
import org.junit.Assert;
import org.junit.jupiter.api.*;

import static org.junit.Assert.*;

import java.util.*;

public class ShoppingCartTest {
    private ShoppingCart cart1;

    @BeforeEach
    public void setUp() {
        cart1 = new ShoppingCart();
    }

    @Test
    @DisplayName("Test Add Item") 
    public void testAddItem() {
        cart1.addItem("Dog", 59.00);
        cart1.addItem("", 0);
    }

    @Test
    @DisplayName("Test Add Item with negative price")
    public void testNegativeAddItem() {
        try {
            cart1.addItem("Cat", -1.00);
            Assert.fail();
        } catch (IllegalArgumentException e) {
        }
        

    }
    @Test
    @DisplayName("Test Remove Item")
    public void testRemoveItem () {
        // Note: Add this code to SC

    }

    @Test
    @DisplayName("Test Total Cost")
    public void testGetTotalCost () {
        cart1.getTotalCost();
        cart1.addItem("Dog", 50.00);
        cart1.applyDiscountCode("SAVE10");
        cart1.getTotalCost();

    }

    @Test
    @DisplayName("Test Apply Discount")
    public void testApplyDiscountCode () {
        cart1.addItem("Dog", 50.00);
        cart1.applyDiscountCode("SAVE10");
        cart1.applyDiscountCode("SAVE20");
    }

    @Test
    @DisplayName("Test Apply Discount")
    public void testApplyInvalidDiscountCode () {
        try {
            cart1.addItem("Dog", 50.00);
            cart1.applyDiscountCode("SAVE25");
            Assert.fail();
            
        } catch (IllegalArgumentException e) {
        }

    }

    @Test
    @DisplayName("Test Cart Size update")
    public void testCartSize() {
        // Note: Add this code to SC

    }

}
