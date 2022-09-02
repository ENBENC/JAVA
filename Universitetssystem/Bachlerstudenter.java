class Bachlerstudentere extends Studenter{
    protected boolean tilgang;
    public Bachlerstudentere(String n, int a, String k,String l){
        super(n,a,k,l);
        tilgang = false;
    }
}
