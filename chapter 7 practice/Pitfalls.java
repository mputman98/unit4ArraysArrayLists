import java.util.ArrayList;

/**
 * Write a description of class Pitfalls here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pitfalls
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class Pitfalls
     */
    public static void main(String[] args)
    {
        // initialise instance variables
       ArrayList<String> words = new ArrayList<String>();
       
       words.add("test");
       words.add("like");
       words.add("like");
       words.add("cookie");
       
       System.out.println(words);
       
       for( int i = words.size() - 1; i >= 0; i--){
           String word = words.get(i);
           if (word.equals("like")){
               words.remove(i);
            }
        }
       System.out.println(words); 
    }

    

}
