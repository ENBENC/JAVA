import java.util.HashMap;
class FinnStudent{
    private HashMap<String,boolean> studenter;
    public FinnStudent(){
        studenter = new HashMap<String,boolean>();
    }

    public void settInn(String navn){
        studenter.put(navn,true);
    }

    public void skrivUt(){
        for(int i=0;i < studenter.size();i++){
            System.out.println(studenter.get(i));
        }
    }

    public boolean finnStudent(String navn){
        if(studenter.containskey(navn) == true){
            return true;
            }
        else{
            return false;
            }
    }

}
