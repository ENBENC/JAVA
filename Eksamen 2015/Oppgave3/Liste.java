class Liste <T extends Comparable<T>>{
    private Node foran;
    private class ListeEnde extends Node{
        //Oppgave c
        boolean start;
        ListeEnde(T nyttObjekt,boolean erStart){
            super(nyttObjekt);
            start = erStart;
        }
        @Override
        int sammenlign(Node k){
            if(start == true){
                return -1;
            }
            else{
                return 1;
            }
        }
        @Override
        void skriv(){
            if(start == false){

            }
            else{
                super.skriv();
            }
        }
    }
    private class Node{
        protected T t;
        protected Node neste;
        Node(T nyttObjekt){
            t = nyttObjekt;
        }
        int sammenlign(Node k){
            //Oppgave a
            return t.compareTo(k.t);
        }
        void settInn(Node ny){
            //Oppgave b
            if(neste == null){
                return;
            }
            if(neste.sammenlign(ny) > 0){
                ny.neste = neste;
                neste = ny;
            }
            else{
                neste.settInn(ny);
            }
        }
        void skriv(){
            System.out.println(t);
            neste.skriv();
        }
    }
    Liste(){
        //Oppgave d
        ListeEnde start = new ListeEnde(null,true);
        ListeEnde slutt = new ListeEnde(null,false);
        foran = start;
        foran.neste = slutt;
    }
    public void settInn(T t){
        Node nyNode = new Node(t);
        foran.settInn(nyNode);
    }
    public void skrivAlle(){
        System.out.println("Alle i lista: \n" + "---");
        foran.skriv();
        System.out.println("----SLUTT");
    }
}
