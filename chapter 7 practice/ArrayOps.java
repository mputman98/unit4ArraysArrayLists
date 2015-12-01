

/**
 * Write a description of class ArrayOps here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayOps
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    public static void main(String[] args){
        double[] x = {8,4,5,21,7,9,18,2,100};
        System.out.println("length of x:" + x.length);
        System.out.println("x[0] :" +x[0]);
        System.out.println("x[8]:" +x[8]);
        System.out.println("x[x.length -1]:"+x[x.length -1]);
        for (int i = 0; i < x.length; i++){
            System.out.println( x[i] );
        }
        
        for (int i = 0; i < x.length; i++){
            System.out.println( "x[" + i + "]" + x[i]);
        }
        
        for (int i = x.length; i > 0; i--){
            System.out.println( "x[" + i + "]" + x[i]);
        }
        
        for ( double value : x){
            System.out.println(value);
        }
    }
}
    