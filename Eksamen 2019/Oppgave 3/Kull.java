import java.util.Iterator;
abstract class Kull implements Iterable<Hund>{
    Hund mor, far;
    public Kull(Hund f,Hund m){
        far = f;
        mor = m;
    }
    abstract public void settInn(Hund h);
    public abstract Iterator<Hund> iterator();
}
