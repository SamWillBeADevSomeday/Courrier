/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courrier;

import courrier.Letters.Letter;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author bensadoun
 */
public class City {
    
    // ce constructeur existe uniquement pour la simulation
    public City(){}
    
    public City(String nom, List<Habitant> habitant, List<Street> street, List<Letter> inbox) {
        this.nom = nom;
        this.habitant = habitant;
        this.street = street;
        this.inbox = inbox;
    }

    private String nom;
    private List<Habitant> habitant;
    private List<Street> street;
    private List<Letter> inbox;

    Habitant hab;

    

    

    public void addLetter(Letter letter) {
        inbox.add(letter);
    }

    public void distributeLetters() throws notEnoughCashException {
        for (int i = 0; i < inbox.size(); i++) {
            hab = inbox.get(i).getReceiver();
            inbox.get(i).Actions();
            hab.recieveLetter(inbox.get(i));
            inbox.remove(inbox.get(i));
          }
        
    }

    public void printCity(){
    System.out.println(nom);}
    
    public void addHabitant(Habitant habitant) {
        this.habitant.add(habitant);
    }

    public void addStreet(Street street) {
        this.street.add(street);
    }
    
    public boolean empty(){
        return inbox.isEmpty();
    }

    public List<Habitant> getHabitant() {
        return habitant;
    }

    public List<Street> getStreet() {
        return street;
    }

    public List<Letter> getInbox() {
        return inbox;
    }
}
