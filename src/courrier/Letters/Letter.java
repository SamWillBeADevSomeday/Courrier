/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courrier.Letters;

import courrier.Habitant;
import courrier.notEnoughCashException;

/**
 *
 * @author bensadoun
 * @param <C>
 */
public abstract class Letter<C> {

    
    protected Habitant sender;
    protected Habitant receiver;
    protected C content;
    protected int cost;
    
    public Letter(Habitant sender, Habitant receiver, C content, int cost) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.cost = cost;
    }
    
    public void printLetter() throws notEnoughCashException{
        System.out.println("\t \nSender:  ");
        if(sender.canYou(cost)){
        sender.debiterCompte(cost);
        sender.printHabitant();
        System.out.println("\t \nReceiver:  ");
        receiver.printHabitant();
        System.out.println("\t \nCOST:  "+cost);
        }
        else throw new notEnoughCashException();
    
    }
    
    
    public Habitant getSender() {
        return sender;
    }

    public void setSender(Habitant sender) {
        this.sender = sender;
    }

    public Habitant getReceiver() {
        return receiver;
    }

    public void setReceiver(Habitant receiver) {
        this.receiver = receiver;
    }

    public C getContent() {
        return content;
    }

    public void setContent(C content) {
        this.content = content;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
    
    public void Actions(){}
    
    
}
