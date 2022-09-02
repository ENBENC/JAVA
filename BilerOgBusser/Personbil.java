class Personbil extends Kjoretoy{
    protected int sitteplasser;
    public Personbil(String r, String f, String e, int s){
        super(r,f,e);
        sitteplasser = s;
    }

    public int hentSitteplasser(){
        return sitteplasser;
    }

    public int aarsavgift(){
        return 3000;
    }


    @Override
    public String toString(){
        return "Personbil: " + super.toString() + "Sitteplasser: " + hentSitteplasser() + "\n";
    }

}
