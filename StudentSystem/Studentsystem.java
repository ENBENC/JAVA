import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

class Studentsystem{
    private String emneNavn;
    private HashMap<String, ArrayList<String>> emneProgram;
    private ArrayList<String> alle_studentNavn = new ArrayList<String>();
    //Arraylist med alle student navn
    public Studentsystem(String filnavn) throws FileNotFoundException{
        emneProgram = new HashMap<String,ArrayList<String>>();
        File fil = new File(filnavn);
        Scanner lesFil = new Scanner(fil);
        while(lesFil.hasNextLine()){
            boolean put = false;
            String ord = lesFil.nextLine().trim();
            String[] ord_array = ord.split("");
            if(ord_array[0].equals("*")){
                emneNavn = ord;
                ArrayList<String> e = new ArrayList<String>();
                emneProgram.put(emneNavn,e);
            }
            else{
                for(String key: emneProgram.keySet()){
                if(emneNavn.equals(key)){
                    emneProgram.get(key).add(ord);
                    }
                }

                for(String navn:alle_studentNavn){
                    if(ord.equals(navn)){
                        put = true;
                    }//sjekker om student navnet allerede er inne i alle_studentNavn.
                }

                if(put == false){
                    alle_studentNavn.add(ord);
                }//navnet ikke er i alle_studentNavn, saa blir navnet addet.

            }
        }
    }

    public String fagMedFlestStudnet(){
        int flest_student = 0;
        String emne_med_flest_student = "";
        for(String key:emneProgram.keySet()){
            if(flest_student < emneProgram.get(key).size()){
                flest_student = emneProgram.get(key).size();
                emne_med_flest_student = key;
            }
        }
        return emne_med_flest_student;
    }

    public String studentSomTarFlestFag(){
        String student_flest_fag_navn = "";
        int flest_fag = 0;
        HashMap<String, Integer> studenter = new HashMap<String,Integer>();

        for(String navn:alle_studentNavn){
            studenter.put(navn,0);
        }//lage en HashMap med student navn som key, og antall fag som value

        for(String teller_navn: studenter.keySet()){
            for(String key:emneProgram.keySet()){
                for(String navn:emneProgram.get(key)){
                    if(teller_navn.equals(navn)){
                        studenter.put(teller_navn,studenter.get(teller_navn)+1);
                    }
                }
            }
        }
        //går gjennom hele emneProgram for aa bygge opp HashMap
        //tilslutt finne student med flest fag
        for(String key:studenter.keySet()){
            if(studenter.get(key) > flest_fag){
                student_flest_fag_navn = key;
                flest_fag = studenter.get(key);
            }
        }
        return student_flest_fag_navn;
    }

    public void skrivUtStudenterIFag(String emneNavnet){
        for(String key:emneProgram.keySet()){
            if(key.equals(emneNavnet)){
                for(String navn:emneProgram.get(key)){
                    System.out.println(navn);
                }
            }
        }
        System.out.println();
    }

    public void skrivUtAlleFagEnStudentTar(String studentNavn){
        ArrayList<String> fagTilEnStudnet = new ArrayList<String>();
        for(String key:emneProgram.keySet()){
            for(String navn: emneProgram.get(key)){
                if(navn.equals(studentNavn)){
                    fagTilEnStudnet.add(key);
                }
            }
        }
        for(String emneNavnene: fagTilEnStudnet){
            System.out.println(emneNavnene);
        }
        System.out.println();
    }

    public void leggTilNyFag(String nyfag){
        ArrayList<String> ny_fag_studnetNavn = new ArrayList<String>();
        emneProgram.put(nyfag,ny_fag_studnetNavn);
    }

    public void leggTilStudent(String fagNavn, String studenen){
        for(String key:emneProgram.keySet()){
            if(key.equals(fagNavn)){
                emneProgram.get(key).add(studenen);
            }
        }
    }

    public void fjerneFag(String fjern){
        emneProgram.remove(fjern);
    }

    public void fjerneStudent(String fagNavn, String studenen){
        for(String key:emneProgram.keySet()){
            if(key.equals(fagNavn)){
                emneProgram.get(key).remove(studenen);
            }
        }
    }

    public void avslutt(){
        System.exit(1);
    }

    public void skrivAlleFag(){
        for(String key:emneProgram.keySet()){
            System.out.println(key);
        }
    }
}
