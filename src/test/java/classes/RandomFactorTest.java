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
public class RandomFactorTest {
    
    RandomFactor rf = new RandomFactor();
    
    public RandomFactorTest() {
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
     * Test of getRandomNumber method, of class RandomFactor.
     */
    @Test
    public void testGetRandomNumber() {
        for (int i = 0; i < 10_000_000; i++) {
            assertNotNull(rf.createRandomNumber());
            assertTrue(rf.getRandomNumber() > 0 && rf.getRandomNumber() <= 10);
        }
    }
}
