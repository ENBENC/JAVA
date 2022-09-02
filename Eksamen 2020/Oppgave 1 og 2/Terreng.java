//Oppgave 2e
//Hvert sted er lenket til en neste sted, spilleren kan gaa maksiaml 40 stepper(maks 40 tekk) i oppgave 2
//Hvert sted inneholder skattkiste, som har 3 plasser, der 2 av plassene fylles med gjenstander ved oppbygning av terreng
//Det er totalt 40 forskjellige type gjenstander i spillet, der hvert type lages 2 gjenstand objekt.
//Slik det er totalt 80 gjenstand objekter i spillet.
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Random;
class Terreng{
    //Velger aa lese verdiene til gjenstander inn her
    private String stederFilNavn, gjenstandFilNavn;
    private Gjenstand[] alleGjenstander = new Gjenstand[80];
    private Sted startSted = null;
    public Terreng(){
        stederFilNavn = Spill.stederFil; gjenstandFilNavn = Spill.gjenstanderFil;
        byggeOppTerreng();
    }
    //Det er 40 forskjellige type gjenstander i spiller
    //Det finnes 3 gjenstander av en samme type gjenstand
    private void lesGjenstand(){
        try{
            Scanner lesFil = new Scanner(new File(gjenstandFilNavn));
            int i1 = 0; int i2 = 40;
            while(lesFil.hasNext()){
                String[] en_linje = lesFil.nextLine().split(" ");
                String navn = en_linje[0];
                int verdi = Integer.parseInt(en_linje[1]);

                Gjenstand g1 = new Gjenstand(navn,verdi);
                Gjenstand g2 = new Gjenstand(navn,verdi);

                alleGjenstander[i1] = g1;
                alleGjenstander[i2] = g2;
                assert (alleGjenstander[i1] != alleGjenstander[i2]);
                i1++;i2++;
            }
            lesFil.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Finner ikke filen");
        }
    }

    private void byggeOppTerreng(){
        try{
            lesGjenstand();
            Scanner lesFil = new Scanner(new File(stederFilNavn));
            Random random = new Random();
            Sted forrige = null;

            while(lesFil.hasNext()){
                Sted sted = new Sted(lesFil.nextLine());
                Skattkiste skattkiste = new Skattkiste();
                //Fylle opp skattkiste med 2 random gjenstand fra alleGjenstander
                int tall = random.nextInt(alleGjenstander.length); int i = 0;
                while(i<2){
                    if(alleGjenstander[tall]!= null){
                        skattkiste.leggeTil(alleGjenstander[tall]);
                        alleGjenstander[tall] = null;
                        tall = random.nextInt(alleGjenstander.length);
                        i++;
                    }
                    else{
                        tall = random.nextInt(alleGjenstander.length);
                    }
                }
                sted.plasserSkattkiste(skattkiste);
            //Start er satt til aa vaere den forste Sted-objekt  som blir laget
                if(startSted == null){
                    startSted = sted;
                    forrige = sted;
                }
                else{
                    forrige.settUtgang(sted);
                    forrige = sted;
                }
            }
            lesFil.close();
        }
        catch (FileNotFoundException e){
                System.out.println("Finner ikke filen");
        }
    }

    public Sted hentStart(){
        return startSted;
    }
}
