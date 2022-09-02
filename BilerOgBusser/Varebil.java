class Varebil extends Kjoretoy{
    protected int maks_lastvekt;
    public Varebil(String r, String f, String e, int v){
        super(r,f,e);
        maks_lastvekt = v;
    }
    public int hentMaksLastVekt(){
        return maks_lastvekt;
    }

    public int aarsavgift(){
        return (maks_lastvekt * 4);
    }

    @Override
    public String toString(){
        return "Varebil: " + super.toString() + "Maks lastvekt: " + hentMaksLastVekt() + "\n";
    }
}
