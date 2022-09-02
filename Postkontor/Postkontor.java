import java.util.concurrent.locks.*;
import java.util.ArrayList;
class Postkontor{
    private final Lock laas = new ReentrantLock();
    private ArrayList<Post> postene = new ArrayList<Post>();
    Condition ikkeTom = laas.newCondition();
    public void leverPost(Post p){
        laas.lock();
        try{
            postene.add(p);
            System.out.println("Sett inn et brev" + p.hentInnhold());
            ikkeTom.signalAll();
        }
        finally{
            laas.unlock();
        }
    }

    public Post hentPost(Kunde kunde){
        laas.lock();
        try{
            while(postene.size() == 0){
                ikkeTom.await();
            }
            for(int i = 0;i< postene.size();i++){
                Post p = postene.get(i);
                if(p.hentMottaker().equals(kunde.hentNavn())){
                    postene.remove(i);
                    return p;
                }
            }
        }
        catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        finally{
            laas.unlock();
        }
        return null;
    }
}
