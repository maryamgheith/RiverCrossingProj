package GUI;

import javafx.animation.TranslateTransition;
import javafx.util.Duration;

public class GuiMethods {
	public void onclickfarmer(){
		TranslateTransition trans = new TranslateTransition();
		
			trans.setDuration(Duration.seconds(1));
			trans.setByX(100);
			trans.setByY(0);
			trans.play();
		
	}

}
