import java.util.Iterator;
class Butikk implements Iterable<Person>{
    private Person start;
    public Butikk(){
        start = null;
    }

    public Iterator<Person> iterator(){
        return new PersonIterator(this);
    }

    private class PersonIterator implements Iterator<Person>{
        private Butikk denneButikk;
        private Person dennePerson;
        public PersonIterator(Butikk b){
            denneButikk = b;
            dennePerson= denneButikk.start;
        }
        public boolean hasNext(){//returner true hvis interrasjon har flere element.
            if(dennePerson != null){
                return true;
            }
            else{
                return false;
            }
        }
        public Person next(){
            Person returnPerson = dennePerson;
            dennePerson = dennePerson.hentNestePerson();
            return returnPerson;//returner den neste element i interrasjon.
        }
    }

    public void entreButikk(Person p){
        if(start == null){//dersom det er ingen i kø.
            start = p;
        }
        else if(start.hentNestePerson() == null){//Dersom det er en i kø.
            start.settNeste(p);
        }
        else{
            Person person = start;
            Person forrige = null;
            while(person != null){
                forrige = person;
                person = person.hentNestePerson();
            }
            forrige.settNeste(p);
        }
    }

    public void kassa(){
        Person betjenePerson = start;
        while(betjenePerson != null){
            System.out.println(betjenePerson);//Person objekt har en toString metode.
            System.out.println("-Hade bra!");
            betjenePerson = betjenePerson.hentNestePerson();
        }
        System.out.println("Ingen flere kunder. Vi stenger butikken for i dag.");
    }
}
