import java.util.Random;
import java.util.concurrent.CountDownLatch;
class Elev implements Runnable{
    //Hvert elev har en id, som tilsvarer id til stemmen.
    //Her brukes en random tall fra 0 til 1 for å simulere stemmingen.
    //0 for Grot, og 1 for Pannekake.
    //Etter eleven er ferdig så tellet countDown med 1, slik når alle elevene er ferdig så slipper await i Main.
    private static int id = 0;
    private Random randomTall = new Random();
    private int stemme = randomTall.nextInt(2);//Gir ett random tall fra 0 til 1;
    private int elevId;
    StemmeBoks stemmeboks;
    CountDownLatch countDown;

    public Elev(StemmeBoks s,CountDownLatch c){
        stemmeboks = s;
        countDown = c;
        elevId = id;
        id++;
    }
    @Override
    public void run(){
        try {
            if(stemme == 0){
                stemmeboks.stemme("Grot",elevId);
            }
            else{
                stemmeboks.stemme("Pannekake",elevId);
            }
        }
        finally{
            countDown.countDown();
        }
    }
}
