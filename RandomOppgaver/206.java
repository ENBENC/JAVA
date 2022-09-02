import java.util.Scanner;

class HarKjoretidsfeil {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        Scanner tastatur = new Scanner("System.in");//Feil syntaks for system.in.

        System.out.println("Tast inn to heltall");
        x = Integer.parseInt(tastatur.nextLine());
        x = Integer.parseInt(tastatur.nextLine());//logisk feil, her skal man bruke variabel y, for å lagre den andre linjen.

        System.out.println("Summen av tallene er: " + x + y); //Feil, for for å få summen av x og y, så
        //må man skrive "Summen av tallene er: " + (x+y). der som man skriver tekst+x+y, så vil bare y kommer etter x. 
    }
}
