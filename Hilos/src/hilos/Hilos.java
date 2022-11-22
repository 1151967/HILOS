
package hilos;

import java.util.concurrent.Semaphore;


public class Hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Semaphore s1 = new Semaphore(0,true);
        Semaphore s2 = new Semaphore(0, true);
        P1 p1 = new P1(s1);
        P3 P3 = new P3(s2);
        P2 p2 = new P2(s1,s2);
        P4 p4 = new P4(s1, s2);
        
        (new Thread(new P1(s1))).start();
        (new Thread(new P3(s2))).start();
        (new Thread(new P2(s1, s2))).start();
        (new Thread(new P4(s1, s2))).start();
          
       
       
     
    }
    
}