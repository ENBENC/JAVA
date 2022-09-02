class Main{
    public static void main(String[] args) {
        Katt katt1 = new Katt("Katt1", 1);
        Katt katt2 = new Katt("Katt2",2);
        if(katt1.compareTo(katt2) > 0){
            System.out.println(katt1.hentNavn() + " er storrest.");
        }
        else if(katt1.compareTo(katt2) < 0){
            System.out.println(katt2.hentNavn() + " er storrest.");
        }
        else if(katt1.compareTo(katt2) == 0){
            System.out.println("Kattene er like store.");
        }
    }
}
