

/**
 * Write a description of class twoDarray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class twoDarray
{
   final int countries = 7;
   final int medals = 3;
   int[][] counts = {{1,0,1},{1,2,3},{1,1,1},{4,5,3},{1,0,4},{5,1,2},{0,5,2}}; 
   public twoDarray(){
      
   }
    
   public void callDisplayElements(){
       for (int i = 0; i < counts.length; i++){
           for (int x = 0; x < counts[i].length; x++){
               System.out.print(counts[i][x] + "\t");
           }
           System.out.println();
        }
    }
   
   public int totalCountryMedals(int countryIndex){
       int total = 0;
       for( int x = 0; x < counts[countryIndex].length; x++){
           total += counts[countryIndex][x];
        }
       return total; 
   }
   
   public int totalMedals(int medalIndex){
       int total = 0;
       for (int i = 0; i < counts.length; i++){
           total += counts[i][medalIndex];
        }
       return total;
    }
}
    