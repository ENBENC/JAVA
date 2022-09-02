import java.util.Random;
class Skattkiste{
    private Random random = new Random();
    private Gjenstand[] gjenstander;
    //Denne konstrutoren brukes til aa lage ryggsekk til spillerene
    public Skattkiste(int plass){
        gjenstander = new Gjenstand[plass];
    }
    //Denne konstrutoren brukes til aa lage Skattekiste som skal plassere i Sted
    //Der hvert skatt skiste har plass 3
    public Skattkiste(){
        gjenstander = new Gjenstand[3];
    }

    public Gjenstand taUt(){
        //Skjekker om Skattkiste er tomt
        boolean erTomt = erTomt();
        //Hvis Skattkiste er tomt, saa kan ikke det ta ut noen ting
        if(erTomt){
            return null;
        }
        //Her tas en tilfeldig gjenstand ut av Skattkiste, dersom den ikke er tomt
        else{
            int randomTall = random.nextInt(gjenstander.length);
            Gjenstand taUtGjenstand = gjenstander[randomTall];
            while(taUtGjenstand == null){
                randomTall = random.nextInt(gjenstander.length);
                taUtGjenstand = gjenstander[randomTall];
            }
            gjenstander[randomTall] = null;
            return taUtGjenstand;
        }
    }
    public int leggeTil(Gjenstand gs){
        //Prisen spiller faar, verierer litt tilfeldig, spilleren vil faar litt mer enn selve verdien til gjenstand som legges inn
        //Hvis prisen er 0, saa betyr at gjenstanden ikke legges inn
        ikkeSamme(gs);
        int returnVerdien = gs.hentVerdi() + random.nextInt(100);
        for(int i=0;i<gjenstander.length;i++){
            if(gjenstander[i] == null){
                gjenstander[i] = gs;
                return returnVerdien;
            }
        }
        return 0;
    }

    public boolean erTomt(){
        for(Gjenstand g :gjenstander){
            if(g != null){
                return false;
            }
        }
        return true;
    }

    public boolean harPlass(){
        for(Gjenstand g:gjenstander){
            if(g == null){
                return true;
            }
        }
        return false;
    }
    private void ikkeSamme(Gjenstand legg){
        for (Gjenstand g :gjenstander ) {
            assert (g!=legg);
            }
    }
}
