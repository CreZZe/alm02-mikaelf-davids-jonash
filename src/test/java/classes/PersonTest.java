package classes;

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
public class PersonTest {
    
    Person p1;
    
    public PersonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        p1 = new Person();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFullName method, of class Person.
     */
    @Test
    public void testGetFullName() {
        p1.setFullName("Mikael");
        assertEquals(p1.getFullName(), "Mikael");
    }

    /**
     * Test of getEthnicity method, of class Person.
     */
    @Test
    public void testGetEthnicity() {
        p1.setEthnicity("asd");
        assertEquals(p1.getEthnicity(), "asd");
    }

    /**
     * Test of getNationality method, of class Person.
     */
    @Test
    public void testGetNationality() {
        p1.setNationality("Asd");
        assertEquals(p1.getNationality(), "Asd");
    }

    /**
     * Test of setBirthDate method, of class Person.
     */
    @Test
    public void testGetBirthDate() {
        p1.setBirthDate("20");
        assertEquals(p1.getBirthDate(), "20");
    }

    /**
     * Test of setGender method, of class Person.
     */
    @Test
    public void testGetGender() {
        p1.setGender("Man");
        assertEquals(p1.getGender(), "Man");
    }
    
}
