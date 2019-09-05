/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author powkn
 */
@Named(value = "translator")
@SessionScoped
public class Translator implements Serializable {

    HashMap<String, String> fortuneList = new HashMap<>();
    String fortune;
    
    /**
     * Creates a new instance of Translator
     */
    public Translator() {
        fortuneList.put("1-5man0-20", "You excel at pleasing others.");
        fortuneList.put("1-5man21-50", "Focus on your health and well-being now. It won't wait.");
        fortuneList.put("1-5man51->", "Be thankful, even if your life is not perfect.");
        fortuneList.put("1-5kvinna0-20", "Open your mind and your heart to good things.");
        fortuneList.put("1-5kvinna21-50", "Travel is in your future.");
        fortuneList.put("1-5kvinna51->", "Worry does not beget change.");

        fortuneList.put("6-10man0-20", "Go with your gut feeling.");
        fortuneList.put("6-10man21-50", "Your home will be filled with peace and harmony.");
        fortuneList.put("6-10man51->", "Get ready for a life-changing event!");
        fortuneList.put("6-10kvinna0-20", "Everyone agrees you are the best.");
        fortuneList.put("6-10kvinna21-50", "Your home will be filled with peace and harmony.");
        fortuneList.put("6-10kvinna51-100", "Your smile lights up someone else's day.");
    }

    public String getFortune() {
        return fortune;
    }
    
    private String getFortuneWithKey(String key) {
        return fortuneList.get(key);
    }
    
    public void calculateFortune(Person person) {
        String key;
        
        key = randomNumber(person.getR().getRandomNumber());
        key += gender(person.getGender());
        key += age(person.getBirthDate());
        
        fortune = getFortuneWithKey(key);
       
    }
    
    public String randomNumber(int rand) {
        if (rand > 5) {
            return "6-10";
        }
        else {
            return "1-5";
        }        
    }
    
    public String gender(String gender) {
        String keyAppend;
        switch (gender) {
            case "Man":
                keyAppend = "man";
                break;
            case "Woman":
                keyAppend = "kvinna";
                break;
            default:
                keyAppend = "kvinna";
                break;
        }
        
        return keyAppend;
    }
    
    public String age(String ageString) {
        int age = Integer.parseInt(ageString);
        
        if (age >= 0 && age <= 20)
            return "0-20";
        else if (age >= 21 && age <= 50)
            return "21-50";
        else
            return "51->";
    }
}
