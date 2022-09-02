import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
class Main{
    public static void main(String[] args) throws FileNotFoundException{
        ArrayList<Person> personer = new ArrayList<Person>();
        ArrayList<Hund> hunder = new ArrayList<Hund>();
        File fil = new File("navn.txt");
        Scanner lesFil = new Scanner(fil);
        while(lesFil.hasNextLine()){
            String[] en_linje = lesFil.nextLine().trim().split(" ");
            String sjekk_bokstav = en_linje[0];
            if(sjekk_bokstav.equals("P")){
                Person person = new Person(en_linje[1]);
                personer.add(person);
            }
            else{
                Hund hund = new Hund(en_linje[1]);
                hunder.add(hund);
            }
        }
        System.out.println("Navn for alle personer: ");
        for(Person p:personer){
            System.out.println(p.hentNavn());
        }
        System.out.println("Navn for alle hunder: ");
        for(Hund h:hunder){
            System.out.println(h.hentNavn());
        }
    }
}
