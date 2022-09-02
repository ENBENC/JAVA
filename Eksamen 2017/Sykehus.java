class Sykehus{
    Akutten akuttAvdeling;
    Sengepost sengepost;
    public Sykehus(Akutten a,Sengepost s){
        akuttAvdeling = a;
        sengepost = s;
    }

    public void skrivInn(Pasient p, Avdeling avdelig){
        avdelig.settInn(p);
    }
    public void skrivUt(Pasient p, Avdeling avdelig){
        avdelig.hentUt(p);
    }
    public void overforing(Pasient p, Avdeling fra,Avdeling til){
        //Hvis for ikke til aa hente ut personen
        if(fra.hentUt(p)!=null){
            til.settInn(p);
        }
    }
}
