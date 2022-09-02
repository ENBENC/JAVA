import java.util.Iterator;
class KullListe extends Kull{
    public KullListe(Hund f, Hund m){
        super(f,m);
    }

    Hund startHund = null;
    @Override
    public void settInn(Hund hund){
        //plasser på forste plass, dersom liste er tomt
        if(startHund == null){
            startHund = hund;
            return;
        }
        Hund peker = startHund;
        Hund forrige = null;
        while(peker!= null){
            //Plasser h foran peker

            if(peker.compareTo(hund) <= 0){
                if(forrige == null){
                    hund.neste = peker;
                    startHund = hund;
                    return;
                }
                else{
                    hund.neste = peker;
                    forrige.neste = hund;
                    return;
                }
            }
            forrige = peker;
            peker = peker.neste;
        }
        //Dersom gikk gjennom hele liste og h er eldest, plasser den på siste plass
        forrige.neste = hund;
        hund.neste = null;
    }
    @Override
    public Iterator<Hund> iterator(){
        return new IteratorHund(startHund);
    }

    protected class IteratorHund implements Iterator<Hund>{
        private Hund start;
        public IteratorHund(Hund s){
            start = s;
        }
        public Hund next(){
            Hund lever = start;
            start = start.neste;
            return lever;
        }
        public boolean hasNext(){
            if(start != null){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
