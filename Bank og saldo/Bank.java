import java.util.concurrent.locks.*;
class Bank{
    private int pengerbelop = 0;
    private final int MAX = 10000;
    private final Lock laas = new ReentrantLock();
    Condition ikkeFull = laas.newCondition();
    Condition ikkeTom = laas.newCondition();

    public void ta(int taUt){
        laas.lock();
        try {
            while((pengerbelop-taUt) < 0){
                //Dersom penger skal ta ut er mer enn det er igjen, skal tråden vente.
                ikkeTom.await();
            }
            pengerbelop -= taUt;
            ikkeTom.signalAll();
            //Etter har tatt ut, så er ikke kontoren full.
        }
        catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        finally{
            laas.unlock();
        }
    }
    public void gi(int gir){
        laas.lock();
        try {
            while((pengerbelop+gir)>MAX){
                //Dersom penger skal inn i kontoren er mer enn MAX, skla tråden vente.
                ikkeFull.await();
            }
            pengerbelop += gir;
            ikkeTom.signalAll();
            //Etter kontoren har fått penger, så er den ikkeTom.
        }
        catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        finally{
            laas.unlock();
        }
    }
    public int saldo(){
        return pengerbelop;
    }
}
