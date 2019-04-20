package Objects;
import java.awt.image.BufferedImage;

import controller.*;

public abstract class  Carnivores implements ICrosser {

	public boolean canSail() {
		return false;
	}

	public int getEatingRank() {
		return 4;
	}

	public double getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	public BufferedImage[] getImages() {
		// TODO Auto-generated method stub
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
