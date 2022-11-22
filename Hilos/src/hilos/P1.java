
package hilos;

import java.util.concurrent.Semaphore;
import javax.print.PrintException;

public class P1 extends Thread{
    
    protected Semaphore s1;
    public P1(Semaphore s1){
    
       this.s1 = s1;
    }
   
    /**
     *
     * @throws Exception
     */
    @Override
    public void run()   {
    
        try{
        
            sleep(2000);
             
            
        }
        catch(Exception e){
        
         e.printStackTrace();
        }
        
        System.out.println("P1");
        this.s1.release(2);
            
        }
    
        
    }
    

