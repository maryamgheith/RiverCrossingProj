package controller;
import java.awt.image.BufferedImage;
import java.io.IOException;


public interface ICrosser {
	public boolean canSail();
	public double getWeight();
	public int getEatingRank();
	public BufferedImage[] getImages() throws IOException;
	public ICrosser makeCopy();
	public void setLabelToBeShown(String label);
	public String getLabelToBeShown();

}
