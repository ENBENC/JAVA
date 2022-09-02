import java.util.HashMap;
class TestFinnStudent{
    public static void main(String[] args) {
        HashMap studenter = new HashMap();
        for(String navn:studenter.keySet()){
            System.out.println(navn);
        }
        for(Student s:studenter.values()){
            System.out.println(s.toSting());
        }
    }
}
