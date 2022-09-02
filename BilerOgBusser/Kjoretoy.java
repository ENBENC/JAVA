abstract class Kjoretoy{
    protected String registreringsnummer;
    protected String fabrikkmerke;
    protected  String eieren;
    public Kjoretoy(String r, String f, String e){
        registreringsnummer = r;
        fabrikkmerke = f;
        eieren = e;
    }

    public String hentRegistreringsnummer(){
        return registreringsnummer;
    }

    public String hentFabrikkmerke(){
        return fabrikkmerke;
    }

    public String hentEieren(){
        return eieren;
    }
    @Override
    public String toString(){
        return "Registreringsnummer: " + hentRegistreringsnummer() + "\n"
        + "Fabrikkmerke: " + hentFabrikkmerke() + "\n"
        + "Eieren: " + hentEieren() + "\n"; 
    }
}
