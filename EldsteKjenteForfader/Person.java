class Person implements Comparable<Person>{
    String navn;
    int fodselsaar;
    Person mor;
    Person far;
    public Person(int fodselsaar,String navn, Person mor, Person far){
        this.navn = navn;
        this.fodselsaar = fodselsaar;
        this.mor = mor;
        this.far = far;
    }
    public String hentNavn(){
        return navn;
    }
    public int hentFodselsaar(){
        return fodselsaar;
    }
    @Override
    public String toString(){
        return "Navn: " + navn + "\n" +
                "Fodselsaar: " + fodselsaar +"\n";
    }
    @Override
    public int compareTo(Person p){
        if(fodselsaar > p.hentFodselsaar()){//Dersom fodselsaar er storre betyr personen er ikke eldste av this.p og p= -1.
            return -1;//-1 betyr this.person er mindre en p.
        }
        if(fodselsaar < p.hentFodselsaar()){
            return 1;//1 betyr this.person er storre enn p.
        }
        return 0;
    }
    public Person finnEldsteKjenteForfader(){
        if(mor == null && far == null){//Basissteget.
            return this; //Personen selv er den eldste dersom den ikke har mor eller far.
        }
        Person farside = far;
        Person morside = mor;
        if(far != null){//condisjonsjekk som starter rekursjon.
            farside = far.finnEldsteKjenteForfader();//Rekursiv steget.
        }
        if(mor != null){//condisjonsjekk, som starter rekursjon.
            morside = mor.finnEldsteKjenteForfader();//Rekursivsteget.
        }
        if(farside == null){
            return morside;
        }
        if(morside == null){
            return farside;
        }
        if(farside.compareTo(morside) > 0){
            return farside;
        }
        else{
            return morside;
        }

    }

}
