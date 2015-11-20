

/**
 * Write a description of class PartialArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PartialArray
{
   private int[] values;
   private int currentSize;
   
    /**
     * Default constructor for objects of class PartialArray
     */
   public PartialArray()
   {
        this.values = new int[100];
        for (this.currentSize = 0; this.currentSize < 10; this.currentSize++){
            this.values[this.currentSize] = this.currentSize * this.currentSize;
        }
   }
}
        