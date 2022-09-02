//Oppgave6
//Oppretter kritiske regioner i Skattkiste,
//Slik bare en traad har tilgang til aa legge/ta ut gjenstand om gangen.
//Brukeren oppretter antall Spiller-objekt basert paa input til brukeren,
//og hvert Spiller-objekt ta imot en Robot-objekt
//Spille-klasse implementerer Runnable,
//i metoden run() fullfoerer nyttTrekk() med oppgitt totalTrekk i Spill.
//Synkroniseres med CountDownLatch, slik programmet venter til alle Spiller er ferdig med trekkene sine.
//Deretter blir vinneren funnet ut, og Resultatet printes ut.
//Endret paa Robot-klasse, for aa gi enklere print, i Spill er det endret slik bare Spillere med Robot blir laget
import java.util.concurrent.CountDownLatch;
class Spiller implements Runnable{
    private Sted lokasjon; protected Brukergrensesnitt brukegrensesnitt; protected String navn; protected CountDownLatch latch;
    protected int formue = 0;
    protected Skattkiste ryggsekk = new Skattkiste(10);
    protected boolean kommetTilslutt = false;
    protected int trekkIgjen;
    public Spiller(Sted startSted,Brukergrensesnitt b,String n, int antallTrekk,CountDownLatch l){
        lokasjon = startSted;
        brukegrensesnitt = b;
        navn = n;
        trekkIgjen = antallTrekk;
        latch = l;
    }
    public int hentFormue(){
        return formue;
    }
    public String hentNavnSpiller(){
        return navn;
    }
    public void run(){
        try{
            System.out.println(navn + " starter aa trekke");
            while(trekkIgjen>0){
                this.nyttTrekk();
                trekkIgjen--;
            }
            System.out.println(navn + " ferdig med alle trekkene.");
        }
        finally{
            latch.countDown();
        }
    }
    public void nyttTrekk(){
        if(kommetTilslutt){
            System.out.println(navn + " har kommet til slutt");
            return;
        }
        String s1 = "Vil du selge noen i ryggsekken?";
        String s2 = "Vil du trekke en gjenstand fra skattekisten?";
        String s3 = "Velg en utgang til neste sted";
        String[] alternativer = {"Ja","Nei"};
        String[] alternativer2  = {"FramOver"};

        Skattkiste lokasjonKiste = lokasjon.hentSkattkiste();
        String status = "Spilleren: " + navn + "\n" +
                        "Lokasjon: " + lokasjon + "\n"+
                        "Formue: " + formue + "\n";
        brukegrensesnitt.giStatus(status);
        //Hvis det er gjenstand i ryggsekk, og kiste i stedet har plass
        //saa kan brukeren selges en random gjenstand i ryggsekken
        if(!ryggsekk.erTomt() && lokasjonKiste.harPlass()){
            int svar = brukegrensesnitt.beOmKommando(s1,alternativer);
            if(svar == 0){
                Gjenstand selg = ryggsekk.taUt();
                int verdi = lokasjonKiste.leggeTil(selg);
                formue += verdi;
            }
            else{
                System.out.println("Velger aa ikke gjore noe");
            }
        }
        //Hvis lokasjonKiste ikke er tomt, og ryggsekk har plass
        //saa kan spilleren velger aa trekke en gjenstand
        if(!lokasjonKiste.erTomt() && ryggsekk.harPlass()){
            int svar = brukegrensesnitt.beOmKommando(s2,alternativer);
            if(svar == 0){
                Gjenstand g = lokasjonKiste.taUt();
                ryggsekk.leggeTil(g);
            }
            else{
                System.out.println("Velger aa ikke gjore noe");
            }
        }
        //Her gaa spilleren videre
        int svar = brukegrensesnitt.beOmKommando(s3,alternativer2);
        if(svar == 0){
            lokasjon = lokasjon.gaaVidere();
            if(lokasjon == null){
                kommetTilslutt = true;
            }
        }
    }
}
