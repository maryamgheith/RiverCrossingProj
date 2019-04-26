package Objects;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import controller.*;

import javax.imageio.ImageIO;

public class Fox extends Carnivores {
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


	@Override
	public BufferedImage[] getImages() {
		BufferedImage[] images = new BufferedImage[1];
		images[0] = null;
		try {
			images[0] = ImageIO.read(new File("C://Users//Maryam Gheith//Downloads//RiverCrossingProj-master//River Crossing//src//GUI//fox.png"));
		} catch (IOException ex) {
			System.out.println("Image failed to load.");
		}
		return images;
	}

	@Override
	public ICrosser makeCopy() {
		return null;
	}
}
