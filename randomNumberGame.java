
package javaapplication45;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class randomNumberGame {


  
    public static void main(String[] args) {
       Random random =new Random();
       Scanner keyboard =new Scanner(System.in);
             int randomNumber;
             int input=0;
             int numberGuesses;
       
    
   do{
   randomNumber =random.nextInt(100)+1;
    System.out.println ("Enter the guessing number");
    input = keyboard.nextInt();
    keyboard.nextLine();
    
   // for (i=0; i<input; i++;){
       // numberGuesses++;}
       
        
   
    if (input<1||input>100){
   try {
            throw new NumberOutOfRangeException ("Number is not between range"+input);}
         catch (InputMismatchException e) {
               System.out.println("Your number is not integer");
             keyboard.nextLine();
              
           }
        catch (NumberOutOfRangeException ex) {
               System.out.println("your number is out of range");
               System.exit(0);
           }}
          
           
       
    if (input ==randomNumber){
        System.out.println("Congratulations! You guessed the number in guesses"); }
    else if (input <randomNumber){
         System.out.println("Your guess was too low, the number was "+randomNumber);}
    else if ( input>randomNumber){
      System.out.println("Your guess was too high, the number was"+randomNumber);  
    }}
    while(input<1 || input>100);{
       System.out.println("you input was"+input );
   }
    }

    private static class NumberOutOfRangeException extends Exception {

        public NumberOutOfRangeException(String string) {
        }
    }
}
 
   
    



        
      

    

    
