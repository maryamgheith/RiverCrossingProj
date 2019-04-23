package GUI;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
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

public class Gui extends Application{
	
		@Override
		public void start(Stage primaryStage) {
			try {
		
				primaryStage.setTitle("Sup");
						  Group root = new Group();
						Scene scene = new Scene( root );
						primaryStage.setScene( scene );
					         
					    Canvas canvas = new Canvas( 600, 600 );
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
					    graphics.drawImage( background, 8,8 );
					    Farmer farmer =new Farmer(new Image(getClass().getResource("farmer.png").toExternalForm()),0,0);
					    ImageView imageee=new ImageView ();
				        
				        		 
	 				         farmer.render(graphics,imageee);
	 				        
	 				         scene.setOnMouseClicked(e->{
	 				  	farmer.remove(imageee);
	 				        	 Farmer Farmer =new Farmer(new Image(getClass().getResource("farmer.png").toExternalForm()),100,0);
	 				        Farmer.render(graphics,imageee);
	 				         });
	 				        new AnimationTimer() {
	 							@Override
	 							public void handle(long now) {
	 								
	 							}
	 						}.start();
					    primaryStage.show();
				

			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			launch();
		}
	}



