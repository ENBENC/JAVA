import java.util.Scanner;
class SkattIRuritania{
    public static void main(String[] args){
        Scanner lesInput = new Scanner(System.in); //lage en ny scanner som ta input.
        String input = lesInput.nextLine(); //Leser input fra brukeren
        double intekt = Double.parseDouble(input); //Konvertere input fra string til double.
        if(intekt < 10000){
            System.out.println("Skatt: " + (intekt*0.1));
        }
        else if(intekt >= 10000){
            double forste_del = (10000*0.1);
            double andre_del =  (intekt-10000)*0.3;
            System.out.println("Skatt: " + (forste_del+andre_del));
        }
        lesInput.close();
    }
}
