class Main{
    public static void main(String[] args) {
        Tidspunkt tid1 = new Tidspunkt(2015,3,2,3,12,12);
        Tidspunkt tid2 = new Tidspunkt(2000,3,1,3,12,1);
        Tidspunkt tid3 = new Tidspunkt(1999,3,1,3,12,1);
        Tidspunkt tid4 = new Tidspunkt(2016,3,2,3,12,30);
        Tidspunkt tid5 = new Tidspunkt(1993,3,2,3,12,30);
        Tidspunkt tid6 = new Tidspunkt(2020,3,2,3,12,30);

        KullListe ingenFarmor = new KullListe(null,null);
        Hund hund1 = new Hund(ingenFarmor,"Hund1",tid2);
        Hund hund2 = new Hund(ingenFarmor,"Hund2",tid3);

        KullListe k1 = new KullListe(hund1,hund2);
        Hund hund3 = new Hund(k1,"Hund3",tid1);

        Hund hund5 = new Hund(ingenFarmor,"Hund5",tid5);
        KullListe k3 = new KullListe(null,hund5);
        Hund hund6 = new Hund(k3,"Hund6",tid2);
        Hund hund4 = new Hund(ingenFarmor,"Hund4",tid4);
        KullListe k2 = new KullListe(hund6,hund4);

        Hund mor = new Hund(k2,"mor",tid1);
        Hund far = new Hund(k1,"far",tid4);

        KullListe siste = new KullListe(far,mor);
        Hund denne = new Hund(siste,"denne",tid6);
        //System.out.println(denne.finnEldsteKjenteOpphav());

        KullListe liste = new KullListe(null,null);
        liste.settInn(hund1);liste.settInn(hund2);liste.settInn(hund3);
        liste.settInn(hund4);liste.settInn(hund5);liste.settInn(hund6);


        KullListe k10 = new KullListe(hund1,hund2);
        Hund bror = new Hund(k1,"bror",tid6);
        Hund soster = new Hund(k1,"soster",tid6);
        Hund halvSoster = new Hund(k10,"halvSoster",tid6);
        System.out.println(bror.erHalvsosken(halvSoster));
    }
}
