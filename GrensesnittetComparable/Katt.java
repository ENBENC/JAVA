class Katt implements Comparable<Katt>{
    String navn;
    int alder;
    public Katt(String n, int a){
        navn = n;
        alder = a;
    }
    public String hentNavn(){
        return navn;
    }
    public int hentAlder(){
        return alder;
    }
    @Override
    public String toString(){
        return "Navn: " + hentNavn() + " Alder: " + hentAlder();
    }
    @Override
    public int compareTo(Katt otherObj){
        if(hentAlder() < otherObj.hentAlder()){
            return -1;
        }
        if(hentAlder() > otherObj.hentAlder()){
            return 1;
        }
        return 0;
    }
}
