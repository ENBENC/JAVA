abstract class Avdeling{
    PasientAdm liste;

    public void settInn(Pasient p){
        liste.settInnPasient(p);
    }
    public Pasient hentUt(Pasient p){
        return liste.hentUt(p);
    }
    public Pasient hentUt(int i){
        return liste.hentUt(i);
    }
}
