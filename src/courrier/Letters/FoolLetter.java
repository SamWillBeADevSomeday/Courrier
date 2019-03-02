/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courrier.Letters;

import courrier.Contenu.Contenu;
import courrier.Contenu.Money;
import courrier.Habitant;
import courrier.ListOfPeople;
import courrier.notEnoughCashException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Samir Bensadoun
 * @param <C>
 */
public class FoolLetter extends Letter<ListOfPeople> {

    Random random = new Random();

    public FoolLetter(Habitant sender, Habitant receiver, ListOfPeople content, int cost) {
        super(sender, receiver, content, 50);
    }

    public void Action() throws notEnoughCashException {
        if (receiver.canYou(cost + 5)) {
            if (random.nextInt(100) < 10) {
                content.removeBrigitte(sender);
                content.addSomething(receiver);
                for (int i = 0; i < 4; i++) {
                    System.out.println(sender.getId() + " sent a fool letter to " + content.gethabitant(i) + "\n");
                    FoolLetter fool = new FoolLetter(receiver, content.gethabitant(i), content, cost);
                    receiver.sendLetter(fool);
                }
                for (int i = 0; i < content.getListSize(); i++) {
                    Money money = new Money(5);
                    BillLetter bill = new BillLetter(receiver, content.gethabitant(i), money);
                    receiver.sendLetter(bill);
                }
            }
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
