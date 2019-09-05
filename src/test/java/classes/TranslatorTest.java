package classes;

import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 224Mi
 */
public class TranslatorTest {
    
    Translator trans = new Translator();
    Random random = new Random();
    Person p1 = new Person("Mikael Fredriksson", "Asd", "Asd", "21", "Man");
    
    public TranslatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        trans.calculateFortune(p1);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFortune method, of class Translator.
     */
    @Test
    public void testGetFortune() {
        if (p1.getR().getRandomNumber() <= 5){
            assertEquals(trans.getFortune(), "Focus on your health and well-being now. It won't wait.");
        }
        else
            assertEquals(trans.getFortune(), "Your home will be filled with peace and harmony.");
    }

    /**
     * Test of calculateFortune method, of class Translator.
     */
    @Test
    public void testCalculateFortune() {
        
        if (p1.getR().getRandomNumber() <= 5){
            assertEquals(trans.getFortune(), "Focus on your health and well-being now. It won't wait.");
        }
        else
            assertEquals(trans.getFortune(), "Your home will be filled with peace and harmony.");
        
    }

    /**
     * Test of randomNumber method, of class Translator.
     */
    @Test
    public void testRandomNumber() {
        for (int i = 1; i <= 10; i++) {
            if (i >= 1 && i <= 5)
                assertEquals(trans.randomNumber(i), "1-5");
            else
                assertEquals(trans.randomNumber(i), "6-10");
        }
    }

    /**
     * Test of gender method, of class Translator.
     */
    @Test
    public void testGender() {
        assertEquals(trans.gender("Man"), "man");
        assertEquals(trans.gender("Woman"), "kvinna");
        
        assertEquals(trans.gender("\0Man"), "kvinna");
        assertEquals(trans.gender("\0Woman"), "kvinna");
        
        assertEquals(trans.gender(" "), "kvinna");
    }

    /**
     * Test of age method, of class Translator.
     */
    @Test
    public void testAge() {
        int rand;
        
        
        for (int i = -200; i < 200; i++) {
            
            if (i >= 0 && i <= 20) {
                assertEquals(trans.age(String.valueOf(i)), "0-20");
            }
            else if (i >= 21 && i <= 50) {
                assertEquals(trans.age(String.valueOf(i)), "21-50");
            }
            else {
                assertEquals(trans.age(String.valueOf(i)), "51->");
            }
        }
    }
    
}
