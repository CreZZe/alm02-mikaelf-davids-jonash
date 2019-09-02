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
@Named(value = "translator")
@SessionScoped
public class Translator implements Serializable {

    /**
     * Creates a new instance of Translator
     */
    public Translator() {
    }
    
}
