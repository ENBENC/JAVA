import java.util.concurrent.locks.*;
class StemmeBoks{
    private final Lock laas = new ReentrantLock();
    private String[] stemmeBoksen = new String[435];
    private int antallStemmeGrot = 0;
    private int antallStemmePannekake = 0;
//Kritisk område, der en og en elev kan stemme omgangen.
    public void stemme(String stemmen,int id){
        laas.lock();
        try {
            stemmeBoksen[id] = stemmen;
        }
        finally{
            laas.unlock();
        }
    }
//Teller antall stemmer, og bestemmer resultaten.
    public String telleStemmen(){
        for(String stemme:stemmeBoksen){
            if(stemme.equals("Grot")){
                antallStemmeGrot ++;
            }
            else{
                antallStemmePannekake ++;
            }
        }
        if(antallStemmePannekake > antallStemmeGrot){
            return "Pannekake " + antallStemmePannekake;
        }
        else if(antallStemmePannekake < antallStemmeGrot){
            return "Grot " + antallStemmeGrot;
        }
        else{
            return "Uavgjordt";
        }
    }
}
