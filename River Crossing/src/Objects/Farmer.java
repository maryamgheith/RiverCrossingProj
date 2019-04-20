package Objects;
import java.awt.image.BufferedImage;

import controller.*;
public class Farmer implements ICrosser {
	
	public boolean canSail() {
		return true;
	}
	public int getEatingRank() {
		return 10;
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

	public double getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}


}
