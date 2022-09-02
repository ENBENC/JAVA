import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Random;
class VeivalgTerreng extends Terreng{
    private VeivalgSted startSted = null;
    private VeivalgSted[] alleSteder = new VeivalgSted[40];
    public VeivalgTerreng(){
        stederFilNavn = Spill.stederFil; gjenstandFilNavn = Spill.gjenstanderFil;
        byggeOppTerreng();
    }
    private void byggeOppTerreng(){
        Random random = new Random();
        try{
            lesGjenstand();
            Scanner lesFil = new Scanner(new File(stederFilNavn));
            int indeks = 0;

            while(lesFil.hasNext()){
                VeivalgSted sted = new VeivalgSted(lesFil.nextLine());
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
                alleSteder[indeks] = sted;
                indeks++;
            }
            lesFil.close();
        }
        catch (FileNotFoundException e){
                System.out.println("Finner ikke filen");
        }
        //Lenker sammen alle stedene
        //rettFrem er veien gjennom alle stedene, som i oppgave2
        //Venstre og hoeyre vei er tilfeldig valg, og er ikke lik hverandre eller veien i indeks "i"
        startSted = alleSteder[0];
        for(int i = 0;i<alleSteder.length;i++){

            int i1 = random.nextInt(alleSteder.length);
            int i2 = random.nextInt(alleSteder.length);
            while(i1==i2 || i1==i || i2==i){
                i1 = random.nextInt(alleSteder.length);
                i2 = random.nextInt(alleSteder.length);
            }
            //Sjekker om i er den siste indeks
            if(i == alleSteder.length-1){
                VeivalgSted venstre = alleSteder[i1];
                VeivalgSted hoeyre = alleSteder[i2];
                alleSteder[i].settUtgang(venstre,null,hoeyre);
            }
            else{
                alleSteder[i].settUtgang(alleSteder[i1],alleSteder[i+1],alleSteder[i2]);
            }
        }
    }
    public VeivalgSted hentStart(){
        return startSted;
    }
}
