class Parkeringshus{
    Parkeringsplass[] etasje1 = new Parkeringsplass[10];
    Parkeringsplass[] etasje2 = new Parkeringsplass[10];

    public boolean settInnEtasje1(Parkeringsplass p){
        boolean put = false;
        for(int i = 0; i < etasje1.length; i++){
            if(etasje1[i] == null && put == false){
                etasje1[i] = p;
                put = true;
            }
        }
        return put;
    }

    public boolean settInnEtasje2(Parkeringsplass p){
        boolean put = false;
        for(int i = 0; i < etasje2.length; i++){
            if(etasje2[i] == null && put == false){
                etasje2[i] = p;
                put = true;
            }
        }
        return put;
    }
    public Parkeringsplass hentEtasje1(int pos){
        Parkeringsplass hent = etasje1[pos];
        return hent;
    }
    public Parkeringsplass hentEtasje2(int pos){
        Parkeringsplass hent = etasje2[pos];
        return hent;
    }
}
