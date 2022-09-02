//Oppgave 2g
import java.util.Scanner;
import java.io.FileNotFoundException;
class Spill{
    static final String stederFil = "steder.txt";
    static final String gjenstanderFil = "gjenstander.txt";
    static final int totalTrekk = 3;

    public static void main(String[] args) {
        System.out.println("Her starter spillet");
        Terreng terreng = new Terreng();

        Scanner lesInput = new Scanner(System.in);
        // Terminal terminal  = new Terminal(lesInput);
        // Spiller spiller = new Spiller(terreng.hentStart(),terminal,"Spilleren 1");
        // Spiller[] alleSpiller = {spiller};

        //Denne koden brukes aa kjore programmet med Robot brukergrensesnittet
        Robot robot = new Robot();
        Spiller robotSpiller = new Spiller(terreng.hentStart(),robot,robot.hentNavn());
        Spiller[] alleSpiller = {robotSpiller};

        int trekkIgjen = totalTrekk;
        if(totalTrekk > 40){
            System.out.println("Spillet kan ikke ha over 40 trekk");
            System.exit(0);
        }
        while(trekkIgjen > 0){
            System.out.println("---------------------------------------------");
            System.out.println("Trekk igjen: " + trekkIgjen);
            robotSpiller.nyttTrekk();
            trekkIgjen--;
        }
        //Finner vinneren
        int storstFormue = alleSpiller[0].hentFormue(); Spiller vinner = alleSpiller[0];
        for (int i = 0;i<alleSpiller.length;i++) {
            if(alleSpiller[i].hentFormue()>storstFormue){
                storstFormue = alleSpiller[i].hentFormue();
                vinner = alleSpiller[i];
            }
        }
        System.out.println("Vinneren(Resultat): ");
        String tekst = "Navn: " + vinner.hentNavnSpiller() +"\n"+
                        "Formue: " + vinner.hentFormue();
        System.out.println(tekst);
        System.out.println("Avslutt spillet");
        System.exit(0);
    }
}
