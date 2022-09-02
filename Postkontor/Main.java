class Main{
    public static void main(String[] args) {
        Postkontor postkontor = new Postkontor();
        Postmann postmann = new Postmann(postkontor,"Per","Tor");
        Kunde tor = new Kunde("Tor",postkontor);
        Kunde per = new Kunde("Per",postkontor);
        Thread t1 = new Thread(postmann);
        Thread t2 = new Thread(tor);
        Thread t3 = new Thread(per);
        t1.start();
        t2.start();
        t3.start();
    }
}
