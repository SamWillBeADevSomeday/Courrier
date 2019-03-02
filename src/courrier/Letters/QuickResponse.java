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
 * @author Samir Bensadoun
 */
public class QuickResponse<C extends Contenu> extends Letter {

    String text = "contenu d'une lettre quelconque";

    public QuickResponse(Habitant sender, Habitant receiver) {
        super(sender, receiver, "received", 0);
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
            System.out.println("\t \n"+sender.getId() + " accusé de reception " + receiver.getId()+"\n");
            printLetter();
        } catch (notEnoughCashException ex) {
            Logger.getLogger(SimpleLetter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
