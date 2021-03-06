

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
   
   public void remove(int pos){
       for( int i = pos +1; i < this.currentSize; i++){
           this.values[i-1] = this.values[i];
        }
        this.currentSize--;
   }
   
   public void insert(int pos, int num){
       if(this.currentSize == this.values.length){
           this.grow();
        }
       if( this.currentSize < this.values.length){
           this.currentSize++;
           for (int i = this.currentSize -1; i > pos; i--){
               this.values[i] = this.values[i-1];
           }
       }
       this.values[pos] = num;
   }
   
   public void swap(int pos1, int pos2){
       if( pos1 < this.currentSize && pos2 < currentSize){
           int temp = this.values[pos1];
           this.values[pos1] = this.values[pos2];
           this.values[ pos2 ] = temp;
       }
   }
   
   public void grow(){
       int[] newValues = new int [ this.currentSize * 2 ];
       for (int i = 0; i < this.currentSize; i++){
           newValues[i] = this.values[i];
       }
       
       this.values = newValues;
    }
    
   public static void main( String[] args){
       PartialArray pa1 = new PartialArray();
       pa1.swap(5,18);
       pa1.remove(53);
       pa1.insert(82,49);
    
    
   }
    
}
        