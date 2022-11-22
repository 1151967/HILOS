
package hilos;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;

public class P4 extends Thread{
    
     protected Semaphore s1,s2;
 
 public P4(Semaphore s1, Semaphore  s2){
 this.s1 = s1;
 this.s2 = s2;
 
 
 }
 
 public void run(){
 
  
     try {
         this.s1.acquire();
          this.s2.acquire();
     } catch (InterruptedException ex) {
         ex.printStackTrace();
     }
    
     
     try {
         sleep(2000);
     } catch (InterruptedException ex) {
         ex.printStackTrace();
     }
   
     System.out.println("P4");
 }

}
