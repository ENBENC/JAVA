class Test{
    public static void main(String[] args){
        TestObjekt i = new TestObjekt();
        if(i.add() == true){
            i.add();
        }
        System.out.println(i.skrivUt());
    }
}
