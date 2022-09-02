class TestBaathus{
    public static void main(String[] args){
        Baathus baathus1 = new Baathus(3);
        Baat baat1 = new Baat("baat1");
        Baat baat2 = new Baat("baat2");
        Baat baat3 = new Baat("baat3");
        Baat baat4 = new Baat("baat4");

        baathus1.settInn(baat1);
        baathus1.settInn(baat2);
        baathus1.settInn(baat3);
        baathus1.settInn(baat4);
        System.out.println("");
        baathus1.skrivBaater();

    }
}
