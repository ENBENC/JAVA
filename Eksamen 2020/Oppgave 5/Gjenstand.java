class Gjenstand{
    private String navn;
    private int verdi;
    public Gjenstand(String n,int v){
        navn = n; verdi = v;
    }
    public int hentVerdi(){
        return verdi;
    }
    @Override
    public String toString(){
        return navn +": "+verdi;
    }
}
