
package divisiblebythreeportfolio;
import java.util.Scanner;

public class DivisibleByThreePortfolio {

   
    public static void main(String[] args) {
     Scanner keyboard = new Scanner (System.in);  
     int input;
     
     
     System.out.println ("Enter your integer");
     input = keyboard.nextInt ();
     
     if (input %3 ==0) {
       System.out.println ("Is divisible by three ");
     }
     else {
         System.out.println ("Is not divisible by three");
         
     }
     
     
        
        
        
        
        
        
    }
    
}
