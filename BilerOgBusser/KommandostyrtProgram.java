import java.util.Scanner;
class KommandostyrtProgram{
    public static void main(String[] args) {
        Scanner lesInn = new Scanner(System.in);
        System.out.println("1 - Personbil");
        System.out.println("2 - Buss");
        System.out.println("3 - Varebil");
        int input = lesInn.nextInt();
        while(input != 1 && input != 2 && input != 3){
            System.out.println("Feil inntast.");
            System.out.println("1 - Personbil");
            System.out.println("2 - Buss");
            System.out.println("3 - Varebil");
            input = lesInn.nextInt();
        }

        System.out.println("Skriv registreringsnummer: ");
        String input2 = lesInn.next();
        System.out.println("Skriv fabrikkmerke: ");
        String input3 = lesInn.next();
        System.out.println("Skriv eieren navn: ");
        String input4 = lesInn.next();

        if(input == 1){
            System.out.println("Skriv antall sitteplasser: ");
            int input5 = lesInn.nextInt();
            Personbil p = new Personbil(input2,input3,input4,input5);
            System.out.println(p);
        }
        else if(input == 2){
            System.out.println("Skriv antall sitteplasser: ");
            int input5 = lesInn.nextInt();
            Buss b = new Buss(input2,input3,input4,input5);
            System.out.println(b);
        }
        else{
            System.out.println("Skriv maks lastvekt: ");
            int input5 = lesInn.nextInt();
            Varebil v = new Varebil(input2,input3,input4,input5);
            System.out.println(v);
        }




    }
}
