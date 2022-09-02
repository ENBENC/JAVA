import java.util.Scanner;
class Handletur{
    public static void main(String[] args){
        Scanner lesInput = new Scanner(System.in);
        int total_pris = 0;
        System.out.println("Hei! Velkommen til IFI-butikken.");
        System.out.println("Hvor mange brod vil du ha?: ");
        total_pris += lesInput.nextInt()*20;
        System.out.println("Hvor mange Melk vil du ha?: ");
        total_pris += lesInput.nextInt()*15;
        System.out.println("Hvor mange Ost vil du ha?: ");
        total_pris += lesInput.nextInt()*40;
        System.out.println("Hvor mange Youghurt vil du ha?: ");
        total_pris += lesInput.nextInt()*12;
        System.out.println("Du skal betale: " + total_pris + " kr.");
        lesInput.close();
    }
}
