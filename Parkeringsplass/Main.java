class Main{
    public static void main(String[] args) {
        Bil bil = new Bil("1212131",5);
        Motorsykkel motorsykkel = new Motorsykkel("2123121",300);
        Parkeringshus hus = new Parkeringshus();

        for(int i = 0; i < 11; i++){
            hus.settInnEtasje2(new Parkeringsplass());
        }
        for(int i = 0; i < 11; i++){
            hus.settInnEtasje1(new Parkeringsplass());
        }
        for(int i = 0; i< 10; i++){
            String registreringsnummer = "" + i;
            hus.hentEtasje1(i).settInnKjoreToy(new Bil(registreringsnummer,5));
        }
        for(int i = 0; i< 10; i++){
            String registreringsnummer = "" + i;
            hus.hentEtasje2(i).settInnKjoreToy(new Motorsykkel(registreringsnummer,300));
        }
        for(int i = 0; i< 10; i++){
            String registreringsnummer = "" + i;
            System.out.println(hus.hentEtasje1(i).hentUtKjoreToy());
        }
        for(int i = 0; i< 10; i++){
            String registreringsnummer = "" + i;
            System.out.println(hus.hentEtasje2(i).hentUtKjoreToy());
        }

    }
}
