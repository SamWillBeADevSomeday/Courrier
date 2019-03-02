/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courrier;

import courrier.Contenu.Money;
import courrier.Letters.BillLetter;
import courrier.Letters.FoolLetter;
import courrier.Letters.Letter;
import courrier.Letters.RegisteredLetter;
import courrier.Letters.SimpleLetter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Samir Bensadoun
 */
public class CourrierFoolSimulation {

    public static void main(String[] args) throws notEnoughCashException {
        List<Street> listS = new ArrayList();
        List<Habitant> listH = new ArrayList();
        List<Letter> inbox = new ArrayList();
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
        Habitant h7 = new Habitant("Heather Mason", city, bk5);
        Habitant h8 = new Habitant("Heather Mason", city, bk5);
        Habitant h9 = new Habitant("Heather Mason", city, bk5);
        Habitant h10 = new Habitant("Heather Mason", city, bk5);
        Habitant h11 = new Habitant("Heather Mason", city, bk5);
        Habitant h12 = new Habitant("Heather Mason", city, bk5);
        Habitant h13 = new Habitant("Heather Mason", city, bk5);
        Habitant h14 = new Habitant("Heather Mason", city, bk5);
        Habitant h15 = new Habitant("Heather Mason", city, bk5);
        Habitant h16 = new Habitant("Heather Mason", city, bk5);
        
        listH.add(h1);
        listH.add(h2);
        listH.add(h3);
        listH.add(h4);
        listH.add(h5);
        listH.add(h6);
        listH.add(h7);
        listH.add(h8);
        listH.add(h9);
        listH.add(h10);
        listH.add(h11);
        listH.add(h12);
        listH.add(h13);
        listH.add(h14);
        listH.add(h15);
        listH.add(h16);
        
        
        
        
        Money money = new Money(5);
        ListOfPeople lop = new ListOfPeople(listH);
        
        FoolLetter fool = new FoolLetter(h1,h2,lop,10);
        city.addLetter(fool);
        while(!city.empty()){
        city.distributeLetters();
        }
    lop.printRich();
        
}}
