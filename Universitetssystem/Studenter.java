class Studenter extends Person{
    protected String kurs;
    protected String larested;
    public Studenter(String n, int a, String k, String l){
        super(n,a);
        kurs = k;
        larested = l;
    }
}
