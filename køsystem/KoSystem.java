import java.util.ArrayList;
public class KoSystem{
    private ArrayList<KoLapp> koLapper = new ArrayList<KoLapp>();
    private static int nummer = 1;
    public void trekkKoLapp(){
        koLapper.add(new KoLapp(nummer));
        System.out.println("Du har faat tildelt villettnr " + nummer +".");
        System.out.println("Det staar " + (koLapper.size()-1) + " foran deg.");
        nummer ++;
    }
    public void betjenKunde(){
        if(koLapper.size() != 0){
            System.out.println("Betjen Kunde: " + koLapper.get(0).hentNummer());
            koLapper.remove(0);
        }
        else{
            System.out.println("Det er ingen flere kunder.");
        }
    }
    public int antKunder(){
        return koLapper.size();
    }

    public void printKunderIKo(){
        System.out.println("Det staar " + antKunder() + " personer i ko");
    }
}
