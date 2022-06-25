
package multithreading;


public class Road {

    
    public static void main(String[] args) {
        
     System.out.println ("Lets start!");
        
    
        RunnerThread hare =new RunnerThread ( "Hare", 90, 100);
        
        RunnerThread tortoise = new RunnerThread ("Tortoise", 0, 10);
        
       
       
         
           
        hare.start();
        tortoise.start();
    
        
     
       
    }
}
