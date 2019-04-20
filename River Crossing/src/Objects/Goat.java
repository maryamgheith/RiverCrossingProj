package Objects;

import java.awt.image.BufferedImage;

import controller.ICrosser;

public class Goat extends Herbivores {

	public boolean canSail() {
		return false;
	}

	public double getWeight() {
		return 0;
	}

	public int getEatingRank() {
		return 3;
	}

	public BufferedImage[] getImages() {
		return null;
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

}
