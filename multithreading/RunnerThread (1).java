
package multithreading;
//import java.util.Random;


public class RunnerThread extends Thread {
    
    private String name;
    private int indicate;
    private int runSpeed;
    private int runProgress;
    Thread th;
    
    
    public RunnerThread(String nm, int indic, int rnS) { 
      name=nm;
     indicate =indic;
      runSpeed =rnS;
      runProgress=0;
      
}
    
    public void run(){
        
        while (runProgress<1000) {
           //Random rand=new Random(); 
            int rand  = ((int) (Math.random()*99))+1;
            
            if (rand>=indicate) {
                runProgress +=runSpeed;
                 System.out.println (name+ ":"+runProgress);
            }
            
            try { 
                Thread.sleep (100);}
            catch (InterruptedException e) {
                System.err.println (e);
            }}
               System.out.println (name + "finished"); 
            
        }
   
    
    
    }
    
    
    

