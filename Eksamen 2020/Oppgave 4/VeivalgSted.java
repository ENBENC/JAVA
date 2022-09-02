//Oppgave4b
class VeivalgSted extends Sted{
    private VeivalgSted[] utganger = new VeivalgSted[3];
    public VeivalgSted(String b){
        super(b);
    }
    public void settUtgang(VeivalgSted venstre,VeivalgSted rettFrem,VeivalgSted hoeyre){
        utganger[0] = venstre; utganger[1] = rettFrem; utganger[2] = hoeyre;
    }

    public VeivalgSted gaaVidere(int gaa){
        //Dette vil return null, dersom spilleren kommer til siste Sted
        return utganger[gaa];
    }

    public String utgangBeskrivelse(){
        String tekst;
        if(utganger[1] == null){
            tekst = "Venstre: " + utganger[0] +"\n"+
                    "Rett Frem: " + "Slutten av veien"+ "\n"+
                    "Hoeyre: " + utganger[2] +"\n";
        }
        else{
            tekst = "Venstre: " + utganger[0] +"\n"+
                    "Rett Frem: " + utganger[1] +"\n"+
                    "Hoeyre: " + utganger[2] +"\n";
        }
        return tekst;
    }
}
