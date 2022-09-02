import java.util.ArrayList;
class Brev{
    private String avsender;
    private String mottaker;
    ArrayList<String> linjer;
    public Brev(String av,String mot){
        avsender = av;
        mottaker = mot;
        linjer = new ArrayList<String>();
    }

    public void skrivLinje(String en_linje){
        linjer.add(en_linje);
    }
    public void lesBrev(){
        System.out.println("Hei " + mottaker);
        System.out.println();
        for(String i:linjer){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Hilsen fra ");
        System.out.println(avsender);
    }
}
