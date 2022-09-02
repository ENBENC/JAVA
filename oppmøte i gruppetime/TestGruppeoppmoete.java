import java.io.FileNotFoundException;
class TestGruppeoppmoete{
    public static void main(String[] args) throws FileNotFoundException{
        Gruppeoppmoete gruppe1 = new Gruppeoppmoete(17,"gruppeliste.txt");
        gruppe1.register("Per");
        gruppe1.register("Geir");
        //gruppe1.skrivUtOppmote();
    }
}
