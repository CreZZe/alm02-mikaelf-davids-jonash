/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author powkn
 */
@Named(value = "randomFactor")
@SessionScoped
public class RandomFactor implements Serializable {

    private int randomNumber;
    
    /**
     * Creates a new instance of RandomFactor
     */
    public RandomFactor() {
        randomNumber = getRandomNumber();
    }
    
    public int getRandomNumber() {
        return (int) (Math.random() * 10) + 1;
    }
    
}
