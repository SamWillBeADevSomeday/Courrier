/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courrier.Letters;

import courrier.Contenu.DecoratingLetter;
import courrier.Habitant;

/**
 *
 * @author Samir Bensadoun
 * @param <C>
 */
public class UrgentLetter <C extends Letter> extends DecoratingLetter{

    public UrgentLetter(Habitant sender, Habitant receiver, C content, int cost) {
        super(sender, receiver, content, cost*2);
    }

    @Override
    public void Actions() {        
        this.letter.Actions();
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
