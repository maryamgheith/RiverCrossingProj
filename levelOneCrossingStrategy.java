package Objects;

import controller.ICrosser;
import controller.ICrosserFactory;
import controller.ICrossingStrategy;
import controller.IRiverCrossingController;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class levelOneCrossingStrategy implements ICrossingStrategy, IRiverCrossingController {
    private boolean carnivore;
    private boolean herbivore;
    private double x;
    private double y;
    @Override
    public boolean isValid(List<ICrosser> right, List<ICrosser> left, List<ICrosser> boatRiders) {
        int sizeRight = right.size();
        int sizeLeft = left.size();
        int sizeBoatRiders = boatRiders.size();
        if(boatRiders.size()==2)
        {
            int check = boatRiders.get(0).getEatingRank()-boatRiders.get(1).getEatingRank();
            if(check==1||check==-1)
                return false;
        }
        if(boatRiders.size()==1)
        {
            if(boatRiders.get(0).canSail()== false)
                return false;
        }
        if(right.size()==2)
        {
            int check = right.get(0).getEatingRank()-right.get(1).getEatingRank();
            if(check==1||check==-1)
                return false;
        }
        if(left.size()==2)
        {
            int check = left.get(0).getEatingRank()-left.get(1).getEatingRank();
            if(check==1||check==-1)
                return false;
        }
        return true;
    }

    @Override
    public List<ICrosser> getInitialCrossers() {
        List<ICrosser> initialCrossers = new ArrayList<ICrosser>();
        ICrosserFactory factory = new ICrosserFactory();
        ICrosser farmer = factory.getCrosser("farmer");
        ICrosser goat = factory.getCrosser("goat");
        initialCrossers.add(farmer);
        initialCrossers.add(goat);
        return initialCrossers;
    }

    @Override
    public void newGame(ICrossingStrategy gameStrategy) {

    }

    @Override
    public void resetGame() {

    }

    @Override
    public String[] getInstructions() {
        return new String[0];
    }

    @Override
    public List<ICrosser> getCrossersOnRightBank() {
        return null;
    }

    @Override
    public List<ICrosser> getCrossersOnLeftBank() {
        return null;
    }

    @Override
    public boolean isBoatOnTheLeftBank() {
        return false;
    }

    @Override
    public int getNumberOfSails() {
        return 0;
    }

    @Override
    public boolean canMove(List<ICrosser> crossers, boolean fromLeftToRightBank) {
        if(crossers.isEmpty()||crossers.contains("farmer"))
        return false;
    }

    @Override
    public void doMove(List<ICrosser> crossers, boolean fromLeftToRightBank) {

    }

    @Override
    public boolean canUndo() {
        return false;
    }

    @Override
    public boolean canRedo() {
        return false;
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }

    @Override
    public void saveGame() {

    }

    @Override
    public void loadGame() {

    }

    @Override
    public List<List<ICrosser>> solveGame() {
        return null;
    }
}
