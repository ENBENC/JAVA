class Sted{
    protected Skattkiste skattkiste;
    protected String beskrivelse;
    private Sted framOver = null;
    public Sted(String b){
        beskrivelse = b;
    }
    //settUtgang() kalles i Terreng, der Stedene blir lenket sammen.
    public void settUtgang(Sted f){
        framOver = f;
    }
    public void plasserSkattkiste(Skattkiste s){
        skattkiste = s;
    }

    public Sted gaaVidere(){
        return framOver;
    }

    public Skattkiste hentSkattkiste(){
        return skattkiste;
    }
    @Override
    public String toString(){
        return beskrivelse;
    }
}
