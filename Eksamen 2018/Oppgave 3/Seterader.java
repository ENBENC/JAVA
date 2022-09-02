class Seterader{
    private String radInformasjon; String radNummer;
    Seter[] alleSeter;
    public Seterader(String r){
        radInformasjon = r;

        //Setter radNummer, og teller antall seter til raden
        String[] enRad = radInformasjon.split(":");
        radNummer = enRad[0];
        int antallSeter = 0;
        for(int i =0;i<enRad[1].length();i++){
            if(enRad[1].charAt(i)!= '*'&&enRad[1].charAt(i)!='+'){
                antallSeter ++;
            }
        }
        Seter[] seterArray = new Seter[antallSeter];



    }
}
