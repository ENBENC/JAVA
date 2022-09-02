class Bil{
    String registreringsnummer;
    int antallPassasjerseter;
    public Bil(String r, int a){
        registreringsnummer = r;
        antallPassasjerseter = a;
    }
    public String hentRegistreringnr(){
        return registreringsnummer;
    }
    public int hentAntallPassasjerseter(){
        return antallPassasjerseter;
    }
    @Override
    public String toString(){
        return "Bil" + " Registreringsnummer: " + hentRegistreringnr() + " AntallPassasjerseter: " + hentAntallPassasjerseter();
    }
}
