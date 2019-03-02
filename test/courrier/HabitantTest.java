/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courrier;

import courrier.Contenu.Contenu;
import courrier.Letters.Letter;
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
public class HabitantTest {

    City city;
    BankAccount bk;
    Habitant habitant;
    SimpleLetter letter;

    public HabitantTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        bk = new BankAccount(5);
        city = new City("Racoon City", null, null, null);
        habitant = new Habitant("Jean Damien", null, bk);
        letter = new SimpleLetter(habitant, habitant, null, 0);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSendLetter() throws Exception {
        System.out.println("sendLetter");
        habitant.sendLetter(letter);
        assertFalse(city.empty());
    }

    @Test
    public void testCanYou() {

        System.out.println("canYou");
        assertFalse(habitant.canYou(50));
    }

    @Test
    public void testCrediterCompte() throws notEnoughCashException {

        bk = new BankAccount(5000);
        habitant.crediterCompte(bk.getCredit());
        assertEquals(bk.getCredit(), 0);
    }

    /**
     * Test of debiterCompte method, of class Habitant.
     */
    @Test
    public void testDebiterCompte() {
       bk = new BankAccount(5000);
       int money= bk.getCredit();
        habitant.debiterCompte(bk.getCredit());
        assertEquals(bk.getCredit(),money*2);
    }

}

//l'initialisation d'un habitant necessite l'existence d'un BankAccount
class BankAccount {

    private int Credit;

    public BankAccount(int Credit) {
        this.Credit = Credit;
    }

    public int getCredit() {
        return Credit;
    }

    public void setCredit(int Credit) {
        this.Credit = Credit;
    }

}