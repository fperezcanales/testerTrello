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
public class TestEditingCardTest {
    
    public TestEditingCardTest() {
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
     * Test of editingCards method, of class TestEditingCard.
     */
    @Test
    public void testEditingCards() {
        System.out.println("testing editingCards");
        String idCard = "58655fb8cb17d98528de3f39";
        String nameCard = "test name";
        String descCard = "test descripcion";
        TestEditingCard.editingCards(idCard, nameCard, descCard);
    }
    
}
