
package hilos;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;


public class P3 extends Thread{
    
     protected Semaphore s2;
    public P3(Semaphore s2){
    
       this.s2 = s2;
    }
   
    /**
     *
     * @throws Exception
     */
    public void run()   {
    
        try{
        
             sleep(2000);
            
            
        }
        catch(Exception e){
        
         e.printStackTrace();
        }
        
        System.out.println("P3");
        this.s2.release(2);
            
        }
}
