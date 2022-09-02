class Spiller{
    private Sted lokasjon; private Brukergrensesnitt brukegrensesnitt; private String navn;
    private int formue = 0;
    private Skattkiste ryggsekk = new Skattkiste(10);
    public Spiller(Sted startSted,Brukergrensesnitt b,String n){
        lokasjon = startSted;
        brukegrensesnitt = b;
        navn = n;
    }
    public int hentFormue(){
        return formue;
    }
    public String hentNavnSpiller(){
        return navn;
    }
    public void nyttTrekk(){
        String s1 = "Vil du selge noen i ryggsekken?";
        String s2 = "Vil du trekke en gjenstand fra skattekisten?";
        String s3 = "Velg en utgang til neste sted";
        String[] alternativer = {"Ja","Nei"};
        String[] alternativer2  = {"FramOver"};

        Skattkiste lokasjonKiste = lokasjon.hentSkattkiste();
        String status = "Spilleren: " + navn + "\n" +
                        "Lokasjon: " + lokasjon + "\n"+
                        "Formue: " + formue + "\n";
        brukegrensesnitt.giStatus(status);
        System.out.println("---------------------------------------------");
        //Hvis det er gjenstand i ryggsekk, og kiste i stedet har plass
        //saa kan brukeren selges en random gjenstand i ryggsekken
        if(!ryggsekk.erTomt() && lokasjonKiste.harPlass()){
            int svar = brukegrensesnitt.beOmKommando(s1,alternativer);
            if(svar == 0){
                Gjenstand selg = ryggsekk.taUt();
                int verdi = lokasjonKiste.leggeTil(selg);
                formue += verdi;
            }
            else{
                System.out.println("Velger aa ikke gjore noe");
            }
        }
        //Hvis lokasjonKiste ikke er tomt, og ryggsekk har plass
        //saa kan spilleren velger aa trekke en gjenstand
        if(!lokasjonKiste.erTomt() && ryggsekk.harPlass()){
            int svar = brukegrensesnitt.beOmKommando(s2,alternativer);
            if(svar == 0){
                Gjenstand g = lokasjonKiste.taUt();
                ryggsekk.leggeTil(g);
            }
            else{
                System.out.println("Velger aa ikke gjore noe");
            }
        }
        //Her gaa spilleren videre
        int svar = brukegrensesnitt.beOmKommando(s3,alternativer2);
        if(svar == 0){
            lokasjon = lokasjon.gaaVidere();
        }
    }
}
