class Motorsykkel{
    private int kilometerstand;
    private String registreringsnummer;
    private int produksjonsnummer;
    private static int teller = 0;
    public Motorsykkel(String registreringsnummeret){
        kilometerstand = 0;
        registreringsnummer = registreringsnummeret;
        teller ++;
        produksjonsnummer = teller;
    }
    public int hentKilometerstand(){
        return kilometerstand;
    }
    public int hentProduksjonsnummer(){
        return produksjonsnummer;
    }
    public void kjor(int km){
        kilometerstand = kilometerstand + km;
    }

}
