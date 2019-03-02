/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courrier.Contenu;

/**
 *
 * @author bensadoun
 */
public class Money implements Contenu {

    public Money(int value) {
        this.value = value;
    }
 private int value;   

    @Override
    public void get() {
        
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
