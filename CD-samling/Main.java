import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
class Main{
    public static ArrayList<CDAlbum> albumListe = new ArrayList<CDAlbum>();
    public static void main(String[] args) {
        try {
            lesFil(args[0]);
        }
        catch(FileNotFoundException e) {
            System.out.println(e);
        }
        try {
            lesUt(args[1]);
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        for(CDAlbum a:albumListe){
            System.out.println();
            System.out.println(a);
            System.out.println();
        }
    }

    public static void lesFil(String filnavn) throws FileNotFoundException{
        ArrayList<CDAlbum> liste = new ArrayList<CDAlbum>();
        File file = new File(filnavn);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String[] en_linje = scanner.nextLine().split(",");
            int aar = Integer.parseInt(en_linje[2]);
            liste.add(new CDAlbum(en_linje[0],en_linje[1],aar));
        }
        while(liste.size()!=0){
            CDAlbum minst = liste.get(0);
            for(CDAlbum a:liste){
                if(minst.compareTo(a) > 0){
                    minst = a;
                }
            }
            albumListe.add(minst);
            liste.remove(minst);
        }
        scanner.close();
    }

    public static void lesUt(String filnavn) throws FileNotFoundException{
        PrintWriter utfil = new PrintWriter(filnavn);
        for(CDAlbum a:albumListe){
            utfil.println(a.hentArtistnavn()+","+a.hentAlbumNavn()+","+a.hentUtgivelsesaar());
        }
        utfil.close();
    }
}
