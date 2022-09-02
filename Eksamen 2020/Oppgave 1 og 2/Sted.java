//Oppgave 2d
class Sted{
    private Skattkiste skattkiste;
    private String beskrivelse;
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
    public Skattkiste hentSkattkiste(){
        return skattkiste;
    }
    public Sted gaaVidere(){
        return framOver;
    }
    @Override
    public String toString(){
        return "Sted: " + beskrivelse;
    }
}
