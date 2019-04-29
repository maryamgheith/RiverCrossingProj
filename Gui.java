package GUI;

import java.awt.image.BufferedImage;

import java.util.ArrayList;

import java.util.List;



import Objects.*;

import controller.*;

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

import javafx.scene.input.MouseEvent;

import javafx.stage.Stage;

import javafx.util.Duration;


//Esraa
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

			levelOneCrossingStrategy levelOneCrossingStrategy = new levelOneCrossingStrategy();
			Position p =new Position();
			ArrayList<ICrosser> crosserArrayList=new ArrayList<>();
			crosserArrayList.addAll(levelOneCrossingStrategy.getInitialCrossers());

			//ICrosserFactory factory = new ICrosserFactory();

			// farmer = crosserArrayList.get(0);
			System.out.println(crosserArrayList.get(0));

			BufferedImage[] farmerimgs = new BufferedImage[1];

			farmerimgs = crosserArrayList.get(0).getImages();

			Image farmerImg2 = SwingFXUtils.toFXImage(farmerimgs[0], null);

			ImageView imFarmer = new ImageView(farmerImg2);

			root.getChildren().add(imFarmer);

			imFarmer.setX(200);

			imFarmer.setY(300);

			//graphics.drawImage(farmerImg2, 200, 300);

			ICrosser goat = crosserArrayList.get(1);

			BufferedImage[] goatimgs = new BufferedImage[1];

			goatimgs = goat.getImages();

			Image goatImg2 = SwingFXUtils.toFXImage(goatimgs[0], null);

			//graphics.drawImage(goatImg2, 280, 300);

			ImageView imGoat = new ImageView(goatImg2);

			root.getChildren().add(imGoat);

			imGoat.setX(280);

			imGoat.setY(300);

			ICrosser plant = crosserArrayList.get(3);

			BufferedImage[] plantimg = new BufferedImage[1];

			plantimg = plant.getImages();

			Image plantImg2 = SwingFXUtils.toFXImage(plantimg[0], null);

			ImageView imPlant = new ImageView(plantImg2);

			root.getChildren().add(imPlant);

			imPlant.setX(380);

			imPlant.setY(250);

			//graphics.drawImage(plantImg2, 380, 250);

			ICrosser wolf = crosserArrayList.get(2);

			BufferedImage[] wolfimgs = new BufferedImage[1];

			wolfimgs = wolf.getImages();

			Image wolfImg2 = SwingFXUtils.toFXImage(wolfimgs[0], null);

			ImageView imWolf = new ImageView(wolfImg2);

			root.getChildren().add(imWolf);

			imWolf.setX(490);

			imWolf.setY(250);

			//graphics.drawImage(wolfImg2, 490, 250);

			Boat boat = new Boat();

			Image boatImg2 = boat.getImage();

			ImageView imBoat = new ImageView(boatImg2);

			root.getChildren().add(imBoat);

			imBoat.setX(450);

			imBoat.setY(350);

			//graphics.drawImage(boatimg, 450, 350);

			Bounds bounds = canvas.getBoundsInLocal();

			TranslateTransition translateTransition = new TranslateTransition(Duration.millis(400));

			TranslateTransition translateTransition1 = new TranslateTransition(Duration.millis(400));

			imFarmer.setOnMouseClicked(event -> {

				System.out.println("xxxxxxxx");

				translateTransition.setNode(imFarmer);

				imFarmer.setX(imFarmer.getX() + 400);

				translateTransition.setByY(0);
				p.toboat(crosserArrayList.get(0),imFarmer.getX());

				//translateTransition.play();

			});

			imBoat.setOnMouseClicked(event -> {
			if(levelOneCrossingStrategy.isValid(p.getRightList(),p.getLeftList(),p.getBoatCrosser())==true) {
				System.out.println(levelOneCrossingStrategy.isValid(p.getRightList(),p.getLeftList(),p.getBoatCrosser()));

				if (imBoat.getX() >= 460.0) {

					translateTransition.setNode(imBoat);

					translateTransition.setByX(-400);

					//translateTransition.play();

					imBoat.setX(imBoat.getX() - 400);


				} else {


					System.out.println("xxx");

					translateTransition.setNode(imBoat);

					//translateTransition1.setNode(imFarmer);

					//translateTransition.play();

					//translateTransition1.play();

					//imFarmer.setX(imFarmer.getX()+300);

					imBoat.setX(imBoat.getX() + 400);

					imFarmer.setX(imFarmer.getX() + 400);


				}
			}


			});



				/*imBoat.setFitHeight(200);

				imBoat.setFitWidth(300);

			TranslateTransition trans = new TranslateTransition();

			trans.setNode(imBoat);*/

			/*imFarmer.setOnMouseClicked((e)-> {

					Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3),

							new KeyValue(imFarmer.layoutXProperty(), bounds.getMaxX() - imFarmer.getFitWidth())));

					timeline.setCycleCount(Timeline.INDEFINITE);

					timeline.play();

				*//*trans.setDuration(Duration.seconds(1));

				trans.setByX(100);

				trans.setByY(0);

				trans.play();*//*

			});*/primaryStage.show();

		}

		catch (Exception e) {

			e.printStackTrace();



		}

	}



	private void mouseEventOnScene(MouseEvent evt) {



	}



	public static void main (String[]args){



		launch(args);

	}

}

