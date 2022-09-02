class Main{
    public static void main(String[] args) {
        System.out.println(1%2);
        //skrivUtBinaer(0);
    }
    static void skrivUtBinaer(int n){
        if(n == 0){
            System.out.println(0);
            return;
        }
        else{
            skrivUtBinaer(n/2);//heltall divisjon med 2.
            System.out.print(n%2);
        }
    }
}
