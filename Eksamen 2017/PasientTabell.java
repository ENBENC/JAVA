class PasientTabell extends PasientAdm{
    //Hvert indeks i array referer til en seng
    //Dersom array[i] = null, så betyr at sengen er ledig
    Pasient[] array;
    int indeks = 0;
    public PasientTabell(int max){
        array = new Pasient[max];
    }
    public void skrivUt(){
        for (int i=0;i<array.length;i++ ) {
            if(array[i]==null){
                System.out.println("null");
            }
            else{
                System.out.println("Pasient navn: " + array[i].navn + " pasient sengnr: " + array[i].sengNr+ " indeks: " +i );
            }
            }
    }

    @Override
    public void settInnPasient(Pasient p){
        while(indeks<array.length){
            if(array[indeks] == null){
                array[indeks] = p;
                p.sengNr = indeks;
                indeks++;
                return;
            }
            indeks++;
        }
        if(indeks == array.length){
            indeks = 0;
        }
    }
    @Override
    public Pasient hentUt(Pasient p){
        if(array[p.sengNr] != null){
            Pasient lever = array[p.sengNr];
            array[p.sengNr] = null;
            lever.sengNr = -1;
            return lever;
        }
        return null;
    }
    @Override
    public Pasient hentUt(int sengNummer){
        for (int i=0;i<array.length ;i++ ) {
            if(array[i] != null && sengNummer == array[i].sengNr){
                Pasient lever = array[i];
                lever.sengNr = -1;
                array[i] = null;
                return lever;
            }
        }
        return null;
    }
}
