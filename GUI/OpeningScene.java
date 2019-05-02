package GUI;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class OpeningScene extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Welcome to RiverCrossing Game");
        Group root1 = new Group();
        Scene scene1 = new Scene(root1);
        primaryStage.setScene(scene1);
        Canvas canvas1 = new Canvas(1500, 600);
        root1.getChildren().add(canvas1);
        GraphicsContext graphics1 = canvas1.getGraphicsContext2D();
        Image background = new Image(getClass().getResource("background2.jpg").toExternalForm());
        graphics1.drawImage(background, 0, 0);
        Button Level1 = new Button("level1");

    }

}
