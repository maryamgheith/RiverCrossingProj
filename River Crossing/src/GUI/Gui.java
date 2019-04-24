package GUI;
import java.awt.image.BufferedImage;
import java.io.File;
import Objects.*;
import javax.imageio.ImageIO;
import controller.*;

import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
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

public class Gui extends Application {
	
		@Override
		public void start(Stage primaryStage) {
			try {
		
				primaryStage.setTitle("Sup");
						  Group root = new Group();
						Scene scene = new Scene( root );
						primaryStage.setScene( scene );
					         
					    Canvas canvas = new Canvas( 1250, 720 );
					    root.getChildren().add( canvas );
					         
					    GraphicsContext graphics = canvas.getGraphicsContext2D();
					         
					    graphics.setFill( Color.RED );
					    graphics.setStroke( Color.BLACK );
					    graphics.setLineWidth(2);
					    Font theFont = Font.font( "Times New Roman", FontWeight.BOLD, 48 );
					    graphics.setFont( theFont );
					  //  graphics.fillText( "Hello, World!", 60, 50 );
					   // graphics.strokeText( "Hello, World!", 60, 50 );
					    Image background = new Image(getClass().getResource("background.jpg").toExternalForm());
					   // Image farmer = new Image(  );
					    graphics.drawImage( background, 0,0 );
					    Farmer farmer =new Farmer();
					    Image boatimg=new Image("file:boat.png");
					    ImageView boat = new ImageView(boatimg);
					boat.setImage(boatimg);
					boat.setLayoutX(400);
					boat.setLayoutY(511);
					boat.setFitHeight(150);
					boat.setFitWidth(200);
			
				     //   Image farmerimg=SwingFXUtils.toFXImage(farmer.getImages()[0],null);
	 				   // ImageView farmerv=new ImageView(farmerimg);
	 				   
	 				    ImageView boatv=new ImageView(boatimg);
	 				     boatv.setLayoutX(0);
	 				    boatv.setLayoutY(0);
	 				    
	 				    // farmerv.setOnMouseClicked(e->{
	 				  
	 				       
	 				       //  });
	 				      
					    primaryStage.show();
				

			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			launch();
		}
	}


