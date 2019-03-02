/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courrier.Letters;

import courrier.Contenu.Contenu;
import courrier.Contenu.Money;
import courrier.Habitant;
import courrier.notEnoughCashException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bensadoun
 * @param <C>
 */
public class BillLetter< C extends Contenu> extends Letter<Money> {

    int value;
    
    public BillLetter(Habitant sender, Habitant receiver, Money money) {
        super(sender, receiver, money, 1 + (money.getValue() * 1 / 100));
        value = money.getValue();
    }
    
    @Override
    public void Actions() {        
        System.out.println(sender.getId() + " envoie " + value + " à " + receiver.getId()+"\n");
        try {
            printLetter();
        } catch (notEnoughCashException ex) {
            Logger.getLogger(BillLetter.class.getName()).log(Level.SEVERE, null, ex);
        }
        receiver.debiterCompte(value);
    }
    
    @Override
    public Habitant getSender() {
        return sender;
    }
    
    @Override
    public void setSender(Habitant sender) {
        this.sender = sender;
    }
    
    @Override
    public Habitant getReceiver() {
        return receiver;
    }
    
    @Override
    public void setReceiver(Habitant receiver) {
        this.receiver = receiver;
    }
    
    @Override
    public int getCost() {
        return cost;
    }
    
    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }
    
}
