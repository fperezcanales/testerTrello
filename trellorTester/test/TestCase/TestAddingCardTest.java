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
public class TestAddingCardTest {
    
    public TestAddingCardTest() {
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
     * Test of addCards method, of class TestAddingCard.
     */
    @Test
    public void testAddCards() {
        System.out.println("testing addCards");
        
        String idList = "585e0851ed61598d077f9ec0"; //Board Num 2
        String nameCard = "test_card";
        String descCard = "test_card_junit";
        
        TestAddingCard.addCards(idList, nameCard, descCard);

    }
    
}
