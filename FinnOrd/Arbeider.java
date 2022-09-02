import java.util.concurrent.*;
class Arbeider implements Runnable{
    private int nummer;
    private Monitor monitor;
    private String navn;
    private int startIndeks;
    private int sluttIndeks;
    private CountDownLatch latch;
    public Arbeider(Monitor m, int start,int slutt,String n,int nr,CountDownLatch l){
        monitor = m;
        startIndeks = start;
        sluttIndeks = slutt;
        navn = n;
        nummer = nr;
        latch = l;
    }

    @Override
    public void run(){
        try {
            while(startIndeks!= sluttIndeks){
                monitor.tellerNavn(navn,startIndeks);
                System.out.println("Traad nummer " + nummer + " arbeider.");
                startIndeks++;
            }
        }
        finally{
            System.out.println("Traad nr:" + nummer + " ferdig!");
            latch.countDown();
        }
    }
}
