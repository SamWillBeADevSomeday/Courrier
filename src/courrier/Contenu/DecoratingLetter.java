/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courrier.Contenu;

import courrier.Habitant;
import courrier.Letters.Letter;

/**
 *
 * @author bensadoun
 * @param <C>
 */
public abstract class DecoratingLetter <C extends Letter> extends Letter<C> {

    protected C letter;

    public DecoratingLetter(Habitant sender, Habitant receiver, C content, int cost) {
        super(sender, receiver, content, cost);
    }

    

    
    
    
}
