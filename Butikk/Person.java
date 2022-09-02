class Person{
    private String navn;
    private String gjenstand;
    private Person neste;
    public Person(String navn, String gjenstand){
        this.navn = navn;
        this.gjenstand = gjenstand;
        this.neste = null;
    }

    public void settNeste(Person neste){
        this.neste = neste;
    }
    public Person hentNestePerson(){
        return neste;
    }
    @Override
    public String toString(){
        return navn + " kjoper gjenstand  " + gjenstand + ".";
    }
}
