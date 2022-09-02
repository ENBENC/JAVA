class VeivalgSpiller extends Spiller{
    private VeivalgSted lokasjon;
    public VeivalgSpiller(VeivalgSted startSted, Brukergrensesnitt b,String n){
        super(startSted,b,n);
        lokasjon = startSted;
    }
    @Override
    public void nyttTrekk(){
        //kommetTilslutt er definert i Spiller-klasse
        //Sjekker om spilleren gaa videre paa den siste stedet i spillet, dersom spilleren har gjort det,
        //Saa maa spilleren vente til andre spillerene er ferdig, og denne spilleren skal ikke gjore noe i sin trekk
        if(kommetTilslutt){
            System.out.println(navn + " har kommet til slutt");
            return;
        }
        String s1 = "Vil du selge noen i ryggsekken?";
        String s2 = "Vil du trekke en gjenstand fra skattekisten?";
        String s3 = "Velg en utgang til neste sted" + "\n" + lokasjon.utgangBeskrivelse();
        String[] alternativer = {"Ja","Nei"};
        String[] alternativer2  = {"Venstre","rettFrem","Hoeyre"};

        Skattkiste lokasjonKiste = lokasjon.hentSkattkiste();
        String status = "Spilleren: " + navn + "\n" +
                        "Lokasjon: " + lokasjon + "\n"+
                        "Formue: " + formue + "\n";
        brukegrensesnitt.giStatus(status);
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
        lokasjon = lokasjon.gaaVidere(svar);
        //Hvis lokasjon er null, har spilleren kommet seg ut av spillet
        if(lokasjon == null){
            kommetTilslutt = true;
        }
    }
}
