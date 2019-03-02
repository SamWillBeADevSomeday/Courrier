/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courrier;

import courrier.Contenu.Money;
import courrier.Letters.BillLetter;
import courrier.Letters.Letter;
import courrier.Letters.RegisteredLetter;
import courrier.Letters.SimpleLetter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author bensadoun
 */
public class Courrier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws notEnoughCashException {
        List<Street> listS = new ArrayList();
        List<Habitant> listH = new ArrayList();
        List<Letter> inbox = new ArrayList();
        Random random = new Random();
        City city = new City("SilentHill", listH, listS, inbox);
        BankAccount bk1 = new BankAccount(2000);
        BankAccount bk2 = new BankAccount(2000);
        BankAccount bk3 = new BankAccount(2000);
        BankAccount bk4 = new BankAccount(2000);
        BankAccount bk5 = new BankAccount(2000);
        BankAccount bk6 = new BankAccount(2000);
        Habitant h1 = new Habitant("James Sunderland", city, bk1);
        Habitant h2 = new Habitant("Mary Shepherd", city, bk2);
        Habitant h3 = new Habitant("Harry Mason", city, bk3);
        Habitant h4 = new Habitant("Cybil Bennet", city, bk4);
        Habitant h5 = new Habitant("Heather Mason", city, bk5);
        Habitant h6 = new Habitant("Vincent Smith", city, bk6);
        listH.add(h1);
        listH.add(h2);
        listH.add(h3);
        listH.add(h4);
        listH.add(h5);
        listH.add(h6);
        Money money = new Money(200);
        for (int i = 1; i < 4; i++) {

            SimpleLetter letter = new SimpleLetter(listH.get(random.nextInt(listH.size())), listH.get(random.nextInt(listH.size())), "i'm so sorry", 5);

            BillLetter bill = new BillLetter(listH.get(random.nextInt(listH.size())), listH.get(random.nextInt(listH.size())), money);

            SimpleLetter letter2 = new SimpleLetter(listH.get(random.nextInt(listH.size())), listH.get(random.nextInt(listH.size())), "idiot", 5);

            RegisteredLetter regester = new RegisteredLetter(listH.get(random.nextInt(listH.size())), listH.get(random.nextInt(listH.size())), letter2);

            System.out.println("\tjour " + i + " :");
            city.addLetter(letter);
            city.addLetter(bill);
            city.addLetter(regester);
            city.distributeLetters();
        }
    }

}
