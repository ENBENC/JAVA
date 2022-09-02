import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
class TemperaturLeser{
    public static void main(String[] args)throws FileNotFoundException{
        String [] stringArray = new String[12];
        File file = new File("Temperatur.txt");
        Scanner lesFile = new Scanner(file);
        int teller = 0;
        while(lesFile.hasNextLine() == true && teller < stringArray.length){
            String linje = lesFile.nextLine();
            stringArray[teller] = linje;
            teller++;
        }
        for(String i: stringArray){
            System.out.println(i);
        }
        lesFile.close();
    }
}
