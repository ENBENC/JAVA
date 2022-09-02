class Buss extends Kjoretoy{
    protected int sitteplasser;
    public Buss(String r, String f, String e, int s){
        super(r,f,e);
        sitteplasser = s;
    }
    public int hentSitteplasser(){
        return sitteplasser;
    }
    @Override
    public String toString(){
        return "Buss: " + super.toString() + "Sitteplasser: " + hentSitteplasser() + "\n";
    }
}
