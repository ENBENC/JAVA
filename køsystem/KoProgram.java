import java.util.Scanner;
class KoProgram{
    public static void main(String[] args) {
        KoSystem kosystem1 = new KoSystem();
        Scanner lesInput = new Scanner(System.in);
        System.out.println("**MENY FOR BILLETTSYSTEM**");
        System.out.println("1 - Trekk ny kolapp.");
        System.out.println("2 - Betjen Kunde.");
        System.out.println("3 - Print antall kunder i ko.");
        System.out.println("4 - Avslutt");
        int input = lesInput.nextInt();
        if(input == 1){
            kosystem1.trekkKoLapp();
        }
        else if(input == 2){
            kosystem1.betjenKunde();
        }
        else if(input == 3){
            kosystem1.printKunderIKo();
        }
        else if (input == 4){
            System.out.println("Avslutt.");
        }
        else{
            System.out.println("Feil input.");
        }
        System.out.println("");

        while(input != 4){
            System.out.println("**MENY FOR BILLETTSYSTEM**");
            System.out.println("1 - Trekk ny kolapp.");
            System.out.println("2 - Betjen Kunde.");
            System.out.println("3 - Print antall kunder i ko.");
            System.out.println("4 - Avslutt");
            input = lesInput.nextInt();
            if(input == 1){
                kosystem1.trekkKoLapp();
            }
            else if(input == 2){
                kosystem1.betjenKunde();
            }
            else if(input == 3){
                kosystem1.printKunderIKo();
            }
            else if (input == 4){
                System.out.println("Avslutt.");
            }
            else{
                System.out.println("Feil input.");
            }
            System.out.println("");
        }
        lesInput.close();
        System.exit(1);
    }
}
