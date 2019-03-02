/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courrier;

import courrier.Contenu.Contenu;
import courrier.Letters.Letter;

/**
 *
 * @author bensadoun
 */
public class Habitant {

    private String id;
    City city;
    BankAccount bk;

    public Habitant(String id, City city, BankAccount bk) {
        this.city = city;
        this.id = id;
        this.bk = bk;
    }

    public void printHabitant() {
        System.out.println(id+"\n");
        city.printCity();
    }

    public void sendLetter(Letter<? extends Contenu> letter) throws notEnoughCashException {
        if (bk.getCredit() < letter.getCost()) {
            throw new notEnoughCashException();
        } else {
            city.addLetter(letter);
            this.crediterCompte(letter.getCost());
        }
    }
    
    public boolean canYou(int i){
        if(bk.getCredit()>i){return true;}
        else return false;
    }
    
    public void crediterCompte(int  cost) {
        bk.setCredit(bk.getCredit() - cost);
    }
    public void debiterCompte(int ammount){
        bk.setCredit(bk.getCredit() + ammount );
    
    
    }
    
    public void recieveLetter(Letter<? extends Letter> letter) throws notEnoughCashException {
        System.out.println("\t \n CONFIRMATION DE REUSSITE \n");
    }

    /* getters and setters */
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public BankAccount getBk() {
        return bk;
    }

    public void setBk(BankAccount bk) {
        this.bk = bk;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
