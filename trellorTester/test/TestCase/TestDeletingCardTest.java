/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fernando
 */
public class TestDeletingCardTest {
    
    public TestDeletingCardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of delitingCards method, of class TestDeletingCard.
     */
    @Test
    public void testDelitingCards() {
        System.out.println("Testing delitingCards");
        String idCard = "586563b5c7dc4e2f28a771c2";
        TestDeletingCard.delitingCards(idCard);

    }
    
}
