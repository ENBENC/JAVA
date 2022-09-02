class Motorsykkel{
    String registreringsnummer;
    int storrelseIcm;
    public Motorsykkel(String r, int s){
        registreringsnummer = r;
        storrelseIcm = s;
    }
    public String hentRegistreringnr(){
        return registreringsnummer;
    }
    public int hentStorrelseIcm(){
        return storrelseIcm;
    }
    @Override
    public String toString(){
        return "Motorsykkel " + "Registreringsnummer: " + hentRegistreringnr() + " StorrelseIcm: " + hentStorrelseIcm();
    }
}
