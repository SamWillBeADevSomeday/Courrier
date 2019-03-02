/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courrier;

import courrier.Letters.Letter;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Samir Bensadoun
 */
public class CityTest {

    City city;
    Letter letter;
    Habitant habitant;

    public CityTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        city = new City("Overwatch", null, null, null);
        letter = null;
        habitant = null;
    }

    public void setUp2() {
        List<Letter> list = new ArrayList();
        city = new City("Overwatch", null, null, list);
        letter = null;
        list.add(letter);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of addLetter method, of class City.
     */
    @Test
    public void testAddLetter() {
        System.out.println("addLetter");

        City instance = new City();
        instance.addLetter(letter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testAddHabitant() {
    city.addHabitant(habitant);
    assert(city.getHabitant().get(0).equals(habitant));
    }

    
    @Test
    public void testEmpty() {
        assertTrue(city.empty());
    }

    public void testisntEmpty() {
        setUp2();
        assertFalse(city.empty());
    }

}
