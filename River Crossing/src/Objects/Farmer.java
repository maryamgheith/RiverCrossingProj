package Objects;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import controller.*;
public class Farmer implements ICrosser {
	
	public boolean canSail() {
		return true;
	}
	public int getEatingRank() {
		return 10;
	}

	public BufferedImage[] getImages() {
	int x =4;
	BufferedImage[] bimg= new BufferedImage[x];
	bimg[0]=null;
	try {
		bimg[0]=ImageIO.read(new File("farmer.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	bimg[1]=null;
	try {
		bimg[1]=ImageIO.read(new File("farmer.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	bimg[2]=null;
	try {
		bimg[2]=ImageIO.read(new File("farmer.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	bimg[3]=null;
	try {
		bimg[3]=ImageIO.read(new File("farmer.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return bimg;
	}

	public ICrosser makeCopy() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setLabelToBeShown(String label) {
		// TODO Auto-generated method stub
		
	}

	public String getLabelToBeShown() {
		// TODO Auto-generated method stub
		return null;
	}

	public double getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}


}
