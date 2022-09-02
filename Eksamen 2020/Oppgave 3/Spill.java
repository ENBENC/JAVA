//Oppgave3
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import  javafx.scene.text.Font;
import javafx.scene.layout.VBox;
import javafx.event.*;

import java.util.Scanner;
import java.io.FileNotFoundException;
public class Spill extends Application{
    static final String stederFil = "steder.txt";
    static final String gjenstanderFil = "gjenstander.txt";
    static final int totalTrekk = 3;

    //Knapp funksjon, som stopper programet
    class AvsluttHandler implements EventHandler<ActionEvent>{
        Thread traad;
        public AvsluttHandler(Thread t){
            traad = t;
        }
        @Override
        public void handle(ActionEvent e){
            Platform.exit();
            traad.interrupt();
        }
    }
    //En traad som stopper programmet, 5 sekunder etter traaden starter
    class StoppVindu implements Runnable{
        public void run(){
            try{
                Thread.sleep(5000);
            }
            catch (InterruptedException e) {
            }
            Platform.exit();
        }
    }

    @Override
    public void start(Stage stage){
        System.out.println("Her starter spillet");
        Terreng terreng = new Terreng();

        Scanner lesInput = new Scanner(System.in);
        Terminal terminal  = new Terminal(lesInput);
        Spiller spiller = new Spiller(terreng.hentStart(),terminal,"Spilleren 1");
        Spiller[] alleSpiller = {spiller};

        int trekkIgjen = totalTrekk;
        if(totalTrekk > 40){
            System.out.println("Spillet kan ikke ha over 40 trekk");
            System.exit(0);
        }
        while(trekkIgjen > 0){
            System.out.println("---------------------------------------------");
            System.out.println("Trekk igjen: " + trekkIgjen);
            spiller.nyttTrekk();
            trekkIgjen--;
        }
        //Finner vinneren
        int storstFormue = alleSpiller[0].hentFormue(); Spiller vinner = alleSpiller[0];
        for (int i = 0;i<alleSpiller.length;i++) {
            if(alleSpiller[i].hentFormue()>storstFormue){
                storstFormue = alleSpiller[i].hentFormue();
                vinner = alleSpiller[i];
            }
        }
        //Lage resultat tekst
        String tekst = "Vinneren(Resultat): " + "\n"+
                        "Navn: " + vinner.hentNavnSpiller() +"\n"+
                        "Formue: " + vinner.hentFormue();
        Font font = new Font(30);
        Text t = new Text(tekst);
        t.setFont(font);
        VBox vbox = new VBox(10);
        vbox.setPrefSize(300,250);
        vbox.getChildren().add(t);
        //Lage en traad
        StoppVindu stopp = new StoppVindu();
        Thread traad = new Thread(stopp);
        //Lage avsluttKnapp
        AvsluttHandler avslutt = new AvsluttHandler(traad);
        Button avsluttKnapp = new Button("Avslutt");
        avsluttKnapp.setOnAction(avslutt);
        avsluttKnapp.setFont(font);
        vbox.getChildren().add(avsluttKnapp);

        Scene scene = new Scene(vbox);
        stage.setTitle("Resultat");
        stage.setScene(scene);
        //Traaden starter rett foer vinduet starter
        traad.start();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
