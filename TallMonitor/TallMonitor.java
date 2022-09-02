import java.util.concurrent.locks.*;
class TallMonitor{
    private final Lock laas = new ReentrantLock();
    private int detMinste;
    private int detStorste;
    public TallMonitor(int storst, int minst){
        if(minst > storst){
            detMinste = storst;
            detStorste = minst;
        }
        else{
            detStorste = storst;
            detMinste = minst;
        }
    }
    public int hentStorst(){
        return detStorste;
    }
    public int hentMinst(){
        return detMinste;
    }

    public boolean settMinste(int minst){
        laas.lock();
        try {
            if(minst < detStorste){
                detMinste = minst;
                return true;
            }
            else{
                return false;
            }
        }
        finally{
            laas.unlock();
        }
    }
    public boolean settStorste(int storst){
        laas.lock();
        try {
            if(storst > detMinste){
                detStorste = storst;
                return true;
            }
            else{
                return false;
            }
        }
        finally{
            laas.unlock();
        }
    }
}
