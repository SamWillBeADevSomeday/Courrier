/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courrier;

import courrier.City;
import courrier.Contenu.Contenu;
import courrier.Habitant;
import courrier.Letters.Letter;
import courrier.Letters.RegisteredLetter;
import courrier.Letters.SimpleLetter;
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
public class RegisteredLetterTest {

    Habitant habitant;
    City city;
    SimpleLetter simple;
    RegisteredLetter<Letter> letter;
    BankAccount money;

    public RegisteredLetterTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        habitant = new Habitant("David Bowey", city, money);
        city = new City("Racoon City", null, null, null);
        simple = new SimpleLetter(habitant, habitant, null, 0);
        money = new BankAccount(99999999);
        letter = new RegisteredLetter(habitant, habitant, simple);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testActions() {
        letter.Actions();
        assertFalse(city.empty());
    }

}
