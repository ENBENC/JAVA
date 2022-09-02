class MotorsykkelProgram{
    public static void main(String[] args){
        Motorsykkel motorsykkel1 = new Motorsykkel("12345");
        int indeks = 0;
        while(indeks < 5){
            motorsykkel1.kjor(10);
            indeks ++;
        }
        System.out.println("Motorsykkel1 har kjort: " + motorsykkel1.hentKilometerstand());
        Motorsykkel motorsykkel2 = new Motorsykkel("123456");
        Motorsykkel motorsykkel3 = new Motorsykkel("1234567");
        System.out.println("Motorsykkel3 har produksjonsnummer: " + motorsykkel3.hentProduksjonsnummer());
    }
}
