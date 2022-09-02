class Nedover implements Runnable{
    private final TallMonitor monitor;
    public Nedover(TallMonitor m){
        monitor = m;
    }
    public void run(){
        //int teller = Integer.MAX_VALUE;
        int teller = 1000;
        while(monitor.settStorste(teller)){
            teller--;
            System.out.println(teller);
        }
        System.out.println("Storst: " + monitor.hentStorst());
    }
}
