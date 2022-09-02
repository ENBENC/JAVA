//Oppgave5
import java.util.Scanner;
import java.io.FileNotFoundException;
class Spill{
    static final String stederFil = "steder.txt";
    static final String gjenstanderFil = "gjenstander.txt";
    static final int totalTrekk = 3;

    public static void main(String[] args) {
        Scanner lesInput = new Scanner(System.in);
        Terminal terminal  = new Terminal(lesInput);
        int trekkIgjen = totalTrekk;
        //Oppgave 5
        //Antall brukeren velger antall spillere i spillet
        //Det lages en spiller med Terminal, og resten Robot
        System.out.println("Antall spillere(Maks 4): ");
        int antallSpillere = lesInput.nextInt();
        while(antallSpillere<=0 || antallSpillere>4){
            System.out.println("Feil input: ");
            antallSpillere = lesInput.nextInt();
        }

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
            alleSpiller[0] = new Spiller(terreng.hentStart(),terminal,"Spilleren 1");
            for(int i=1;i<antallSpillere;i++){
                Robot robot = new Robot();
                alleSpiller[i] = new Spiller(terreng.hentStart(),robot,robot.hentNavn());

            }

            while(trekkIgjen > 0){
                System.out.println("______________________________________________");
                System.out.println("En ny runde har startet");
                System.out.println("Trekk igjen: " + trekkIgjen);
                System.out.println("______________________________________________");
                for(Spiller s:alleSpiller){
                    s.nyttTrekk();
                    System.out.println(s.hentNavnSpiller() + " er ferdig med trekket!\n");
                }
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
            alleSpiller[0] = new VeivalgSpiller(terreng.hentStart(),terminal,"Spilleren 1");
            for(int i=1;i<antallSpillere;i++){
                Robot robot = new Robot();
                alleSpiller[i] = new VeivalgSpiller(terreng.hentStart(),robot,robot.hentNavn());

            }

            while(trekkIgjen > 0){
                System.out.println("______________________________________________");
                System.out.println("En ny runde har startet");
                System.out.println("Trekk igjen: " + trekkIgjen);
                System.out.println("______________________________________________");
                for(VeivalgSpiller s:alleSpiller){
                    s.nyttTrekk();
                    System.out.println(s.hentNavnSpiller() + " er ferdig med trekket!\n");
                }
                trekkIgjen--;
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
