class BoolskeVerdier{
    public static void main(String[] args){
        boolean riktig = true, feil = false;
        System.out.println(riktig);
        System.out.println(feil);

        if (riktig == true && feil == false){
            System.out.println("Første test slo til!");
        }

        if (riktig == false && feil == true){
            System.out.println("Dette skal ikke skrives ut.");
        }
        else{
            System.out.println("Andre test slo ikke til!");
        }
    }
}
