class Test{
    public static void main(String[] args) {
        Kvadrater k1 = new Kvadrater(12);
        Trekant t1 = new Trekant(3,4);
        Sirkel s1 = new Sirkel(1);

        FigurBeholder<Sirkel> beholderSirkel = new FigurBeholder<Sirkel>();
        beholderSirkel.settInn(s1);
        System.out.println(beholderSirkel.taUt().areal() == 3.14);
        KvadratBeholder beholderKvadrat = new KvadratBeholder();
        beholderKvadrat.settInn(k1);
        System.out.println(beholderKvadrat.taUt().areal() == 144.0);
        FigurBeholder<Trekant> beholderTrekant = new FigurBeholder<Trekant>();
        beholderTrekant.settInn(t1);
        System.out.println(beholderTrekant.taUt().areal() == 6.0);
    }
}
