import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class Monitor{
    Lock laas = new ReentrantLock();
    Condition ikkeNestKoo = laas.newCondition();
    int forrige = 0;
    public void skrivUt(int i){
        laas.lock();
        try {
            while(i != forrige){
                ikkeNestKoo.await();
            }
            if(i == forrige){
                forrige = i+1;
                System.out.println(i);
                ikkeNestKoo.signalAll();
            }
        }
        catch(InterruptedException e) {
            System.out.println("Interruped");
        }
        finally{
            laas.unlock();
        }
    }
}
