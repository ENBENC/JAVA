import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
class Linjenummer{
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("linje.txt");
        Scanner lesFil = new Scanner(file);
        int tall = 0;
        while(lesFil.hasNextLine()){
            String linje = lesFil.nextLine().trim();
            tall++;
            System.out.println("#" + tall + ": " + linje);
        }
        lesFil.close();
    }
}
