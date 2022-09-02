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
            Spiller spiller = new Spiller(terreng.hentStart(),terminal,"Spilleren 1");
            Spiller[] alleSpiller = {spiller};

            while(trekkIgjen > 0){
                System.out.println("---------------------------------------------");
                System.out.println("Trekk igjen: " + trekkIgjen);
                spiller.nyttTrekk();
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
            VeivalgSpiller spiller = new VeivalgSpiller(terreng.hentStart(),terminal,"Spilleren 1");
            VeivalgSpiller[] alleSpiller = {spiller};

            //Denne koden brukes aa kjore programmet med Robot brukergrensesnittet
            // Robot robot = new Robot();
            // VeivalgSpiller spiller = new VeivalgSpiller(terreng.hentStart(),robot,robot.hentNavn());
            // VeivalgSpiller[] alleSpiller = {spiller};

            while(trekkIgjen > 0){
                System.out.println("---------------------------------------------");
                System.out.println("Trekk igjen: " + trekkIgjen);
                spiller.nyttTrekk();
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
