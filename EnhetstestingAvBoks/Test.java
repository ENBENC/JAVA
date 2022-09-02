class Test{
    public static void main(String[] args) {
        Boks boks1 = new Boks(1,2,3);
        System.out.println(test(boks1.beregnAreal(),22));
        System.out.println(test(boks1.beregnAreal(),21));

    }
    public static boolean test(int forventet_resultat,int faktisk_resultat){
        if(forventet_resultat != faktisk_resultat){
            return false;
        }
        else{
            return true;
        }
    }
}
