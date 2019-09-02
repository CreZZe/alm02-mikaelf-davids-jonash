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
@Named(value = "person")
@SessionScoped
public class Person implements Serializable {

    private RandomFactor r = new RandomFactor();
    
    private String fullName;
    private String ethnicity;
    private String nationality;
    private String birthDate;
    private String gender;

    public Person() {
    }
    

    public Person(String fullName, String ethnicity, String nationality, String birthDate, String gender) {
        this.fullName = fullName;
        this.ethnicity = ethnicity;
        this.nationality = nationality;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public RandomFactor getR() {
        return r;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
