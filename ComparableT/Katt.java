class Katt{
    private String navn;
    private int alder;
    public Katt(String n, int a){
        navn = n;
        alder = a;
    }
    @Override
    public String toString(){
        return "Navn: " + navn +"\n" + "Alder: " + alder + "\n";
    }
}
