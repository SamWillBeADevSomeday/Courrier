/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courrier;

/**
 *
 * @author bensadoun
 */
public class Adresse {

    public Adresse(Street street, City city) {
        this.street = street;
        this.city = city;
    }
    private Street street;
    private City city;

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    
}
