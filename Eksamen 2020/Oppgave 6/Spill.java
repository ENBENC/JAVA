//Oppgave 6
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.concurrent.CountDownLatch;
class Spill{
    static final String stederFil = "steder.txt";
    static final String gjenstanderFil = "gjenstander.txt";
    static final int totalTrekk = 100;

    public static void main(String[] args) {
        Scanner lesInput = new Scanner(System.in);
        Terminal terminal  = new Terminal(lesInput);
        int trekkIgjen = totalTrekk;

        System.out.println("Antall spillere(Maks 4): ");
        int antallSpillere = lesInput.nextInt();
        while(antallSpillere<=0 || antallSpillere>4){
            System.out.println("Feil input: ");
            antallSpillere = lesInput.nextInt();
        }
        CountDownLatch latch = new CountDownLatch(antallSpillere);

        System.out.println("Trykk 1 - Enkelt terreng(En utvei)");
        System.out.println("Trykk 2 - Terreng med 3 veivalg");
        int valg = lesInput.nextInt();
        while(valg != 1 && valg !=2){
            System.out.println("Feil input: ");
            valg = lesInput.nextInt();
        }

        if(valg == 1){
            System.out.println("Her starter spillet");
            Terreng terreng = new Terreng();
            Spiller[] alleSpiller = new Spiller[antallSpillere];
            for(int i=0;i<antallSpillere;i++){
                Robot robot = new Robot();
                alleSpiller[i] = new Spiller(terreng.hentStart(),robot,robot.hentNavn(),trekkIgjen,latch);
            }

            for (Spiller s :alleSpiller ) {
                Thread t = new Thread(s);
                t.start();
            }
            try{
                latch.await();
            }
            catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
            //Finner vinneren
            int storstFormue = alleSpiller[0].hentFormue(); Spiller vinner = alleSpiller[0];
            for (int i = 0;i<alleSpiller.length;i++) {
                if(alleSpiller[i].hentFormue()>storstFormue){
                    storstFormue = alleSpiller[i].hentFormue();
                    vinner = alleSpiller[i];
                }
            }
            System.out.println("---------------------------------------------");
            System.out.println("Vinneren(Resultat): ");
            String tekst = "Navn: " + vinner.hentNavnSpiller() +"\n"+
                            "Formue: " + vinner.hentFormue();
            System.out.println(tekst);
            System.out.println("Avslutt spillet");
            System.exit(0);
        }
        else{
            System.out.println("Her starter spillet");
            VeivalgTerreng terreng = new VeivalgTerreng();
            VeivalgSpiller[] alleSpiller = new VeivalgSpiller[antallSpillere];
            for(int i=0;i<antallSpillere;i++){
                Robot robot = new Robot();
                alleSpiller[i] = new VeivalgSpiller(terreng.hentStart(),robot,robot.hentNavn(),trekkIgjen,latch);
            }
            for (VeivalgSpiller s :alleSpiller ) {
                Thread t = new Thread(s);
                t.start();
            }
            try{
                latch.await();
            }
            catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
            //Finner vinneren
            int storstFormue = alleSpiller[0].hentFormue(); VeivalgSpiller vinner = alleSpiller[0];
            for (int i = 0;i<alleSpiller.length;i++) {
                if(alleSpiller[i].hentFormue()>storstFormue){
                    storstFormue = alleSpiller[i].hentFormue();
                    vinner = alleSpiller[i];
                }
            }
            System.out.println("---------------------------------------------");
            System.out.println("Vinneren(Resultat): ");
            String tekst = "Navn: " + vinner.hentNavnSpiller() +"\n"+
                            "Formue: " + vinner.hentFormue();
            System.out.println(tekst);
            System.out.println("Avslutt spillet");
            System.exit(0);
        }
    }
}
