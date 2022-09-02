import java.util.ArrayList;
import java.util.concurrent.*;
class Main{
    public static void main(String[] args) {
        String navn = args[0];
        String filnavn = args[1];
        int antallTraad = Integer.parseInt(args[2]);
        CountDownLatch latch = new CountDownLatch(antallTraad);
        Monitor monitor = new Monitor();
        String[] navnene = monitor.lesInnFil(filnavn);

        int antallOrd = navnene.length;
        int antallOrdPerTraad = antallOrd/antallTraad;
        int indeksStart = 0;
        int indeksSlutt = 0;
        for (int i =0 ; i< antallTraad;i++ ) {
            if(i == antallTraad-1){
                Thread t = new Thread(new Arbeider(monitor,indeksStart,antallOrd,navn,i,latch));
                t.start();

            }
            else{
                Thread t = new Thread(new Arbeider(monitor,indeksStart,indeksSlutt+antallOrdPerTraad,navn,i,latch));
                t.start();
                indeksStart += antallOrdPerTraad;
                indeksSlutt += antallOrdPerTraad;
            }
        }
        try{
            latch.await();
        }
        catch (InterruptedException e) {
            System.out.println("Feil");
        }
        System.out.println("Ord per traad: " + antallOrdPerTraad);
        System.out.println("Antall samme navn = " + monitor.hentAntall());
    }
}
