class Baathus{
    private Baat[] baater;
    private int antallPlasser;
    public Baathus(int antall){
        baater = new Baat[antall];
        antallPlasser = antall;
    }
    public void settInn(Baat baat){
        boolean klart = false;
        for(int i = 0; i < baater.length; i++){
            if(baater[i] == null && klart == false){
                baater[i] = baat;
                System.out.println("Legget til en baat.");
                klart = true;
            }
        }
        if (klart == false){
            System.out.println("Baathus er full.");
        }
    }

    public void skrivBaater(){
        for(int i = 0; i < baater.length; i++){
            if(baater[i] != null){
                System.out.println(baater[i].hentInfo());
            }
        }
    }

}
