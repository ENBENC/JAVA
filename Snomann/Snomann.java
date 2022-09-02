import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
public class Snomann extends Application{
    public void start(Stage teater){

        //Gjøre klar alle kroppsdelene til snømannen.
        Circle body1 = new Circle(100);
        body1.setCenterX(1000);body1.setCenterY(1000);
        body1.setFill(Color.WHITE);
        body1.setStroke(Color.BLACK);
        Circle body2 = new Circle(75);
        body2.setCenterX(1000);body2.setCenterY(950);
        body2.setFill(Color.WHITE);
        body2.setStroke(Color.BLACK);
        Circle body3 = new Circle(5);
        body3.setCenterX(1000);body3.setCenterY(912.5);
        body3.setFill(Color.WHITE);
        body3.setStroke(Color.BLACK);

        Circle eye1 = new Circle(10);
        eye1.setFill(Color.BLACK);
        eye1.setCenterX(985);eye1.setCenterY(897.5);
        Circle eye2 = new Circle(10);
        eye2.setFill(Color.BLACK);
        eye2.setCenterX(1015);eye2.setCenterY(897.5);

        Rectangle mouth = new Rectangle(5,3);
        mouth.setFill(Color.YELLOW);
        mouth.setX(997.5);mouth.setY(895);

        //Setter opp kulisser
        Pane kulisser = new Pane();
        kulisser.getChildren().addAll(body1,body2,body3,eye1,eye2,mouth);

        //Setter opp scene
        Scene scene = new Scene(kulisser);

        //Setter opp hele teater
        teater.setTitle("Snomann");
        teater.setScene(scene);
        teater.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
