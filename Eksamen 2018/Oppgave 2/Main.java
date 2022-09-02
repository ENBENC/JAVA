class Main{
    public static void main(String[] args) {
            Prioritetskoe<String> liste = new Prioritetskoe<String>();
            liste.settInn("int 0",0);
            liste.settInn("int 0",0);

            liste.settInn("int 2",2);
            liste.settInn("int 2",2);
            liste.settInn("int 2",2);
            liste.settInn("int 2",2);
            liste.settInn("int 0",0);

            liste.settInn("int 1",1);
            liste.settInn("int 2",2);
            liste.settInn("int 1",1);
            liste.settInn("int 3",3);
            liste.settInn("int 1",1);

            System.out.println(liste.antall());
            int antall = liste.antall();
            for (int i =0;i< antall ;i++ ) {
                System.out.println(liste.taUt());
            }

    }
}
