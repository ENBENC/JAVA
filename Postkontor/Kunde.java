class Kunde implements Runnable{
    private String navn;
    private Postkontor monitor;
    public Kunde(String n, Postkontor m){
        navn = n;
        monitor = m;
    }
    public String hentNavn(){
        return navn;
    }
    @Override
    public void run(){
        Post p = monitor.hentPost(this);
        while(p !=null ){
            System.out.println(navn + " henter: " + p.hentInnhold() + " mottaker: " + p.hentMottaker());
            p = monitor.hentPost(this);
        }
    }
}
