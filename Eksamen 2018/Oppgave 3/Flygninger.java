class Flygning{
    String seteinfo, flyNummer;
    public Flygning(String s,String f){
        seteinfo = s; flyNummer = f;

        String[] alleRader = seteinfo.split("|");
        Seterader[] seteRader = new Seterader[alleRader.length];
        for(int i=0;i<alleRader.length;i++){
            Seterader rad = new Seterader(alleRader[i]);
            seteRader[i] = rad;
        }
    }
    public String flightNo(){
        return flyNummer;
    }
    public boolean book(Passasjer pas){
        return false;
    }
    public boolean book(Passasjer pas,boolean foretrekkerVindu,boolean foretrekkerMidgang){
        return false;
    }
    public void skriv(){
        return;
    }
}
