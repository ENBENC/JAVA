import java.util.ArrayList;
import java.util.concurrent.locks.*;
class Monitor{
    Lock laas = new ReentrantLock();
    ArrayList<String> liste;
    public Monitor(ArrayList<String> l){
        liste = l;
    }

    public String hentOrd(){
        laas.lock();
        try {
            //Stopper løkken i tråden.
            if(liste.size() == 0){
                return null;
            }
            else{
                String returnOrd = liste.get(liste.size()-1);
                liste.remove(liste.size()-1);
                return returnOrd;
            }
        }
        finally{
            laas.unlock();
        }
    }

}
