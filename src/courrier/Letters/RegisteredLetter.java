/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courrier.Letters;

import courrier.Contenu.DecoratingLetter;
import courrier.Habitant;
import courrier.notEnoughCashException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bensadoun
 * @param <C>
 */
public class RegisteredLetter<C extends Letter> extends DecoratingLetter {

    public RegisteredLetter(Habitant sender, Habitant receiver, C content) {
        super(sender, receiver, content, content.getCost() * (15 / 100));
    }

    
    @Override
    public void Actions() {

        C mine = (C) content;
        mine.setSender(sender);
        mine.setReceiver(receiver);
        mine.Actions();
        QuickResponse sp = new QuickResponse(receiver, sender);
        try {
            System.out.println(sender.getId() + " sent a simple letter to " + receiver.getId()+"\n");
            sender.sendLetter(sp);
        } catch (notEnoughCashException ex) {
            Logger.getLogger(RegisteredLetter.class.getName()).log(Level.SEVERE, null, ex);
        }

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
