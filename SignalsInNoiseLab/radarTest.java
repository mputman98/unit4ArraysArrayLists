

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class radarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class radarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class radarTest
     */
    public radarTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void test(){
        Radar rad = new Radar(100,100);
        rad.setMonsterLocation(11,11);
        int[][] acc2 = new int[rad.getNumRows()][rad.getNumCols()];
        int k = 0;
        while(k > 10){
            rad.scan();
            k++;
        }
        for (int i = 0; i < acc2.length; i++){
           for (int x = 0; x < acc2[i].length; x++){
               acc2[i][x] = rad.getAccumulatedDetection(i,x);
            }
        }
        int best = acc2[0][0]; 
        for (int i = 0; i < acc2.length; i++){
           for (int x = 0; x < acc2[i].length; x++){
               if(acc2[i][x] > best){
                   best = acc2[i][x];
               }
            }
        }
        assertEquals(rad.getAccumulatedDetection(11,11), best);
        
        
    }
}
