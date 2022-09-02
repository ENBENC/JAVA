class Prioritetskoe<T>{
    private class Node{
        T innhold; Node neste = null; int prioVerdi;
        public Node(T i,int p){
            innhold = i;
            prioVerdi = p;
        }
    }
    Node start = null;
    public void settInn(T inn, int prio){
        //hoyest prioritet, og skal settes paa forste plass
        Node nyNode = new Node(inn,prio);
        if(prio == 0){
            nyNode.neste = start;
            start = nyNode;
        }
        else{
            Node peker = start; Node forrige = null;
            Boolean put = false;
            while(peker != null && put == false ){
                if(peker.prioVerdi > prio){
                    nyNode.neste = peker;
                    forrige.neste = nyNode;
                    put = true;
                }
                forrige = peker;
                peker = peker.neste;
            }
            //Settes paa siste plass
            if(put == false){
                forrige.neste = nyNode;
            }
        }
    }
    public T taUt(){
        T verdi = start.innhold;
        start = start.neste;
        return verdi;
    }
    public int antall(){
        Node peker = start;
        int antall = 0;
        while(peker != null){
            peker = peker.neste;
            antall ++;
        }
        return antall;
    }
}
