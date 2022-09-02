import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

public class Generator extends Application{
    @Override
    public void start(Stage stage){
        String navn = "",invNavn = "",hilsen = "",adress = "",svardato = "";
        //Velger filer som inneholder alle informasjonene
        File file = new FileChooser().showOpenDialog(stage);
        try{
            Scanner fraFil = new Scanner(file);
            navn = fraFil.nextLine().trim(); invNavn = fraFil.nextLine().trim(); hilsen = fraFil.nextLine().trim();
            adress = fraFil.nextLine().trim(); svardato = fraFil.nextLine().trim();
        }
        catch (FileNotFoundException e) {
            System.out.println("No file found");
        }
        //Her lages teksten til invitasjonene, og setter storrlsen.
        Text hostNavnLinje = new Text("Host navn: " + navn);
        hostNavnLinje.setFont(new Font(40));

        Text invitasjonLinje = new Text("Vi inviterer: " + invNavn);
        invitasjonLinje.setFont(new Font(40));

        Text hilsenLinje = new Text(hilsen);
        hilsenLinje.setFont(new Font(40));

        Text adressLinje = new Text("Adressen: " + adress);
        adressLinje.setFont(new Font(40));

        Text svarDatoLinje = new Text("Svar dato av invitasjonen : " + svardato);
        svarDatoLinje.setFont(new Font(40));

        //Definer en rutenett
        GridPane rutenett = new GridPane();
        rutenett.add(hostNavnLinje,1,1);
        rutenett.add(invitasjonLinje,1,2);
        rutenett.add(hilsenLinje,1,3);
        rutenett.add(adressLinje,1,4);
        rutenett.add(svarDatoLinje,1,5);
        rutenett.setLayoutX(0);
        rutenett.setLayoutY(0);

        //Definerer Scene
        Scene scene = new Scene(rutenett);
        //Definerer innholdet i Stage
        stage.setTitle("Invitasjon");
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args) {
        //Henter ut alle informasjonene som input, og lage informasjonene i invitasjon.txt
        String navn = "",invNavn = "",hilsen = "",adress = "",svardato = "";
        try{
            Scanner lesInput = new Scanner(System.in);
            System.out.println("Skriv navnet til hosten: ");
            navn = lesInput.nextLine();
            System.out.println("Skriv navnet til den du onsker aa inviterer: ");
            invNavn = lesInput.nextLine();
            System.out.println("Skriv en hilse: ");
            hilsen = lesInput.nextLine();
            System.out.println("Skriv en adress: ");
            adress = lesInput.nextLine();
            System.out.println("Skriv svar dato: ");
            svardato = lesInput.nextLine();
            lesInput.close();
        }
        catch (Exception e) {
        }
        String[] informasjonene = {navn,invNavn,hilsen,adress,svardato};
        try {
            PrintWriter utfil = new PrintWriter("invitasjon.txt");
            for (String tekst : informasjonene) {
                utfil.println(tekst);
            }
            utfil.close();
        } catch(Exception e) {
        }

        Application.launch();
    }
}
