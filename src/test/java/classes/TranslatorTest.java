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
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFortune method, of class Translator.
     */
    @Test
    public void testGetFortune() {
        /*System.out.println("getFortune");
        Translator instance = new Translator();
        String expResult = "";
        String result = instance.getFortune();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of calculateFortune method, of class Translator.
     */
    @Test
    public void testCalculateFortune() {
        /*System.out.println("calculateFortune");
        Person person = null;
        Translator instance = new Translator();
        instance.calculateFortune(person);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
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
        /*System.out.println("gender");
        String gender = "";
        Translator instance = new Translator();
        String expResult = "";
        String result = instance.gender(gender);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of age method, of class Translator.
     */
    @Test
    public void testAge() {
        /*System.out.println("age");
        String ageString = "";
        Translator instance = new Translator();
        String expResult = "";
        String result = instance.age(ageString);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }
    
}
