class Main{
    public static void main(String[] args) {
        TallMonitor m = new TallMonitor(0,0);
        Oppover tellOpp = new Oppover(m);
        Nedover tellNed = new Nedover(m);
        Thread opp = new Thread(tellOpp);
        Thread ned = new Thread(tellNed);
        opp.start();
        ned.start();

    }
}
