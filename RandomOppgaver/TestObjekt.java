class TestObjekt{
    private int indeks;
    public TestObjekt(){
        indeks = 0;
    }
    public boolean add(){
        indeks ++;
        return true;
    }
    public int skrivUt(){
        return indeks;
    }
}
