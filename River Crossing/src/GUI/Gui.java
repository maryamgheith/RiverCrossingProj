package GUI;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import Objects.*;
import javax.imageio.ImageIO;
import controller.*;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Gui extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {

			primaryStage.setTitle("Sup");
			Group root = new Group();
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);

			Canvas canvas = new Canvas(1500, 600);
			root.getChildren().add(canvas);

			GraphicsContext graphics = canvas.getGraphicsContext2D();
			Image background = new Image(getClass().getResource("background2.jpg").toExternalForm());
			graphics.drawImage(background, 0, 0);
			ICrosserFactory factory = new ICrosserFactory();
			ICrosser farmer = factory.getCrosser("Farmer");
			BufferedImage[] farmerimgs = new BufferedImage[1];
			farmerimgs = farmer.getImages();
			Image farmerImg2 = SwingFXUtils.toFXImage(farmerimgs[0], null);
			graphics.drawImage(farmerImg2, 200, 300);
			ICrosser goat = factory.getCrosser("goat");
			BufferedImage[] goatimgs = new BufferedImage[1];
			goatimgs = goat.getImages();
			Image goatImg2 = SwingFXUtils.toFXImage(goatimgs[0], null);
			graphics.drawImage(goatImg2, 280, 300);
			ICrosser plant = factory.getCrosser("plant");
			BufferedImage[] plantimg = new BufferedImage[1];
			plantimg = plant.getImages();
			Image plantImg2 = SwingFXUtils.toFXImage(plantimg[0], null);
			graphics.drawImage(plantImg2, 380, 250);
			ICrosser wolf = factory.getCrosser("wolf");
			BufferedImage[] wolfimgs = new BufferedImage[1];
			wolfimgs = wolf.getImages();
			Image wolfImg2 = SwingFXUtils.toFXImage(wolfimgs[0], null);
			graphics.drawImage(wolfImg2, 490, 250);
			Boat boat = new Boat();
			Image boatimg = boat.getImage();
			graphics.drawImage(boatimg, 450, 350);
			ImageView imBoat = new ImageView();
			imBoat.setImage(boatimg);
				Bounds bounds = canvas.getBoundsInLocal();
				/*im.setOnMouseClicked(e->{
					Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3),
							new KeyValue(im.layoutXProperty(), bounds.getMaxX() - im.getFitWidth())));
					timeline.setCycleCount(2);
					timeline.play();
				});*/
				imBoat.setFitHeight(200);
				imBoat.setFitWidth(300);
			TranslateTransition trans = new TranslateTransition();
			trans.setNode(imBoat);
			imBoat.setOnMouseClicked((e)-> {
				trans.setDuration(Duration.seconds(1));
				trans.setByX(100);
				trans.setByY(0);
				trans.play();
			});

			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main (String[]args){

		launch(args);
	}
}


