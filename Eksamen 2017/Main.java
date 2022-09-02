class Main{
    public static void main(String[] args) {
        PasientTabell liste = new PasientTabell(6);
        MannligPasient p0 = new MannligPasient("O","1991",0);
        MannligPasient p00 = new MannligPasient("Ol","1987",0);

        MannligPasient p1 = new MannligPasient("A","1985",1);

        MannligPasient p10 = new MannligPasient("S","1932",10);
        MannligPasient p100 = new MannligPasient("S1","1932",10);
        MannligPasient p1000 = new MannligPasient("S2","1932",10);

        liste.settInnPasient(p0);//0
        liste.settInnPasient(p00);//1
        liste.settInnPasient(p1);//2
        liste.settInnPasient(p10);//3
        liste.settInnPasient(p100);//4
        liste.settInnPasient(p1000);//5
        liste.skrivUt();


        System.out.println(liste.hentUt(0).navn);//p0 O
        System.out.println(liste.hentUt(1).navn);//p00 Ol
        System.out.println(liste.hentUt(0));//null

        System.out.println();

        System.out.println(liste.hentUt(p1).navn);//p1 A
        System.out.println(liste.hentUt(2));//null
        System.out.println();

        System.out.println(liste.hentUt(p10).navn);//p10
        System.out.println(liste.hentUt(3));
        System.out.println(liste.hentUt(p1000).navn);
        System.out.println(liste.hentUt(3));
        System.out.println(liste.hentUt(5));
        System.out.println(liste.hentUt(4).navn);
        System.out.println();
        liste.skrivUt();





    }
}
