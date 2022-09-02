import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import javafx.event.*;

import java.io.File;

public class Bildeleser extends Application{
    @Override
    public void start(Stage stage){
        File file = new FuleChooser().showOpenDialog(stage);
        try {
            Scanner lesFil = new Scanner(file);

        } catch(Exception e) {
        }
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
