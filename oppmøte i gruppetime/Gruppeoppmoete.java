import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
class Gruppeoppmoete{
    private String [] navn;
    private boolean [] oppmote;
    public Gruppeoppmoete(int antall_student, String filnavn) throws FileNotFoundException{
        navn = new String[antall_student];
        oppmote = new boolean[antall_student];

        File file = new File(filnavn);
        Scanner lesFil = new Scanner(file);
        int teller = 0;
        while(lesFil.hasNextLine()){
            String linje = lesFil.nextLine().trim();
            navn[teller] = linje;
            oppmote[teller] = false;
            teller ++;
        }
    }

    public void register(String en_navn){
        boolean put = false;
        for(int i=0;i< navn.length;i++){
            if(navn[i].equals(en_navn) == true & put == false){
                oppmote[i] = true;
                put = true;
            }
        }
        if(put == false){
            System.out.println("Studenten finnes ikke.");
        }
    }

    public void skrivUtOppmote(){
        for(int i=0; i<navn.length;i++){
            System.out.println("Student: " + navn[i]);
            System.out.println("Oppmote: " + oppmote[i]);
        }
    }
}
