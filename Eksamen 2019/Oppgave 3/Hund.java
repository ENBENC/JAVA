class Hund implements Comparable<Hund>{
    String navn; Kull mittKull; Tidspunkt minFodselstid;
    Hund neste = null;
    Hund(Kull k,String navn, Tidspunkt fodt){
        this.navn = navn;
        mittKull = k;
        minFodselstid = fodt;
    }

    //Oppgave 2b
    @Override
    public int compareTo(Hund h){
        //Dersom minFodselstid > h.minFodselstid gir 1, this født senere h
        //minFodselstid < h.minFodselstid gir -1, this født før h
        //minFodselstid = h.minFodselstid gir 0, this like gamel som annen hund
        return minFodselstid.compareTo(h.minFodselstid);
    }
    //Oppgave 2a
    public Hund mor(){
        return mittKull.mor;
    }
    //Oppgave 2a
    public Hund far(){
        return mittKull.far;
    }
    //Oppgave 2c
    //Gir true dersom this og h har samme mor og far
    public boolean erHelsosken(Hund h){
        if(this.mor() != null && this.far() != null&& this.mor() == h.mor() && this.far() == h.far()){
            return true;
        }
        else{
            return false;
        }
    }
    //Oppgave 2c
    //Gir true, samme far, eller samme mor, false ellers(inkludert samme mor og far, eller ikke samme mor og far)
    public boolean erHalvsosken(Hund h){
        if(far()==h.far() && mor()!=h.mor()){
            if(far()!= null){
                return true;
            }
            return false;
        }
        if(mor()==h.mor()&&far()!=h.far()){
            if(mor()!=null){
                return true;
            }
            return false;
        }
        return false;
    }
    //Oppgave 2d
    public Hund finnEldsteKjenteOpphav(){
        Hund eldsteMorLinje = null;
        Hund eldsteFarLinje = null;
        //Basisk steget
        //Dersom hunden this, ikke har noen mor eller far, saa er this den eldste
        if(this.mor() == null && this.far() == null){
            return this;
        }

        //Rekursivsteget
        //Finne eldste i far-linje, returner far-linje dersom mor til this er null
        if(this.far() != null){
            eldsteFarLinje = far().finnEldsteKjenteOpphav();
            if(mor() == null){
                return eldsteFarLinje;
            }
        }
        //Finne eldste i mor-linje, returner mor-linje dersom mor til this er null
        if(this.mor() != null){
            eldsteMorLinje = mor().finnEldsteKjenteOpphav();
            if(far() == null){
                return eldsteMorLinje;
            }
        }
        if(eldsteFarLinje.compareTo(eldsteMorLinje) < 0){
            return eldsteFarLinje;
        }
        //Her er enten eldsteMorLinje eldst eller begge er like, men vi velge da aa bare returner eldsteMorLinje
        else{
            return eldsteMorLinje;
        }
    }
    @Override
    public String toString(){
        return navn+": " + minFodselstid.toString();
    }
}
