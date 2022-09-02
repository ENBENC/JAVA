class Oppover implements Runnable{
    private final TallMonitor monitor;
    public Oppover(TallMonitor m){
        monitor = m;
    }
    public void run(){
        //int teller = Integer.MIN_VALUE;
        int teller = -1000;
        while(monitor.settMinste(teller)){
            teller++;
            System.out.println(teller);
        }
        System.out.println("Minst : " + monitor.hentMinst());
    }
}
