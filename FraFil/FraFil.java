import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
class FraFil{
    public static void main(String[] args)throws FileNotFoundException{
        File file = new File("tekst.txt");
        Scanner lesFil = new Scanner(file);
        while(lesFil.hasNext()){
            System.out.println(lesFil.next());
        }
        lesFil.close();
    }

}
