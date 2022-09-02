import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.concurrent.locks.*;
class Monitor{
    private final Lock laas = new ReentrantLock();
    private int antall = 0;
    private String[] navnene;

    public String[] lesInnFil(String filnavn){
        try {
            File file = new File(filnavn);
            Scanner lesFil = new Scanner(file);

            int indeks = 0;
            int forsteLinje = Integer.parseInt(lesFil.nextLine().trim());
            navnene = new String[forsteLinje];

            while(lesFil.hasNextLine()){
                String linje = lesFil.nextLine().trim();
                navnene[indeks] = linje;
                indeks++;
            }
            lesFil.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        }
        return navnene;
    }
    public void tellerNavn(String navn, int indeks){
        laas.lock();
        try {
            if(navn.equals(navnene[indeks])){
                antall++;
            }
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        finally{
            laas.unlock();
        }
    }
    public int hentAntall(){
        return antall;
    }
}
