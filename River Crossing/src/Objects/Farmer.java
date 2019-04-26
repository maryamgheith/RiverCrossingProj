package Objects;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import controller.*;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;

import javax.imageio.ImageIO;

import static javax.imageio.ImageIO.read;

public class Farmer implements ICrosser {
	double x;
	double y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public boolean canSail() {
		return true;
	}

	public int getEatingRank() {
		return 10;
	}

	public BufferedImage[] getImages() throws IOException {
		BufferedImage[] images = new BufferedImage[1];
		images[0] = null;
		try {
			images[0] = ImageIO.read(new File("C://Users//Maryam Gheith//Downloads//RiverCrossingProj-master//River Crossing//src//GUI//farmer.png"));
		} catch (IOException ex) {
			System.out.println("Image failed to load.");
		}

		/*WritableImage wr = null;
		if (images[0] != null) {
			wr = new WritableImage(images[0].getWidth(), images[0].getHeight());
			PixelWriter pw = wr.getPixelWriter();
			for (int x = 0; x < images[0].getWidth(); x++) {
				for (int y = 0; y < images[0].getHeight(); y++) {
					pw.setArgb(x, y, images[0].getRGB(x, y));
				}
			}

		}*/
		return images;
	}


		public ICrosser makeCopy () {
			// TODO Auto-generated method stub
			return null;
		}

		public void setLabelToBeShown (String label){
			// TODO Auto-generated method stub

		}

		public String getLabelToBeShown () {
			// TODO Auto-generated method stub
			return null;
		}

		public double getWeight () {
			// TODO Auto-generated method stub
			return 0;
		}


	}

