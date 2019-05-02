package Objects;

import controller.ICrosser;

import java.awt.image.BufferedImage;

public abstract class Carnivores implements ICrosser {
    @Override
    public boolean canSail() {
        return false;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public int getEatingRank() {
        return 4;
    }

    @Override
    public abstract BufferedImage[] getImages();

    @Override
    public abstract ICrosser makeCopy();

    @Override
    public void setLabelToBeShown(String label) {

    }

    @Override
    public String getLabelToBeShown() {
        return null;
    }
}
