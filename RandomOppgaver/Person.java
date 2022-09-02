class Person{
    private int alder;
    private String navn;
    public Person(int alderen, String navnet){
        alder = alderen;
        navn = navnet;
    }
    public void skrivUt(){
        System.out.println(navn + " " +  alder);
    }
    public void harBursdag(){
        alder ++;
    }
}
