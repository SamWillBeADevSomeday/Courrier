/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courrier.Letters;

import courrier.Contenu.Contenu;
import courrier.Habitant;
import courrier.notEnoughCashException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bensadoun
 * @param <C>
 */
public class SimpleLetter<C extends Contenu> extends Letter {

    String text = "contenu d'une lettre quelconque";

    public SimpleLetter(Habitant sender, Habitant receiver, String text, int cost) {
        super(sender, receiver, text, 50);
        this.text=text;
        

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

    @Override
    public void Actions() {
        try {
            System.out.println(sender.getId() + " sent a simple letter to " + receiver.getId()+"\n");
            System.out.println("the message is " + text+"\n");
            printLetter();
        } catch (notEnoughCashException ex) {
            Logger.getLogger(SimpleLetter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
