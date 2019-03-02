/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courrier;

import courrier.Contenu.Contenu;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samir Bensadoun
 */
public class ListOfPeople implements Contenu {

    private List<Habitant> liste = new ArrayList();

    public ListOfPeople(List<Habitant> liste) {
        this.liste = liste;
    }

    @Override
    public void get() {
    }

    public List<Habitant> getListe() {
        return liste;
    }

    public void setListe(List<Habitant> liste) {
        this.liste = liste;
    }

    public void addSomething(Habitant habitant) {
        liste.add(habitant);
    }

    public boolean removeBrigitte(Habitant habitant) {
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) == habitant) {
                liste.remove(i);
                return true;
            }
        }
        return false;
    }

    public void printRich() {
        City city = new City();
        BankAccount bk = new BankAccount(0);
        Habitant rich = new Habitant("rich", city, bk);
        for (int i = 0; i < liste.size(); i++) {
            if (rich.getBk().getCredit() < liste.get(i).getBk().getCredit()) {
                rich = liste.get(i);
            }
        }
    }

    public int getListSize() {
        return liste.size();
    }

    public Habitant gethabitant(int i) {
        return liste.get(i);
    }
}
