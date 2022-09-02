class PasientPrio extends PasientAdm{
    private Pasient[] startArray;
    private Pasient[] sluttArray;
    public PasientPrio(){
        startArray = new Pasient[Pasient.MAXPASPRIO+1];
        sluttArray = new Pasient[Pasient.MAXPASPRIO+1];
    }

    @Override
    public void settInnPasient(Pasient p){
        int prioritetIndeks = p.prioritet;
        if(startArray[prioritetIndeks] == null){
            startArray[prioritetIndeks] = p;
            sluttArray[prioritetIndeks] = p;
        }
        else{
            sluttArray[prioritetIndeks].neste = p;
            sluttArray[prioritetIndeks] = p;
        }
    }
    @Override
    public Pasient hentUt(Pasient p){
        int i = p.prioritet;

        if(startArray[i] == null){
            return null;
        }
        else{
            Pasient peker = startArray[i];
            Pasient forrige = null;
            while(peker != null && peker != p){
                forrige = peker;
                peker = peker.neste;
            }
            if(peker == sluttArray[i] && peker == startArray[i]){
                sluttArray[i] = forrige;
                startArray[i] = peker.neste;
                return peker;

            }
            else if(peker == sluttArray[i]){
                sluttArray[i] = forrige;
                return peker;
            }
            else if(peker == startArray[i]){
                startArray[i] = peker.neste;
                return peker;
            }
            else{
                forrige.neste = peker.neste;
                return peker;
            }
        }
    }
    @Override
    public Pasient hentUt(int i){
        Pasient lever = startArray[i];
        if(lever == null){
            return lever;
        }
        else if(startArray[i] == sluttArray[i]){
            startArray[i] = lever.neste;
            sluttArray[i] = lever.neste;
            return lever;
        }
        else{
            startArray[i] = lever.neste;
            return lever;
        }
    }
}
