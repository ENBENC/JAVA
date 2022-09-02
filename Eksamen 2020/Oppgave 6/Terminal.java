import java.util.Scanner;
class Terminal implements Brukergrensesnitt{
    private Scanner lesInput;
    public Terminal(Scanner l){
        lesInput = l;
    }

    public void giStatus(String status){
        System.out.println(status);
    }
    public int beOmKommando(String spoersmaal, String[] alternativer){
        System.out.println("---------------------------------------------");
        System.out.println("Spoersmaal: " + spoersmaal);
        System.out.println("---------------------------------------------");
        System.out.println("Velg et alternativ: ");
        for(int i=0;i<alternativer.length;i++){
            System.out.println("Alternativ " + i +": " + alternativer[i]);
        }
        System.out.println();
        int input = lesInput.nextInt();
        //Kontroll sjekk
        while(input >= alternativer.length || input < 0){
            System.out.println("Feil input skriv paa nytt: ");
            input = lesInput.nextInt();
        }
        return input;
    }
}
