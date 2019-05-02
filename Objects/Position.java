package Objects;

import controller.ICrosser;


import java.util.ArrayList;
import java.util.List;

public class Position {
ArrayList<ICrosser> rightList=new ArrayList<ICrosser>();
ArrayList<ICrosser> BoatCrosser=new ArrayList<ICrosser>();
ArrayList<ICrosser> leftList=new ArrayList<ICrosser>();

    public Position() {
      levelOneCrossingStrategy levelOneCrossingStrategy = new levelOneCrossingStrategy();
      rightList.addAll(levelOneCrossingStrategy.getInitialCrossers());
        System.out.println(rightList.size());
        System.out.println(rightList.get(0));
        System.out.println(rightList.get(1));
        System.out.println(rightList.get(2));
        System.out.println(rightList.get(3));
    }

    public ArrayList<ICrosser> getRightList() {
        return rightList;
    }

    public ArrayList<ICrosser> getBoatCrosser() {
        return BoatCrosser;
    }

    public ArrayList<ICrosser> getLeftList() {
        return leftList;
    }

    public void toboat(ICrosser crosser, double x) {
        System.out.println(crosser);
        if (rightList.contains(crosser) == true) {
            rightList.remove(crosser);
            System.out.println("a");
            System.out.println(rightList.get(0));
            BoatCrosser.add(crosser);
        } else if(BoatCrosser.contains(crosser))
            toside(crosser,x);
        else {
            System.out.println("b");
            leftList.remove(crosser);
            BoatCrosser.add(crosser);

        }
       System.out.println(BoatCrosser.size());
    }
        public void toside(ICrosser crosser , double x)
        {
            if(x==450)
            {System.out.println("c");
                BoatCrosser.remove(crosser);
            rightList.add(crosser);

        }
            else {
                System.out.println("d");
                BoatCrosser.remove(crosser);
                leftList.add(crosser);
            }

    }

}
