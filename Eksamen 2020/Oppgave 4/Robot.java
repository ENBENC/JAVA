import java.util.Random;
class Robot implements Brukergrensesnitt{
    private static int robotNummer = 0;
    private Random random = new Random();
    private String navn;
    public Robot(){
        navn = "Robot "+ robotNummer;
        robotNummer++;
    }
    public void giStatus(String status){
        System.out.println("Status: " + navn);
        System.out.println(status+"\n");
    }
    public int beOmKommando(String spoersmaal, String[] alternativer){
        System.out.println("---------------------------------------------");
        System.out.println(spoersmaal);
        int tilfeldig_tall = random.nextInt(alternativer.length);
        return tilfeldig_tall;
    }
    public String hentNavn(){
        return navn;
    }
}
