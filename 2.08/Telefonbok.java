import java.util.ArrayList;
import java.util.HashMap;
class Telefonbok{
    public static void main(String[] args){
        Person person1 = new Person("Mats","12123","Oslo");
        Person person2 = new Person("LJH","1212232","Moss");
        Person person3 = new Person("T","999090","Hamar");
        Person[] personer = new Person[10];
        personer[0] = person1;
        personer[1] = person2;
        personer[2] = person3;
        ArrayList<Person> personerlist = new ArrayList<Person>();
        personerlist.add(person1);
        personerlist.add(person2);
        personerlist.add(person3);

        HashMap<String,Person> personerHashMap = new HashMap<String,Person>();
        personerHashMap.put("Mats",person1);
        personerHashMap.put("LJH",person2);
        personerHashMap.put("T",person3);

        for(Person p:personer){
            if(p != null){
                p.skrivInfo();
            }
        }
        for(Person p:personerlist){
            p.skrivInfo();
        }
        for(Person p:personerHashMap.values()){
            p.skrivInfo();
        }
    }
}
