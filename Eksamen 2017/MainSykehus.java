class MainSykehus{
    public static void main(String[] args) {
        KvinneligePasient p1 = new KvinneligePasient("Sur","1998",1);
        MannligPasient p2 = new MannligPasient("Smile","1932",0);

        Akutten akuttAvdeling = new Akutten();
        Sengepost sengepost = new Sengepost(90);
        Sykehus sykehus = new Sykehus(akuttAvdeling,sengepost);

        sykehus.skrivInn(p1,akuttAvdeling);
        sykehus.skrivInn(p2,akuttAvdeling);
        sykehus.overforing(p1,akuttAvdeling,sengepost);
        sykehus.skrivUt(p2,akuttAvdeling);

    }
}
