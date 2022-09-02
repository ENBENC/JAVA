class BokstavTeller implements Runnable{
    private Monitor monitor;
    private char bokstav;
    public BokstavTeller(Monitor m, char b){
        monitor = m;
        bokstav = b;
    }
    @Override
    public void run(){
        String ord = monitor.hentOrd();
        while(ord != null){
            char[] charListe = ord.toCharArray();
            int antallBokstav = 0;
            for (char b :charListe ) {
                if(b == bokstav){
                    antallBokstav++;
                }
            }
            Thread traad = Thread.currentThread();
            System.out.println("ID traad " + traad.getId() + ": " +
            "Ord " + ord + " inneholder " + antallBokstav + " " + bokstav);
            //Henter et nytt ord
            ord = monitor.hentOrd();
        }
    }
}
